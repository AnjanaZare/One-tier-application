
# palindrome-api (Spring Boot)

A minimal Spring Boot REST API to check whether a given text is a palindrome.

## Endpoints

- `POST /palindrome`  — Request body `{ "text": "Madam" }` → Response `{ "text": "Madam", "palindrome": true }`
- `GET /health` — Simple liveness check returning `OK`

## Requirements

- Java 17+
- Maven 3.8+

## Run locally

```bash
mvn clean package -DskipTests
java -jar target/palindrome-api-1.0.0.jar
```

Test it:

```bash
curl -s -X POST http://localhost:8080/palindrome   -H "Content-Type: application/json"   -d '{"text":"Never odd or even"}'
```

## Project structure
```
palindrome-api/
 ├─ src/main/java/com/example/palindrome/
 │   ├─ PalindromeApplication.java
 │   └─ PalindromeController.java
 ├─ src/main/resources/application.properties
 └─ pom.xml
```

---

> You can now add your own Dockerfile, Kubernetes manifests, and CI/CD as needed.
