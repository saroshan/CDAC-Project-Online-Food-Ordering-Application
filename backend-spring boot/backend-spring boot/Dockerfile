FROM openjdk:17

WORKDIR /app

COPY target/zosh-food-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 5454

ENTRYPOINT ["java", "-jar", "app.jar"]
