
## 🧩 Descripción general

La solución expone un endpoint REST que:

1. Recibe un pedido en formato JSON
2. Realiza la transformación a XML según el esquema requerido
3. Consume el servicio externo proporcionado
4. Transforma la respuesta XML a JSON
5. Retorna la información al cliente

Se siguió una estructura por capas para mantener el código organizado y escalable (controller, service, client, mapper, dto).

---

## 🔗 Endpoint de prueba proporcionado

Se utilizó el siguiente endpoint para simular la integración:

```
https://run.mocky.io/v3/19217075-6d4e-4818-98bc-416d1feb7b84
```

> Nota: Durante las pruebas, el endpoint no respondia, no se si por algun bloqueo de mi red o algo similar.

---

## 📥 Endpoint expuesto

**POST**

```
http://localhost:8080/api/pedidos
```



## 🏗️ Estructura del proyecto

```
com.example.seti.demo
│
├── controller
├── service
├── client
├── mapper
├── dto
```

Se separaron responsabilidades para facilitar mantenimiento y pruebas.

---

## 🐳 Ejecución con Docker

### 1. Construir el proyecto

```bash
mvn clean package
```

### 2. Construir la imagen

```bash
docker build -t pedidos-api .
```

### 3. Ejecutar el contenedor

```bash
docker run -p 8080:8080 pedidos-api
```

---

## ⚙️ Tecnologías utilizadas

* Java 21
* Spring Boot
* Maven
* Docker
* Lombok


