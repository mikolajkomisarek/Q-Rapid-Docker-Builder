FROM java:8
ADD jar/qrapids-si_assessment-rest-0.1.jar app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]


