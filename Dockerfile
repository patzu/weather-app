# Use Java 17 runtime (Temurin distribution)
FROM eclipse-temurin:17-jre

# Alternatively, you can try:
# FROM openjdk:17-slim

# Set the working directory
WORKDIR /app

# Copy the built JAR file into the container
COPY target/weather-app-0.0.1-SNAPSHOT.jar weather-app.jar

# Expose port 8080
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "weather-app.jar"]
