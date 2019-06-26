package utility

import java.util.concurrent.ConcurrentHashMap

import io.gatling.commons.validation.{Failure, Success}
import io.gatling.core.Predef.{exec, _}
import io.gatling.core.structure.ChainBuilder

import scala.collection.JavaConverters._
import scala.collection.concurrent

object SessionUtil {

  val key = "bearerToken"
  val sharedSessionMap: concurrent.Map[String, String] = new ConcurrentHashMap[String, String]().asScala
  sharedSessionMap.put(key, "NOT_SET")


  def updateCache(): ChainBuilder = exec {
    session =>
      session(key).validate[String] match {
        case Success(value) =>
          sharedSessionMap.put(key, value)
        case Failure(error) => throw SessionAttributeNotFound(s"Session Attribute $key not found in Gatling Session.\n Exception from Gatling: $error")
      }
      session
  }

  def initSessionFromCache(wait: Boolean): ChainBuilder = exec {
    session => {
      var count = 0
      while (wait && sharedSessionMap.get(key).contains("NOT_SET") && count < 10) {
        Thread.sleep(1000)
        count += 1
      }

      sharedSessionMap.get(key) match {
        case Some(value) => session.set(key, value)
        case None => session
      }
    }
  }

  case class SessionAttributeNotFound(message: String) extends Exception(message)

}
