# Usar la imagen oficial de MariaDB
FROM mariadb:latest

# Configurar variables de entorno para MariaDB
ENV MARIADB_ROOT_PASSWORD=root
ENV MARIADB_DATABASE=tiendavideojuegos

# Copiar los archivos de configuración y de inicialización a la imagen
COPY ./my.cnf /etc/mysql/my.cnf
COPY ./init.sql /docker-entrypoint-initdb.d/init.sql

# Exponer el puerto de MariaDB
EXPOSE 3306
