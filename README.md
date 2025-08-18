# Spring Boot E-commerce Application

A fully functional **Spring Boot E-commerce Application** with:

* RESTful APIs for product management
* H2 in-memory database with sample data
* H2 console for database inspection
* Ready-to-run using Maven

---

## **Features**

* List all products
* Add new products via API
* H2 console enabled for database queries
* Sample data preloaded (Laptop, Phone, Headphones)

---

## **Run the Application**

1. Clone the repository:

```bash
git clone https://github.com/USERNAME/ecommerce-springboot.git
cd ecommerce-springboot
```

2. Build and run with Maven:

```bash
mvn spring-boot:run
```

3. Access APIs:

* **List Products:**
  `GET http://localhost:8080/api/products`

* **Add Product:**
  `POST http://localhost:8080/api/products`
  Body (JSON):

  ```json
  {
      "name": "Tablet",
      "description": "Android tablet",
      "price": 500
  }
  ```

---

## **H2 Console**

* URL: [http://localhost:8081/h2-console](http://localhost:8081/h2-console)
* JDBC URL: `jdbc:h2:mem:ecomdb`
* Username: `sa`
* Password: (leave blank)

> Note: Since this is an in-memory DB, all data resets when the application stops.

---

## **Technologies Used**

* Java 17
* Spring Boot 3
* Spring Data JPA
* H2 Database
* Maven

---

## **Sample Data**

| ID | Name       | Description              | Price |
| -- | ---------- | ------------------------ | ----- |
| 1  | Laptop     | High-end gaming laptop   | 1200  |
| 2  | Phone      | Latest smartphone        | 800   |
| 3  | Headphones | Noise-cancelling headset | 200   |

---

## **Author**

* Harini L
* [LinkedIn](https://www.linkedin.com/in/harini-lakshmanan-04)
