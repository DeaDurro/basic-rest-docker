# Build stage
FROM maven:3.8.3-openjdk-17 AS MAVEN_TOOL_CHAIN
# Set working directory
WORKDIR /tmp/
# Copy project files
COPY pom.xml /tmp/
COPY src /tmp/src/
# Run Maven to build the app
RUN mvn clean install

# Final stage
#sets the base image to java
FROM eclipse-temurin:21.0.2_13-jre-jammy
# Update and clean up the package lists
RUN apt update -yqq && apt upgrade -yqq && \
    apt-get autoremove -y && apt-get clean && rm -rf /var/lib/apt/lists/
# Deployment directory
WORKDIR /opt/app
# Copy the jar built artifact from the Maven image
COPY --from=MAVEN_TOOL_CHAIN /tmp/target/*.jar ./app.jar

# Create user and group to run the app, ensures a dedicated user and group exist for the application
RUN addgroup --system basicrestdocker && adduser --system basicrestdocker --ingroup basicrestdocker
# Create a directory
RUN mkdir logging
# Change ownership of directory and all its contents to the basicrestdocker user and group
RUN chown -R basicrestdocker:basicrestdocker /opt/app /opt/app/logging
# Switch to the non-root user ensures the app has the needed privileges
USER basicrestdocker:basicrestdocker
# Define build time ARG
ARG VERSION=0.0.1-SNAPSHOT
# Set env variables BASED ON ARG
ENV APP_VERSION=${VERSION}
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/app/app.jar"]

#LABEL maintainer="DeaDurro" \
      #org.opencontainers.version=${VERSION} \
      #org.opencontainers.image.authors="ux66agip"\
      #org.opencontainers.image.description="A basic Java REST web service using Spring Boot"