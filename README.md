# 💬 Social Media App
<p>
     <img src="https://img.shields.io/badge/Spring%20Boot-2.7.0-brightgreen" alt="Spring Boot"/>
     <img src="https://img.shields.io/badge/Kotlin-1.8.0-blue" alt="Kotlin"/>
     <img src="https://img.shields.io/badge/Angular-16-red" alt="Angular"/>
     <img src="https://img.shields.io/badge/Docker-Enabled-blue" alt="Docker"/>
     <img src="https://img.shields.io/badge/Microservices-Architecture-orange" alt="Microservices"/>
</p>

This is a full-stack social media application built using Spring Boot microservices (Kotlin/Java) and Angular. It supports user authentication, article posting, notifications, and more. The project is modularized for scalability and maintainability.

---

## 📌 Features

- User registration & authentication
- Article creation, editing, and deletion
- Author profiles
- Real-time notifications
- API Gateway & Service Discovery (Eureka)
- Dockerized deployment
- Responsive Angular frontend

## Architecture
Microservices:

- **Articles**: Manages articles and related operations
- **Authors**: Handles author profiles and data
- **Authorization**: User authentication and authorization
- **Notifications**: Real-time notifications
- **Gateway**: API gateway for routing
- **Eureka**: Service discovery
- **Web**: Angular frontend

## 🛠 Tech Stack

- **Backend**: Spring Boot, Kotlin, Java, Maven
- **Frontend**: Angular, TypeScript, SCSS
- **Database**: PostgreSQL (configurable)
- **Service Discovery**: Eureka
- **API Gateway**: Spring Cloud Gateway
- **Containerization**: Docker, Docker Compose

## Setup & Installation

### Prerequisites

- Java 17+
- Node.js & npm
- Docker (optional, for containerized deployment)

## ⚙️ Backend (microservices)

```bash
# From each microservice folder (e.g., Articles/, Authors/, etc.)
mvnw clean install
mvnw spring-boot:run
```

### Frontend (Angular)

```bash
cd web-angular
npm install
ng serve
```

### Docker Compose

```bash
docker-compose up --build
```

## Usage

Access the Angular frontend at [http://localhost:4200](http://localhost:4200).

API endpoints are exposed via the Gateway at [http://localhost:8080](http://localhost:8080).

## 📂 Project Structure

```text
Practice/
├── Articles/           # Article microservice
├── Authors/            # Author microservice
├── authorization/      # Auth microservice
├── notifications/      # Notification microservice
├── gateway/            # API Gateway
├── Eureka/             # Service Discovery
├── web/                # JS frontend (optional)
├── web-angular/        # Angular frontend
├── common/             # Shared code
├── docker-compose.yml  # Multi-service orchestration
└── README.md           # Project documentation
```

---

## 👨‍💻 Contributing
#### 💡 Want to improve this project? Feel free to contribute!<br>
1.Fork the repository<br>
2.Create a new branch (git checkout -b feature/your-feature)<br>
3.Make your changes and commit (git commit -am 'Added a new feature')<br>
4.Push the branch (git push origin feature/your-feature)<br>
5.Submit a Pull Request<br> 

---

## 🌍 Contact
**💻 Author: Utkarsh**<br>
**📧 Email: ubhatt2004@gmail.com**<br>
**🐙 GitHub: https://github.com/UKbhatt**<br>

