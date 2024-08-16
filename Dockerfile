FROM amazoncorretto:17-alpine-jdk
VOLUME /tmp
EXPOSE 5000
ADD ./target/eureka-server-0.0.1-SNAPSHOT.jar eureka-server.jar
ENTRYPOINT ["java","-jar","/eureka-server.jar"]