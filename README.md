# Android News App
An Android app built with Jetpack Compose and the latest android libraries.

[![.github/workflows/ci.yaml](https://github.com/moskv08/AndroidNewsApp/actions/workflows/ci.yaml/badge.svg)](https://github.com/moskv08/AndroidNewsApp/actions/workflows/ci.yaml)

## CI Pipeline

The Continuous Integration (CI) is an automated integration process which generates a build and runs automates tests against it.
This CI pipeline consists of the following steps:

* Android Lint Check  
* Unit Tests
* Instrumentation Tests 
* Static Code Analysis 
* Build Debug apk (Packaging)

> Note: Make gradlew Executable

Locally, navigate to the root of your project where the gradlew file resides, and run the following command:
````bash
chmod +x gradlew
````

