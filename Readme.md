# Control de Inventario

Este es un proyecto de muestra para gestionar un inventario de productos utilizando Spring Boot, MySQL y una API REST.

## Características

- Operaciones CRUD (Crear, Leer, Actualizar y Eliminar) para productos.
- API RESTful para interactuar con la base de datos de productos.
- Uso de Spring Boot para configurar la aplicación.
- Base de datos MySQL para el almacenamiento de productos.
- Estructura de paquetes MVC (Modelo-Vista-Controlador) para una organización clara del código.

## Requisitos

- Java JDK 8 o superior.
- Maven para la gestión de dependencias.
- MySQL para la base de datos.

## Configuración

1. Clona este repositorio en tu máquina local.
2. Configura tu base de datos MySQL y actualiza las credenciales en `application.properties`.
3. Ejecuta la aplicación utilizando Maven: `mvn spring-boot:run`.
4. La aplicación estará disponible en `http://localhost:8080`.

## Uso

- Utiliza Postman o una herramienta similar para realizar solicitudes HTTP a la API REST.
- Consulta la documentación de la API en el archivo `src/main/resources/api-documentation.txt` para conocer los endpoints disponibles y sus funciones.

