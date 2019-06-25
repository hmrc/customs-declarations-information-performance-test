package model

sealed abstract class User(val token: String, val version: String){
  require(Seq("CSP").contains(token))
  require(Seq("1.0").contains(version))
}

sealed case class Csp(override val version: String) extends User("CSP", version)
