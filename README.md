# CDAC-Project-Online-Food-Ordering-Application# 🍽️ Mom's Kitchen - Online Food Ordering System

## 📌 Project Overview

**Mom's Kitchen** is a web-based food ordering platform that allows customers to browse home-cooked meal menus, add items to their cart, and place orders seamlessly. It also provides restaurant owners with a management interface to handle menus and process orders efficiently.

## 🚀 Features

- **User Roles:** Admin/Restaurant Owner, Customer
- **Menu Management:** Add, update, and delete food items
- **Order Management:** process orders in real-time
- **Cart System:** Customers can add and modify items before checkout
- **User Authentication:** Secure login & role-based access control

## 🛠️ Tech Stack

### **Frontend:**

- ReactJS (v18.2.0)
- Redux (v4.2.1)
- HTML, CSS, JavaScript
- Bootstrap (v5.3.0), Material UI (v5.13.7)
- VS Code (v1.85.0)

### **Backend:**

- Java EE (v11)
- Spring Boot (v3.1.2)
- Spring Security (v6.1.2)
- JPA/Hibernate (v6.2.0)
- MySQL (v8.0.34)
- STS (Spring Tool Suite) (v4.19.1)

## 📂 Project Structure

```
/moms-kitchen
│── backend/                # Spring Boot Backend
│── frontend/               # React Frontend
│── docs/                   # Documentation & API Specs
│── README.md               # Project Overview
│── .gitignore              # Git Ignore File
│── docker/                 # Docker Configurations
```

## ⚡ Getting Started

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/saroshan/CDAC-Project-Online-Food-Ordering-Application.git
cd CDAC-Project-Online-Food-Ordering-Application
```

### 2️⃣ Backend Setup

1. Navigate to the **backend/** folder

```bash
cd backend
```

2. Install dependencies and run the Spring Boot application

```bash
./mvnw spring-boot:run
```

3. Ensure **MySQL** is running with the correct database configurations in `application.properties`

### 3️⃣ Frontend Setup

1. Navigate to the **frontend/** folder

```bash
cd frontend
```

2. Install dependencies

```bash
npm install
```

3. Start the React app

```bash
npm start
```

## 🐳 Docker Deployment

### **Frontend Docker Image:**  
[Mom's Kitchen Frontend on Docker Hub](https://hub.docker.com/repository/docker/roshansawant071/my-react-app/general)

```bash
docker pull roshansawant071/my-react-app:latest
docker run -d -p 3000:3000 roshansawant071/my-react-app
```

### **Backend Docker Image:**  
[Mom's Kitchen Backend on Docker Hub](https://hub.docker.com/repository/docker/roshansawant071/onlinefoodordering/general)

```bash
docker pull roshansawant071/onlinefoodordering:latest
docker run -d -p 8080:8080 roshansawant071/onlinefoodordering
```

## 🎯 Future Enhancements

- Implement **real-time order tracking**
- Add **payment gateway integration**
- Enhance **restaurant analytics dashboard**
- Introduce **AI-based recommendations** for food suggestions
- Develop **Progressive Web App (PWA)** for mobile users

## 🛡️ License

This project is licensed under the **MIT License**.

---

🌟 **Feel free to contribute and improve this project!** 🚀


