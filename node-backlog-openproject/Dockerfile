FROM openjdk:8-jdk-alpine

LABEL org.label-schema.vendor="Q-rapids Forecast REST" \
      maintainer="Mikolaj Komisarek <mikolajkomisarek@outlook.com>"

ADD jar/q-rapids-backlog-openproject-1.0.0.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]