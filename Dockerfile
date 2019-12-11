FROM java:8-jdk-alpine

COPY ./target/SFIA-SE-Backend-Responsibilities.jar /usr/app/

ENTRYPOINT ["java","-jar","usr/app/SFIA-SE-Backend-Responsibilities.jar"]
