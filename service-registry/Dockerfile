FROM amazoncorretto:17

LABEL mentainer="metinbicaksiz@gmail.com"

WORKDIR /app

COPY target/service-registry-0.0.1-SNAPSHOT.jar /app/service-discovery-docker.jar

ENTRYPOINT ["java", "-jar", "service-discovery-docker.jar"]

