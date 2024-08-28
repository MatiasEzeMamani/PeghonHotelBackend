Proyecto de Backend para Aplicación Web Full-Stack con Spring Boot
Este repositorio contiene la parte del backend de un proyecto web full-stack que utiliza Spring Boot. El objetivo es proporcionar la funcionalidad del servidor y las API necesarias para interactuar con una aplicación web construida con React.js en el frontend.

Este proyecto es parte de un tutorial más amplio que cubre la construcción de una aplicación web completa. La parte del frontend se encuentra en otro repositorio, y este backend se conecta con ese frontend para proporcionar una solución completa.

Contenido del Proyecto
Backend: Spring Boot
Project Overview & Test - Configuración y prueba inicial del proyecto.
Architectural Design Overview - Visión general de la arquitectura.
Create Backend Project - Creación del proyecto backend.
Connect to Database - Conexión a la base de datos.
Add JWT and S3 Dependency - Añadir dependencias de JWT y AWS S3.
Create Entities/Models - Creación de las entidades y modelos.
Create DTO's - Creación de los DTOs.
Create Repositories - Creación de repositorios.
Write Exception Class - Implementación de clases de excepción.
Write Custom User Details Service - Creación del servicio de detalles de usuario personalizado.
Write JWT Service - Implementación del servicio JWT.
Seguridad
Cors Config - Configuración de CORS.
JWT Auth Filters - Filtros de autenticación JWT.
Security Filter Chain - Cadena de filtros de seguridad.
Configure S3 Bucket - Configuración del bucket de AWS S3.
Write AWS S3 Service Class - Implementación del servicio para AWS S3.
Entity to DTO Mapping Util - Utilidad para mapear entidades a DTOs.
Servicios
User Service - Servicio para manejo de usuarios.
Room Service - Servicio para manejo de habitaciones.
Booking Service - Servicio para manejo de reservas.
Controladores
Auth Controller - Controlador de autenticación.
Users Controller - Controlador de usuarios.
Room Controller - Controlador de habitaciones.
Booking Controller - Controlador de reservas.
Cómo Ejecutar el Backend
Clona el repositorio: git clone https://github.com/tu-usuario/nombre-del-repositorio.git
Configura las variables de entorno para la base de datos y AWS S3.
Ejecuta el backend usando Spring Boot desde el directorio del proyecto:
bash
Copiar código
./mvnw spring-boot:run
Asegúrate de que el frontend esté en desarrollo o en otro repositorio y esté configurado para conectar con este backend.
Recursos Utilizados
Spring Boot
AWS S3
Nota
Este repositorio solo contiene la parte del backend del proyecto. El frontend, que utiliza React.js, se encuentra en otro repositorio. Ambos repositorios están diseñados para trabajar juntos para crear una solución web completa.

Autor
Este proyecto está basado en un tutorial de YouTube y se utiliza para mejorar mis habilidades en desarrollo full-stack con Spring Boot y React.js.

