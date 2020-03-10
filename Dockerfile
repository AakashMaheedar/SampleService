FROM openjdk
FROM openjdk:8
EXPOSE 9000
ADD target/sample.jar sample.jar
ENTRYPOINT ["java","-jar","sample.jar"]