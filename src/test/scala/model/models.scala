package model

sealed abstract class User(val token: String, val version: String){
  require(Seq("CSP", "Non CSP").contains(token))
  require(Seq("1.0", "2.0", "3.0").contains(version))
}

sealed case class Csp(override val version: String) extends User("CSP", version)
sealed case class NonCsp(override val version: String) extends User("Non CSP", version)
