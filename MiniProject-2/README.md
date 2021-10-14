
CS590: MINI PROJECT 02

YAFIET WELDEGABIR & SAMUEL MELAKE


Video description: https://youtu.be/sN43cePSnGI

This project consists of seven microservices. All microservices have their roles to play to make the e-store run smoothly. Furthermore, we have used MySQL database. In the following, we have listed all the microservice with services their provide.

Account service
•	Sets up an account for a customer
•	Stores account details in database

Order service
•	Product registration and updating incase products quantity is low
•	Creating order initiated by a customer who has an account
•	Stock management
•	Authentication (security)

Payment service
•	Payment methods registrations (PayPal and Credit Card)

Shipping service
•	Handles shipping statues of ordered products

Configuration service
•	Uploaded a config file to GitHub and linked to the micro services configuration so as to reduce the file size and repetition

Eureka service register
•	Instead of using IPs we use eureka registry to call the other services by their name

API Gateway
•	Its works as a gateway to access the inner services
