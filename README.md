# Proyecto de Backend para Aplicación Web Full-Stack con Spring Boot

Este repositorio contiene la parte del backend de un proyecto web full-stack que utiliza **Spring Boot**. Este backend proporciona la funcionalidad del servidor y las API necesarias para interactuar con una aplicación web construida con **React.js** en el frontend.

El proyecto es parte de un tutorial más amplio que cubre la construcción de una aplicación web completa. La parte del frontend está en otro repositorio, y este backend se conecta con ese frontend para proporcionar una solución completa.

## Contenido del Proyecto

### Backend: Spring Boot

- **Project Overview & Test** - Configuración y prueba inicial del proyecto.
- **Architectural Design Overview** - Visión general de la arquitectura.
- **Create Backend Project** - Creación del proyecto backend.
- **Connect to Database** - Conexión a la base de datos.
- **Add JWT and S3 Dependency** - Añadir dependencias de JWT y AWS S3.
- **Create Entities/Models** - Creación de las entidades y modelos.
- **Create DTO's** - Creación de los DTOs.
- **Create Repositories** - Creación de repositorios.
- **Write Exception Class** - Implementación de clases de excepción.
- **Write Custom User Details Service** - Creación del servicio de detalles de usuario personalizado.
- **Write JWT Service** - Implementación del servicio JWT.

#### Seguridad

- **Cors Config** - Configuración de CORS.
- **JWT Auth Filters** - Filtros de autenticación JWT.
- **Security Filter Chain** - Cadena de filtros de seguridad.
- **Configure S3 Bucket** - Configuración del bucket de AWS S3.
- **Write AWS S3 Service Class** - Implementación del servicio para AWS S3.
- **Entity to DTO Mapping Util** - Utilidad para mapear entidades a DTOs.

#### Servicios

- **User Service** - Servicio para manejo de usuarios.
- **Room Service** - Servicio para manejo de habitaciones.
- **Booking Service** - Servicio para manejo de reservas.

#### Controladores

- **Auth Controller** - Controlador de autenticación.
- **Users Controller** - Controlador de usuarios.
- **Room Controller** - Controlador de habitaciones.
- **Booking Controller** - Controlador de reservas.

## Cómo Ejecutar el Proyecto

1. **Clona el Repositorio:**  
   Clona el repositorio utilizando el siguiente comando:
   ```bash
   git clone https://github.com/tu-usuario/nombre-del-repositorio.git

2. **Ejecuta el Backend:**  
   Navega al directorio del proyecto y ejecuta el backend usando Spring Boot con el siguiente comando:
   ```bash
   ./mvnw spring-boot:run

3. **Conecta con el Frontend:**  
   Asegúrate de que el frontend esté en desarrollo o en otro repositorio y esté configurado para conectar con este backend. El frontend se encuentra en otro repositorio y debe estar en ejecución para que la aplicación completa funcione correctamente. Para ello, configura las URLs de las API en el frontend para que apunten a este backend, y asegúrate de que el servidor de frontend esté ejecutándose, generalmente con `npm start` o el comando equivalente para tu configuración de React.js.

### Recursos Utilizados

- [Spring Boot](https://spring.io/projects/spring-boot) - Framework para el desarrollo del backend.
- [AWS S3](https://aws.amazon.com/s3/) - Servicio de almacenamiento en la nube utilizado para gestionar archivos.

## Nota

Este repositorio solo contiene la parte del backend del proyecto. La aplicación web completa incluye un frontend construido con **React.js**, que se encuentra en un repositorio separado. Ambos repositorios están diseñados para trabajar juntos y proporcionar una solución web integral.

## Autor

Este proyecto está basado en un tutorial de YouTube que sigo para mejorar mis habilidades en desarrollo full-stack con Spring Boot y React.js. Si tienes preguntas o sugerencias, no dudes en contactarme a través de mis redes sociales o perfiles de desarrollo.
