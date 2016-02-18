# spock-mockito-jacoco

1. `$ ./gradlew test`
1. `$ ./gradlew jacocoTestReport`

Then you can check:
- the test results on `./build/reports/test/index.html`
- the coverage on `./build/reports/jacoco/test/html/index.html`

Notes: The coverage may drop when you remove some expectations.
