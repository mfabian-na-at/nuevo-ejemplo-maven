FROM openjdk:8
ADD target/java-jenkins-docker.jar java-jenkins-docker.jar
ENTRYPOINT ["java", "-jar","ejemplo-maven.jar"]
EXPOSE 8080