###### H2 configuration for springboot application
[https://springframework.guru/using-the-h2-database-console-in-spring-boot-with-spring-security/][configuration details]

[configuration details]: https://springframework.guru/using-the-h2-database-console-in-spring-boot-with-spring-security/

Spring Boot Default H2 Database Settings
Before you login, be sure you have the proper H2 database settings. I had a hard time finding the default values used by Spring Boot, and had to use Hibernate logging to find out what the JDBC Url was being used by Spring Boot.

Value	        Setting
Driver Class	org.h2.Driver
JDBC URL	   jdbc:h2:mem:testdb
User Name	    sa
Password	    <blank>
