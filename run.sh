#!/bin/sh
./gradlew clean build
docker build -t microprofile-poc .
docker rm -f microprofile-poc
docker run -d -p 8080:8080 -p 9990:9990 --name microprofile-poc microprofile-poc
