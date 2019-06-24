package utility

import customs.declaration.DeclarationSubmission.baseUrlFor
import model.User

object TestData {

  def headers(user: User): Map[String, String] = Map(
    "Accept" -> s"application/vnd.hmrc.${user.version}+xml",
    "Content-Type" -> "application / xml",
    "Authorization" -> s"Bearer ${user.token}",
    "X-Client-ID" -> "d65f2252-9fcf-4f04-9445-5971021226bb",
    "X-Badge-Identifier" -> "BADGE12345"
  )

  val successfulDeclarationInformationCode = 202

  val authBaseUrl = baseUrlFor("auth")
  val apiBaseUrl = baseUrlFor("customs-declarations-information")

}
