#Project1BISWD622_24A

#Description:
The software product offers customers a catalog of videogames in the store, facilitates the management of desired videogames in a shopping cart and payment for the cart.

#Elaborated by:
- Jorman Chuquer (@JorMath)
- Jean Cotera (@jeanpcot)
- Carla Ruiz (@charlie-rzu)
- Cristian Zambrano (@cristian-zambrano)
- Cristian Sangucho (@cristian-sangucho-a)

#Dependencies:

``
mockito 2.23.4
``

``
tomcat:10-jdk17-temurin-jammy
``

``
maven 3.8.5 
``

``
JDK 21.0.1
``

##TO RUN:
First, reate a docker-compose.yml file:
````
services:
webapp:
container_name: webapp
image: cristhtsirc/gr01_1bproject1_622_24a-webapp
ports:
- 8080:8080
database:
container_name: database
image: cristhtsirc/gr01_1bproject1_622_24a-database
ports:
- 3306:3306
````
Then, in the same directory:

``
docker compose up
``
Finally, go to browser and search:

``
localhost:8080/tienda/
``

##To upload the containers to DockerHub:
````
docker-compose build

docker tag gr01_1bproject1_622_24a-webapp:latest cristhtsirc/gr01_1bproject1_622_24a-webapp:latest
docker tag gr01_1bproject1_622_24a-database:latest cristhtsirc/gr01_1bproject1_622_24a-database:latest

docker push cristhtsirc/gr01_1bproject1_622_24a-webapp:latest
docker push cristhtsirc/gr01_1bproject1_622_24a-database:latest   
````

Naming variables: camelCase