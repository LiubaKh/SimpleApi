FROM openjdk:17
LABEL maintainer ="javaguides.net"
ADD target/SimpleApi-0.0.1-SNAPSHOT.jar simpleapi.jar
ENTRYPOINT ["java", "-jar", "simpleapi.jar"]




