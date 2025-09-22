# QNeoULD Microservice

A Spring Boot microservice for Qatar Airways QNeoULD Hackathon.

---

## 🚀 Getting Started

### Prerequisites

- Java 21
- Maven

### Build

```sh
mvn clean package
```

### Run (Development)

```sh
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

Or run the JAR:

```sh
java -jar target/qneouldmicroservice-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev
```

The service will start on port **8077** by default in the dev environment.

---

## 📚 API Endpoints (Dev Environment)

Base URL: `http://localhost:8077/qneould/api/v1`

| Endpoint                  | Method | Description                        |
|---------------------------|--------|------------------------------------|
| `/status`                 | GET    | Health/status check                |
| `/dashboard`              | GET    | Dashboard summary data             |
| `/revenue-optimisation`   | GET    | Revenue optimisation data          |
| `/delay-monitor`          | GET    | Delay monitoring data              |
| `/delay-prediction`       | GET    | Delay prediction and recommendations|

---

## 📝 Profiles

- **dev**: Development environment (port 8077)
- **prod**: Production/Azure environment (port set by Azure)

Set the active profile using:
- Command line: `--spring.profiles.active=dev` or `prod`
- Environment variable: `SPRING_PROFILES_ACTIVE=dev` or `prod`

---

## 🟦 Azure Deployment Notes

- Use the JAR built from Maven.
- Set `SPRING_PROFILES_ACTIVE=prod` in Azure App Service configuration.
- The app will use the port provided by Azure (`server.port=${PORT:8080}`) as set in `application-prod.properties`:
  ```properties
  # Production environment properties for Azure App Service

  # Use the port provided by Azure, default to 8080 if not set
  server.port=${PORT:8080}

  # Add other prod-specific properties here
  ```
- Startup command:
  ```
  java -jar qneouldmicroservice-0.0.1-SNAPSHOT.jar
  ```

---

## 📂 Project Structure

- `src/main/java/com/qatarairways/qneouldmicroservice/controller` - REST controllers
- `src/main/java/com/qatarairways/qneouldmicroservice/service` - Service logic
- `src/main/java/com/qatarairways/qneouldmicroservice/model` - Data models
- `src/main/resources/application-dev.properties` - Dev config
- `src/main/resources/application-prod.properties` - Prod/Azure config

---

## 🧑‍💻 Authors

- QNeoULD Team