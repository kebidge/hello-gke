FROM openjdk:11-jre-slim
COPY target/hello-gke-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]