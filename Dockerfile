FROM openjdk:8u151-jdk-alpine3.7

# Create a non-root user
RUN addgroup -S nonroot && adduser -S nonroot -G nonroot

# Set working directory and permissions
ENV APP_HOME=/usr/src/app
WORKDIR $APP_HOME
COPY target/SouvenirShop-0.0.1-SNAPSHOT.jar $APP_HOME/app.jar
RUN chown -R nonroot:nonroot $APP_HOME

# Switch to non-root user
USER nonroot

# Expose the application port
EXPOSE 8085

# Set metadata for the image
LABEL authors="Winner Musole"

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
