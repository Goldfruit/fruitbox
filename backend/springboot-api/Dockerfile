# 1. Build stage
FROM maven:3.9.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# 2. Run stage
FROM openjdk:17-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar springboot-api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "springboot-api.jar"]
