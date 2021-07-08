FROM maven:3.8.1-openjdk-11

COPY . .

RUN ["mvn", "clean", "install", "-DskipTests"]

ENTRYPOINT ["java","-jar","target/EducationManager-0.0.1-SNAPSHOT.jar"]
