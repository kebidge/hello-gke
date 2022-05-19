FROM openjdk:11-jre-slim 
EXPOSE 8081

ARG JAR_FILE=target/hello-gke-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar

ENTRYPOINT exec java -jar /app.jar