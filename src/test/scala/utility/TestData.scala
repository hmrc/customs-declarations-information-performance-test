package utility

import customs.declaration.DeclarationSubmission.baseUrlFor
import model.User

object TestData {

  def headers(user: User): Map[String, String] = Map(
    "Accept" -> s"application/vnd.hmrc.${user.version}+xml",
    "Content-Type" -> "application/xml; charset=UTF-8",
    "Authorization" -> s"Bearer ${user.token}",
    "X-Client-ID" -> "d65f2252-9fcf-4f04-9445-5971021226bb",
    "X-Badge-Identifier" -> "GAU123"
  )

  val successfulDeclarationInformationCode = 200

  val authBaseUrl = baseUrlFor("auth")
  val apiBaseUrl = baseUrlFor("customs-declarations-information")

}
