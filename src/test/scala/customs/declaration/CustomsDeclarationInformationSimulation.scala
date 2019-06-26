package customs.declaration

import customs.declaration.DeclarationSubmission._
import uk.gov.hmrc.performance.simulation.PerformanceTestRunner

class CustomsDeclarationSimulation extends PerformanceTestRunner {

  setup("submit-declarations-information", "Declaration Information") withRequests submitDeclarationInformation

  runSimulation()
}
