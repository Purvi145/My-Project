# My-Project — Spring Boot REST API

A simple Spring Boot REST API for managing items.

##  Getting Started

### Prerequisites
- Java 17+
- Maven 3.8+

### Run the Application
```bash
mvn spring-boot:run
```

The server starts at `http://localhost:8080`

##  API Endpoints

| Method | Endpoint          | Description        |
|--------|-------------------|--------------------|
| GET    | /api/items        | Get all items      |
| GET    | /api/items/{id}   | Get item by ID     |
| POST   | /api/items        | Create a new item  |
| PUT    | /api/items/{id}   | Update an item     |
| DELETE | /api/items/{id}   | Delete an item     |

## Sample Request

### Create an Item
```bash
curl -X POST http://localhost:8080/api/items \
  -H "Content-Type: application/json" \
  -d '{"name":"Headphones","price":149.99,"description":"Wireless headphones"}'
```

### Get All Items
```bash
curl http://localhost:8080/api/items
```

## 🛠 Tech Stack
- Java 17
- Spring Boot 3.2
- Maven
