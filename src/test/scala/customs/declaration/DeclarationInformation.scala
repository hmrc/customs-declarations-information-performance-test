package customs.declaration

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder
import model.{Csp, User}
import uk.gov.hmrc.performance.conf.ServicesConfiguration
import utility.TestData._

object DeclarationSubmission extends ServicesConfiguration {

  private def declarationInformation(user: User): HttpRequestBuilder = http("Submit Declaration Information")
    .get(s"$apiBaseUrl/status-request/mrn/mrn_creationDateAgeInDays-10_acceptanceDateAgeInDays-10_tradeMovementType-IM_procedureCategory-00_badgeId-BADGE12345_tbPartyType-false_excludeFields-")
    .headers(headers(user))
    .check(status.is(successfulDeclarationInformationCode))

  def submitDeclarationInformation = declarationInformation(Csp("1.0"))

}
