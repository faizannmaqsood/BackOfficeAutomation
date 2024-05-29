# Use an official Maven image with JDK 11
FROM maven:3.8.1-jdk-11

# Set the working directory inside the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . .

# Run mvn to build and test the project
RUN mvn clean package

# Command to execute when running the container
CMD ["mvn", "test"]
