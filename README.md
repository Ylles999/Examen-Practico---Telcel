# 📌 Sistema de Gestión de Clientes - Spring Boot + Oracle

## 📖 Descripción

Aplicación desarrollada con **Spring Boot 3** que permite la gestión de clientes mediante un CRUD completo, utilizando **Oracle Database 19c** como base de datos.

El proyecto implementa arquitectura en capas (Controller, Service, Repository) siguiendo buenas prácticas vistas durante la capacitación.

---

## 🛠️ Tecnologías Utilizadas

- Java 21
- Spring Boot 3
- Spring Data JPA
- Oracle Database 19c
- Maven
- Postman (pruebas de endpoints)

---

## 🗂️ Estructura del Proyecto
com.cliente
│
├── controller
│ └── ClienteController
│
├── service
│ ├── IClienteService
│ └── ClienteServiceImpl
│
├── repository
│ └── ClienteRepository
│
├── model
│ └── Cliente
│
└── exception
└── GlobalExceptionHandler


---

## 🗄️ Base de Datos (Oracle)

### Tabla CLIENTE

```sql
CREATE TABLE CLIENTE (
    ID_CLIENTE NUMBER PRIMARY KEY,
    NOMBRE VARCHAR2(100) NOT NULL,
    FECHA_NACIMIENTO DATE,
    CELULAR VARCHAR2(10),
    CORREO VARCHAR2(100),
    NSS VARCHAR2(11),
    CURP VARCHAR2(18)
);

---
### Secuencia

CREATE SEQUENCE SEQ_CLIENTE
START WITH 1
INCREMENT BY 1
NOCACHE
NOCYCLE;

---
## 🔎 Endpoints Disponibles

--> Listar Clientes
GET http://localhost:7575/api/clientes

--> Buscar Cliente por ID
GET http://localhost:7575/api/clientes/{id}

--> Crear Cliente
POST http://localhost:7575/api/clientes

ejemplo de un JSON para crear:

{
  "nombre": "Carlos Lopez",
  "fechaNacimiento": "1998-06-15",
  "celular": "5512345678",
  "correo": "carlos@email.com",
  "nss": "98765432109",
  "curp": "LOPC980615HDFRRN08"
}

--> Eliminar Cliente
DELETE http://localhost:7575/api/clientes/{id}

