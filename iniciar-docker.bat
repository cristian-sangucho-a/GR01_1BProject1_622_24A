@echo off
mvnw compile && mvnw test && mvnw package && docker compose up
pause
