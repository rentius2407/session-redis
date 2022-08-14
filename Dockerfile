FROM amazoncorretto:17-alpine-jdk

ADD target/*.jar /opt/app.jar
ENTRYPOINT ["java", "-jar", "/opt/app.jar"]