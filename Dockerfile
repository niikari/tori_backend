FROM openjdk:latest

EXPOSE 8080

WORKDIR /app

COPY /target/backend_openshift-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "backend_openshift-0.0.1-SNAPSHOT.jar"]