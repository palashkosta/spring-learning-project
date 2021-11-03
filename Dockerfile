FROM gradle:7.2.0-jdk11 as BUILDER
ARG VERSION=0.0.1-SNAPSHOT
WORKDIR /build/
COPY build.gradle /build/
COPY src /build/src

RUN gradle clean assemble

COPY build/libs/spring-learning-project-${VERSION}.jar target/application.jar

FROM openjdk:11.0.8-jre-slim
WORKDIR /app/

COPY --from=BUILDER /build/target/application.jar /app/
CMD java -jar /app/application.jar