
# Online-E-Commerce-Web-Application
<p align="center">
<img width="800" height="400" src="https://static.vecteezy.com/system/resources/thumbnails/002/216/694/small/shopping-trendy-banner-vector.jpg">
</p>
<br>


# Details : 🔭
I have created REST API for Online E-Commerce Web Application which can be used by Admin and Customers to login into their profile, update their details and order products.

All this is over looked by the Admin who can access the data in the application.


We have implemented data and user validation at every step, for every user.


It has all the basic facilities that are required by an end user to have a convenient and hassle free Online E-Commerce web Experience.

<br>

> # *** Installation and Run ***
-  You can clone this repo and start the serve on localhost
-   Before running the API server, we should update the database config inside the application.properties file.
-   Update the port number, username and password as per your local database config.
```
   server.port=8088
   spring.datasource.url=jdbc:mysql://localhost:3306/shoppingdb
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.datasource.username=**mysql username**
   spring.datasource.password=**mysql password**
   spring.jpa.hibernate.git ddl-auto=update
   spring.jpa.show-sql=true
   spring.mvc.throw-exception-if-no-handler-found=true
   spring.web.resources.add-mappings=false
```

<br>

> # API / Endpoint

🚀 The Postman link to check rest Api->https://localhost:8088/

 🚀 The Swagger link to check rest Api-> http://localhost:8088/swagger-ui/

<br>

## ER Diagram
![ER diagram](https://user-images.githubusercontent.com/101566760/204717998-c039ba8c-4fe1-429a-b2ac-8877f296bf24.png)



## Tech Stack
-   Java Core
-   Spring Data JPA
-   Spring web
-   Validation
-   Spring Boot
-   Hibernate
-   MySQL
-   Swagger UI
-   Lombok
-   Postman







