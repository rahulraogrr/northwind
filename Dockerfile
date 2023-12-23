# Use an official OpenJDK image as a parent image
FROM openjdk:17

# Set the working directory to /app
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/northwind-0.0.1.jar /app/northwind.jar

# Expose the port the app runs on
EXPOSE 8080

# Specify the command to run on container start
CMD ["java", "-jar", "northwind.jar"]