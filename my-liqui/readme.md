### Using liquibase

#### Added the following plugin:
id 'org.liquibase.gradle' version '2.2.0'

#### Added the following dependencies:
liquibaseRuntime 'info.picocli:picocli:4.6.1'
liquibaseRuntime 'org.liquibase:liquibase-core'
liquibaseRuntime 'org.postgresql:postgresql'

* `./gradlew generateChangelog`