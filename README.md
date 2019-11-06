# MicroProfile POC

This repository is a simple Jakarta EE 8 application,

for experimenting with Eclipse MicroProfile

built with Gradle, 

deployed as a WildFly 18 docker image.

## Prerequisites

The following should be installed on your local development machine:

* Java 11
* Docker

## Build

./gradlew clean build

## Deploy

docker build -t microprofile-poc .

docker run -d -p 8080:8080 -p 9990:9990 --name microprofile-poc microprofile-poc

Using your favourite browser, navigate to: 
* MicroProfile-Config POCs:
    * http://localhost:8080/microprofile-poc/ws/config/application.name (will read a config parameters)
    * http://localhost:8080/microprofile-poc/ws/config/application.version (will read a default config parameters)
    * http://localhost:8080/microprofile-poc/ws/config/application.build (will read a config parameters using the Config class)
    * http://localhost:8080/microprofile-poc/ws/config/JAVA_HOME (will read an environment variable)
