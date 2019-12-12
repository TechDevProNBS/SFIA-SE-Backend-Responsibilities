FROM java:8-jdk-alpine

ARG PROFILE

ARG PORT

ENV MY_ENV_VARIABLE=$PROFILE

COPY ./target/accessing-mongodb.jar  /usr/app/

ENV RESPONSIBILITIES_PORT=$PORT

ENV MONGODB_PASSWORD_RESPONSIBILITIES=$MONGODB_PASSWORD_RESPONSIBILITIES

CMD java -jar -Dspring.profiles.active=$PROFILE usr/app/accessing-mongodb.jar

