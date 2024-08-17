# CRUD API REST con Spring Boot, Hibernate y PostgreSQL

Este proyecto es una API REST implementada en Java utilizando Spring Boot, Hibernate y PostgreSQL para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar). La aplicación permite gestionar recursos mediante solicitudes HTTP a una API RESTful.

## Descripción del Proyecto

La API REST permite realizar las siguientes operaciones CRUD sobre los recursos:

- **Crear**: Añadir nuevos recursos a la base de datos.
- **Leer**: Obtener la lista de recursos o un recurso específico por su identificador.
- **Actualizar**: Modificar los detalles de un recurso existente.
- **Eliminar**: Eliminar un recurso de la base de datos.

La aplicación está desarrollada utilizando las siguientes tecnologías:

- **Java 21.0.4**: Lenguaje de programación utilizado.
- **Spring Boot**: Framework para crear aplicaciones Java basadas en Spring.
- **Hibernate**: Herramienta de mapeo objeto-relacional (ORM) utilizada para interactuar con la base de datos.
- **PostgreSQL**: Sistema de gestión de bases de datos relacional utilizado para almacenar los datos.

## Tecnologías y Herramientas

- **Spring Boot 3.3.2**: Para la creación y gestión de la aplicación.
- **Hibernate ORM**: Para la gestión de la persistencia de datos.
- **PostgreSQL**: Para la base de datos.
- **Maven**: Para la gestión de dependencias y ejecución de la aplicación.

## Configuración del Proyecto

1. **Clonación del Repositorio**

   Clona el repositorio en tu máquina local utilizando Git:

       git clone https://github.com/tu_usuario/tu_repositorio.git

## Configuración de la Base de Datos

Asegúrate de tener `PostgreSQL` instalado y ejecutándose. Crea una base de datos llamada postgres (o el nombre que prefieras) y actualiza las credenciales en el archivo `application.properties:`

      spring.datasource.url=jdbc:postgresql://localhost:5432/db-name
      spring.datasource.username=username`
      spring.datasource.password=password

## Dependencias de Maven

Asegúrate de tener `Maven` instalado. Las dependencias necesarias están definidas en el archivo `pom.xml` Puedes actualizar o instalar las dependencias ejecutando

    mvn install

## Rutas de la API
A continuación se presentan las rutas disponibles para interactuar con la API:

- GET /productos: Obtiene la lista de productos.
- GET /productos/{id}: Obtiene un producto específico por su ID.
- POST /productos: Crea un nuevo producto.
- PUT /productos/{id}: Actualiza un producto existente por su ID.
- DELETE /productos/{id}: Elimina un producto por su ID.

## Ejemplo de Solicitudes

### Crear un Producto

POST /productos
Content-Type: application/json

    {
      "nombre": "Producto Ejemplo",
      "precio": 100.00
    }

## Obtener la Lista de Productos

    GET /productos

## Obtener un Producto por ID

    GET /productos/1
    
## Actualizar un Producto

    PUT /productos/1
    Content-Type: application/json

    {
    "nombre": "Producto Actualizado",
    "precio": 150.00
    }

## Eliminar un Producto

    DELETE /productos/1



