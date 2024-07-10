FROM amazoncorretto:17

LABEL mentainer="metinbicaksiz@gmail.com"

WORKDIR /app

COPY target/api-gateway-sha2-0.0.1-SNAPSHOT.jar /app/api-gateway-sha2.jar

ENTRYPOINT ["java", "-jar", "api-gateway-sha2.jar"]

