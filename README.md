# 🌟 Spring Boot JWT Authentication API

Welcome to a secure and simple **JWT Authentication API** built with **Spring Boot**!  
This project is a foundational backend service that handles **user authentication** using **JSON Web Tokens (JWT)**—perfect for protecting private endpoints in any modern web or mobile app.

---

## 💡 What Does This Project Do?

This project exposes a single API endpoint:  
`POST /authenticate`

Here’s what happens:

1. The user sends their **username and password**.
2. If the credentials are valid, the server:
   - Authenticates the user
   - Generates a secure **JWT token**
   - Sends the token back to the user
3. The client can use this token to access protected resources by including it in the `Authorization` header.

Think of it like a digital key 🗝️—the user logs in once, and the token lets them prove who they are every time they knock on your app's doors.

---

## 🚀 Why JWT?

- ✅ **Stateless** – No session storage needed
- 🔐 **Secure** – The token is signed and can’t be tampered with
- ⚡ **Fast** – No database hit on every request
- 🌍 **Widely Used** – Perfect for REST APIs and microservices

---

## 🧰 Tech Stack

| Tool | Purpose |
|------|---------|
| **Java 17+** | Programming Language |
| **Spring Boot** | Application Framework |
| **Spring Security** | Authentication & Security |
| **jjwt** | JWT token generation & validation |
| **JUnit + Mockito** | Unit Testing |
| **Maven** | Build Tool |

---
##Thank you for taking your time to explore the project.
