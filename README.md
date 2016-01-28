# template-java-project
Template for an Open Source Java project

[![License](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg)](LICENSE)<br/>
[![Build Status](https://travis-ci.org/pascalpoizat/template-java-project.svg?branch=master)](https://travis-ci.org/pascalpoizat/template-java-project)
[![Coverage Status](https://coveralls.io/repos/pascalpoizat/template-java-project/badge.svg?branch=master&service=github)](https://coveralls.io/github/pascalpoizat/template-java-project?branch=master)
[![SonarQube Technical Debt](https://img.shields.io/badge/technical%20debt-0.0%-brightgreen.svg)](http://localhost:9000/dashboard/index/fr.uparis10.pascalpoizat:template-java-project)

## dependencies

All the following dependencies are free provided your project is Open Source.

- Source repository and VCS

    We use [GitHub](https://github.com/).
    Of course you can use another VCS here.
    What is nice with GitHub is the integration with Travis CI (see below).
    So here you only have to create a repository.

- Continuous Integration

    We use [Travis CI](https://travis-ci.org/) and its connection to GitHub.
    See [here](https://docs.travis-ci.com/user/for-beginners) how to activate this for your project.
    Then, the provided ```.travis.yml``` and ```build.gradle``` files will do the job.

- Code Analysis

    We use [SonarQube](http://www.sonarqube.org/) for code analysis.
    **This is not included in the works made by Travis CI.**
    Therefore you have to run Gradle target ```sonarqube```.
    By default the ```build.gradle``` file works with a local SonarCube server on ```localhost:9000```.
    You will have to install and run your own server there or
    if you have access to another one to complete the information in ```build.gradle```.
    More information is [here](http://docs.sonarqube.org/display/SONAR/Analyzing+with+SonarQube+Scanner+for+Gradle)
    (note that Gradle includes a SonarCube plugin but it will be removed in Gradle 3.0).
    The technical badge is not generated automatically. You will have to change the value by hand each time you run SonarCube (this is too bad).

- Test Coverage

    We use [JaCoCo](http://eclemma.org/jacoco/) to produce test coverage reports.
    For the time being it does not support excluding private constructors from the analysis.
    Hence you won't get 100% coverage in the reports if you use them
    (e.g., in order to have a good SonarQube technical debt).
    To have JaCoCo support, nothing to do, the provided ```.travis.yml``` and ```build.gradle``` files will do the job.

    We use [Coveralls](https://coveralls.io/) to produce test coverage history and statistics.
    See [here](https://coveralls.zendesk.com/hc/en-us) how to activate this for your project.
    Then, the provided ```.travis.yml``` and ```build.gradle``` files will do the job.

- Logging

    We use [Apache Log4j 2](http://logging.apache.org/log4j/2.x/) for logging.
    A very basic set configuration files, in YAML format, is provided.
    More information is [here](http://logging.apache.org/log4j/2.x/manual/configuration.html).
    Note the use of distinct configurations files for the run (```src/main/resources/log4j2.yml```) and for the test (```src/main/resources/log4j2-test.yml```).
    This enables you, e.g., to log different things and present them in different ways in test or in production.
    Of course different logging APIs can be used instead of Log4j.
    For example if you use ``java.util.logging`` you can remove the Log4j and jackson-dataformat dependencies from ```build.gradle```, and you don't need the Log4j configuration files.

- Licence Badges

    We use [shields.io](https://img.shields.io) to generate the Licence and the Technical Debt badge.

- Documentation (soon ...)

- Web Site (soon ...)

