# 🏥 Backend Clínica - Spring Boot

Este es un proyecto backend desarrollado en **Java con Spring Boot**, el cual gestiona información relacionada con una clínica médica. El sistema actualmente maneja tres entidades principales:

- 👨‍⚕️ **Médico**
- 👩‍🦰 **Paciente**
- 📅 **Cita**

## 🚀 Objetivo del Proyecto

El objetivo de este proyecto es facilitar la gestión médica mediante un sistema centralizado que permita:

- Registrar, consultar, actualizar y eliminar información de médicos, pacientes y citas (CRUD completo).
- Almacenar los datos de manera segura en una base de datos PostgreSQL.
- En una versión futura: **enviar correos electrónicos** a los pacientes con recordatorios de sus citas, indicando hora y fecha.

---

## 🛠️ Tecnologías Utilizadas

- Java 17+
- Spring Boot
  - Spring Web
  - Spring Data JPA
- PostgreSQL
- Maven
- (Futuro) Spring Mail

---

## 📁 Estructura del Proyecto

src/ └── main/ ├── java/ │ └── com/clinica/ │ ├── controllers/ # Controladores REST para las entidades │ ├── models/ # Entidades: Médico, Paciente, Cita │ ├── repositories/ # Interfaces JpaRepository │ └── services/ # Lógica de negocio (opcional) └── resources/ ├── application.properties # Configuración del proyecto └── ...


---

## ⚙️ Configuración y Ejecución

1. **Clona el repositorio**

```bash
git clone https://github.com/tu-usuario/clinica-backend.git
cd clinica-backend
Configura la base de datos PostgreSQL

Crea una base de datos en PostgreSQL, por ejemplo clinica_db, y asegúrate de ajustar tus credenciales en el archivo application.properties:

properties
Copiar
Editar
spring.datasource.url=jdbc:postgresql://localhost:5432/clinica_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Ejecuta el proyecto

Puedes correrlo desde tu IDE (IntelliJ, Eclipse) o con Maven:

bash
Copiar
Editar
./mvnw spring-boot:run
📬 Envío de Correos (Futuro)
Está planeado incorporar el módulo de notificaciones por correo electrónico usando Spring Mail, para enviar recordatorios automáticos a los pacientes sobre sus citas programadas.

📌 Estado del Proyecto
✅ CRUD funcional para las entidades
✅ Persistencia con PostgreSQL
🔜 Integración con Spring Mail
🔜 Seguridad (JWT, roles)
🔜 Documentación con Swagger

🧑‍💻 Autor
Desarrollado por Wayner Jimenez.
