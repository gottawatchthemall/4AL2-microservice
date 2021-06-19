FROM maven:3.8.1-openjdk-11

COPY . .

RUN ["mvn", "clean", "install", "-DskipTests"]

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/microservice-0.0.1-SNAPSHOT.jar"]