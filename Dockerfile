FROM openjdk:8
ADD target/ejemplo-maven.jar ejemplo-maven.jar
ENTRYPOINT ["java", "-jar","ejemplo-maven.jar"]
EXPOSE 8080