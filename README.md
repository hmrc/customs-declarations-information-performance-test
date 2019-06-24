# customs-declarations-information-performance-test

Performance tests for the `customs-declarations-information` service.

To run tests locally: 

    sbt -Djava.io.tmpdir=${WORKSPACE}/tmp -DrunLocal=true test 

To run a smoke test locally: 

    sbt -Dperftest.runSmokeTest=true -Djava.io.tmpdir=${WORKSPACE}/tmp -DrunLocal=true test

To run against deployed applications in a managed environment (e.g. staging etc) replace `-DrunLocal=true` with `-DrunLocal=false` in above examples.  

[For more details about configuring or running](https://github.com/hmrc/performance-test-runner)
