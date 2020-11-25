FROM maven:3.6.3-jdk-11-slim AS maven-jar-build
RUN sudo useradd docker --uid 2020 --home /home/tp4/ --create-home --groups tp4 --gid tp4 --shell /bin/bash
USER docker
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean install

FROM openjdk:13-jdk-alpine
COPY --from=maven-jar-build /usr/src/app/target/episen-sca-tda-backend-1.0.0.jar /usr/app/app.jar
#WORKDIR /var/lib
#COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8080

LABEL description="For Java 13 alpine version" episen-sca-tda-backend.version="1.0.0" date="23/11/2020"


