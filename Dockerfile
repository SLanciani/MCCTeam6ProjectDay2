FROM gradle:7 as builder
COPY --chown=gradle:gradle . /app
WORKDIR /app
RUN gradle -b MetroConventionCenterTeam6/build.gradle bootJar

FROM openjdk:8-jdk-alpine
EXPOSE 8080
VOLUME /tmp
ARG LIBS=app/MetroConventionCenterTeam6/build/libs
COPY --from=builder ${LIBS}/ /app/lib
ENTRYPOINT ["java","-jar","./app/lib/MetroConventionCenterTeam6-0.0.1-SNAPSHOT.jar"]
