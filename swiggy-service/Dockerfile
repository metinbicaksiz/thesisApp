FROM amazoncorretto:17

LABEL mentainer="metinbicaksiz@gmail.com"

WORKDIR /app

COPY target/swiggy-service-0.0.1-SNAPSHOT.jar /app/swiggy-service.jar

ENTRYPOINT ["java", "-jar", "swiggy-service.jar"]

