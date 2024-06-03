<%@ page import="ec.edu.epn.modelo.entidad.CarroDeCompras" %><%--
  Created by IntelliJ IDEA.
  User: jeanp
  Date: 1/6/2024
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pago Exitoso</title>
</head>
<body>
<% CarroDeCompras carroDeCompras = new CarroDeCompras();%>
<%session.setAttribute("carroDeCompras", carroDeCompras);%>
<h1>El pago fue realizado con exito</h1>
<a href="index.jsp">Volver a pagina inicio</a>
</body>
</html>