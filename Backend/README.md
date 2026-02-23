📌 Sistema de Gestión de Clientes - Spring Boot + Oracle
📖 Descripción

Aplicación desarrollada con Spring Boot 3 que permite la gestión de clientes mediante un CRUD completo, utilizando Oracle Database 19c como base de datos.

El proyecto implementa arquitectura en capas (Controller, Service, Repository) siguiendo buenas prácticas aplicadas durante la capacitación.

🛠️ Tecnologías Utilizadas

* Java 21
* Spring Boot 3
* Spring Data JPA
* Oracle Database 19c
* Maven
* Postman (pruebas de endpoints)

🗂️ Estructura del Proyecto
com.cliente
│
├── controller
│   └── ClienteController
│
├── service
│   ├── IClienteService
│   └── ClienteServiceImpl
│
├── repository
│   └── ClienteRepository
│
├── model
│   └── Cliente
│
└── exception
    └── GlobalExceptionHandler

🔎 Endpoints Disponibles
📌 Listar Clientes
GET http://localhost:7575/api/clientes
📌 Buscar Cliente por ID
GET http://localhost:7575/api/clientes/{id}
📌 Crear Cliente
POST http://localhost:7575/api/clientes

Ejemplo JSON:

{
  "nombre": "Carlos Lopez",
  "fechaNacimiento": "1998-06-15",
  "celular": "5512345678",
  "correo": "carlos@email.com",
  "nss": "98765432109",
  "curp": "LOPC980615HDFRRN08"
}
📌 Eliminar Cliente
DELETE http://localhost:7575/api/clientes/{id}

✅ Características Implementadas
Arquitectura en capas
Integración con Oracle mediante secuencia
CRUD completo
Validaciones con Jakarta Validation
Manejo global de excepciones
Respuestas HTTP adecuadas (200, 201, 404, 204)
