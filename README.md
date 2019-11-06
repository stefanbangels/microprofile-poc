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
http://localhost:8080/microprofile-poc/ws/helloworld
