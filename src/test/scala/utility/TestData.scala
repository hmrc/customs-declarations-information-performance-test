package utility

import customs.declaration.DeclarationSubmission.baseUrlFor
import model.User

object TestData {

  def headers(user: User): Map[String, String] = Map(
    "Accept" -> s"application/vnd.hmrc.${user.version}+xml",
    "Content-Type" -> "application / xml",
    "Authorization" -> s"Bearer ${user.token}",
    "X-Client-ID" -> "ZOMRiiBBRIE8cBH9uLI1PpZtE4ga",
    "X-Badge-Identifier" -> "BADGE12345"
  )

  val successfulDeclarationInformationCode = 200

  val authBaseUrl = baseUrlFor("auth")
  val apiBaseUrl = baseUrlFor("customs-declarations-information")

}
