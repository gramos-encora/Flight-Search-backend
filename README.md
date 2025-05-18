# ✈️ Flight Search API (Backend)

This project is a **Spring Boot** middleware that connects a frontend application with the **Amadeus API** to search for flights, airlines, and airports. It also processes and enriches responses for easy consumption by the frontend.

## 🚀 Features

- Search for flight offers using the Amadeus API.
- Enriched airline and airport dictionary support.
- Clean and well-structured REST API endpoints.
- Environment-specific configuration via `application.yml`.

## 📦 Tech Stack

- Java 17
- Spring Boot
- Gradle (Groovy)
- Docker

---

## 🛠️ Local Setup

### 1. Clone the repository

```bash
git clone https://github.com/your-username/flight-search-backend.git
cd flight-search-backend
```

2. Environment variables
Create a .env file at the root of the project with your Amadeus API credentials:

.env
```bash
AMADEUS_KEY=your_amadeus_api_key
AMADEUS_SECRET=your_amadeus_api_secret
```

3. Build and run with Docker
Make sure you’ve built the JAR beforehand:

```bash
./gradlew clean build
```
Then build and run the container:

```bash
docker-compose up --build
```
The backend will be available at:
📍 http://localhost:8080

🔐 Zscaler Certificates (optional)
If you're on a corporate network using Zscaler, you might need to import the Zscaler root certificate to avoid connection errors (PKIX).
Place your certificate in backend/trusted_certs.pem.

The Dockerfile will automatically import it into Java’s truststore.

📖 Main Endpoints

| Method | Endpoints     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `GET`      | /api/airlines/{iataCode} |  Get airline information by IATA |
| `GET`      | /api/airports/{keyword} |  Search for airports by keyword |
| `GET`      | /api/flight-offers |  Search for flight offers |
