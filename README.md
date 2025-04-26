# Hibernate Basics Project

This project demonstrates **Hibernate ORM (Object Relational Mapping)** fundamentals using a **Hibernate configuration file (`hibernate.cfg.xml`)**. It covers a variety of mappings, including:

- **One-to-One**, **One-to-Many**, **Many-to-One**, **Many-to-Many** relationships
- **Inheritance Strategies** (Table per Hierarchy, Table per Class, Table per Subclass)
- **Collection Mapping**
- **Second-level Caching** with **Ehcache**

The project uses **MySQL** as the database and organizes entity classes based on different mapping strategies.

---

## Project Structure

- `com.firstHB.Student`
- `one.to.one.Employee`, `one.to.one.Full_Name`
- `one.to.many.Question`, `one.to.many.Answer`
- `many.to.one.Department`, `many.to.one.Person`
- `many.to.many.Customer`, `many.to.many.Product`
- `TPH.Animal`, `TPH.Cat`, `TPH.Dog`
- `TPC.Ani`, `TPC.Fish`, `TPC.Sparrow`
- `TPS.Vehicle`, `TPS.Car`, `TPS.Helicopter`
- `collection.Candidate`, `collection.Call`
- `caching.Student1`

---

## Prerequisites

- **Java JDK 8 or higher**
- **MySQL Server** (Running on `localhost:3306`)
- **Maven** (optional, for dependency management)
- **IDE** like IntelliJ IDEA, Eclipse, or VSCode
- **Hibernate ORM Library**
- **MySQL Connector/J Driver**
- **Ehcache 3.x**

---

## Database Setup

Create `hibernate.cfg.xml` in src/main/resources

```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
		"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
		"http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
	<session-factory>
	
		<!-- Enable second-level cache -->
		<property name="hibernate.cache.use_second_level_cache">true</property> 
		<!-- Configure the region factory for Ehcache 3.x -->
		<property name="hibernate.cache.region.factory_class">org.hibernate.cache.ehcache.EhCacheRegionFactory</property>
		<property name="hibernate.cache.use_query_cache">true</property>

		<property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
		<property name="hibernate.connection.password">your password</property>
		<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/firstdb</property>
		<property name="hibernate.connection.username">root</property>
		<property name="hibernate.dialect">org.hibernate.dialect.MySQL8Dialect</property>
		<property name="hibernate.show_sql">true</property>
		<property name="hibernate.hbm2ddl.auto">update</property>

    <!-- Mapping for classes of package com.firstHB -->
		<mapping class="com.firstHB.Student" />  3all mappings will be needed here

	</session-factory>
</hibernate-configuration>

```

1. Create a MySQL database named **`firstdb`**:   
```sql
CREATE DATABASE firstdb;      #change accordingly by making a table of your choice

```

2. Hibernate will automatically manage table creation and updates using:

```xml
<property name="hibernate.hbm2ddl.auto">update</property>
```

---

## How to Run

1. **Clone or download** the project.
2. **Update database credentials** (if needed) in `hibernate.cfg.xml`:

```xml
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">your password</property>
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/firstdb</property>
```

3. **Build the project** and **run your main application** class containing Hibernate logic (SessionFactory creation, CRUD operations, etc.).
4. **Check the console** output for SQL logs and database transactions.

---

## Features Used

- **Hibernate Annotations for Mapping**
- **Session Management**
- **Automatic Schema Generation**
- **Second-Level Caching** with **Ehcache**
- **Entity Relationship Handling**
- **Inheritance Strategies**
- **Collection Mapping**

---

## Technologies Used

| Technology         | Version / Info      |
|---------------------|---------------------|
| Java                | 8+                  |
| Hibernate ORM       | 5.x / 6.x Compatible |
| MySQL               | 5.7 / 8.0            |
| Ehcache             | 3.x                 |
| Maven               | Optional             |

---

## Important Notes

- **Driver Class**: If using MySQL 8+, prefer `com.mysql.cj.jdbc.Driver` instead of `com.mysql.jdbc.Driver`.
- **Caching**: Ehcache is configured. Ensure the `ehcache.xml` file is present if specific configurations are needed.
- **Dependencies**: Include Hibernate Core, Hibernate Ehcache, and MySQL Connector/J.

Example Maven dependencies:

```xml
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>5.6.15.Final</version>
</dependency>

<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-ehcache</artifactId>
    <version>5.6.15.Final</version>
</dependency>

<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.33</version>
</dependency>
```

---

## License

This project is for educational purposes only.

