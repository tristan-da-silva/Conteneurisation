FROM openjdk:13-jdk-alpine

ARG JAR_FILE=target/episen-sca-tda-backend-1.0.0.jar

WORKDIR /var/lib

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]

EXPOSE 8080

LABEL description="For Java 13 alpine version"
LABEL episen-sca-tda-backend.version="1.0.0"
LABEL date="19/10/2020"