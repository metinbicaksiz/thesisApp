FROM amazoncorretto:17

LABEL mentainer="metinbicaksiz@gmail.com"

WORKDIR /app

COPY target/auth-service-jwt-sha2-0.0.1-SNAPSHOT.jar /app/auth-service-sha2.jar

ENTRYPOINT ["java", "-jar", "auth-service-sha2.jar"]

