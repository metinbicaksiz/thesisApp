FROM amazoncorretto:17

LABEL mentainer="metinbicaksiz@gmail.com"

WORKDIR /app

COPY target/admin_service-0.0.1-SNAPSHOT.jar /app/admin-service.jar

ENTRYPOINT ["java", "-jar", "admin-service.jar"]

