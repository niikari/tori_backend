FROM maven:3.5-jdk-8-alpine as builder

WORKDIR /app

COPY . .

RUN mvn clean package

FROM openjdk:latest

EXPOSE 8080

WORKDIR /app

COPY --from=builder /app/target/backend_openshift-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "backend_openshift-0.0.1-SNAPSHOT.jar"]
