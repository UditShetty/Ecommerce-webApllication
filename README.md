
# Online-E-Commerce-Web-Application

# Details : 🔭
I have created REST API for Online E-Commerce Web Application which can be used by Admin and Customers to login into their profile, update their details and order products.

All this is over looked by the Admin who can access the data in the application.


We have implemented data and user validation at every step, for every user.


It has all the basic facilities that are required by an end user to have a convenient and hassle free Online E-Commerce web Experience.



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
![UML Diagram1](https://user-images.githubusercontent.com/101566228/184973861-3a0d1ef2-f9b6-44fd-9ddc-978127509434.jpg)


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


## Documentation

[Swagger UI API Documentation Online Shopping App.pdf](https://github.com/premsg1610/Online-Shopping-App-/files/9387667/Swagger.UI.API.Documentation.Online.Shopping.App.pdf)




