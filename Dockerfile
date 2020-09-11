FROM openjdk:8-jdk-alpine
MAINTAINER sky8chi
LABEL app=springbootDemo
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
VOLUME /logs
ARG JAR_FILE=target/demo.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]