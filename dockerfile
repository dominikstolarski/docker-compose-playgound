FROM openjdk:latest
ADD target/email-api-springboot-0.0.1-SNAPSHOT.jar .
EXPOSE 3001:3001
CMD java -jar email-api-springboot-0.0.1-SNAPSHOT.jar
