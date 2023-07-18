FROM openjdk:11-jre-slim
WORKDIR /opt/app
COPY target/springapp-*.*.1-SNAPSHOT.jar /opt/app/springapp.jar
EXPOSE 8081
CMD ["java", "-jar", "springapp.jar"]

