FROM amazoncorretto:17

LABEL mentainer="metinbicaksiz@gmail.com"

WORKDIR /app

COPY target/auth-service-jwt-0.0.1-SNAPSHOT.jar /app/auth-service.jar

ENTRYPOINT ["java", "-jar", "auth-service.jar"]

