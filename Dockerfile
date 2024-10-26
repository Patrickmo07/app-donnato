#Utilizando img en version jdk21
FROM eclipse-temurin:21-jdk-alpine

#Creando dir para la app donnato
VOLUME /tmp

ARG JAR_FILE=target/app-donnato-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar


EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]
