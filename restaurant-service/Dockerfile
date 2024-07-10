FROM amazoncorretto:17

LABEL mentainer="metinbicaksiz@gmail.com"

WORKDIR /app

COPY target/restaurant-service-0.0.1-SNAPSHOT.jar /app/restaurant-service.jar

ENTRYPOINT ["java", "-jar", "restaurant-service.jar"]

