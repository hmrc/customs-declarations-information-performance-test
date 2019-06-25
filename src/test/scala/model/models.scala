package model

sealed abstract class User(val token: String, val version: String){
}

sealed case class Csp(override val version: String) extends User("CSP", version)
