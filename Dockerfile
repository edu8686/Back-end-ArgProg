FROM amazoncorretto:17
MAINTAINER eduardodenegri
COPY target/jwt-0.0.1-SNAPSHOT.jar jwt-APweb.jar
ENTRYPOINT ["java", "-jar", "/jwt-APweb.jar"]

