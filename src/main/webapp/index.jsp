<%@ page import="java.util.List" %>
<%@ page import="ec.edu.epn.modelo.entidad.Videojuego" %>
<%@ page import="ec.edu.epn.modelo.persistencia.VideojuegoDAO" %>
<%@ page import="ec.edu.epn.modelo.entidad.CarroDeCompras" %>
<%--
  Created by IntelliJ IDEA.
  User: usuario
  Date: 31/5/2024
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tienda</title>
</head>
<body>
<h1>Bienvenido a la tienda de videojuegos</h1>

<form action="carroDeCompras.jsp">
    <input type="submit" value="Ir al carrito de compras">
</form>

<div>
    <li class="search-option">
        Búsqueda por título: <form action="SvBusquedaTitulo" method="get">
        <input type="text" name="titulo" placeholder="Escribe el título">
        <input type="submit" value="Buscar">
    </form>
    </li>
    <li class="search-option">
        Busqueda por desarrollador: <form action="SvBusquedaDesarrollador" method="get">
        <input type="text" name="desarrollador" placeholder="Escribe el nombre del desarrollador">
        <input type="submit" value="Buscar">
    </form>
    </li>
    <li class="search-option">
        Búsqueda por rango de precio: <form action="SvBusquedaRangoPrecio" method="get">
        <input type="text" name="precio_min" placeholder="Precio mínimo">
        <input type="text" name="precio_max" placeholder="Precio máximo">
        <input type="submit" value="Buscar">
    </form>
    </li>
</div>
<!--MOSTRAR EL CATALOGO-->
<h1>Catálogo de Videojuegos</h1>
<%
    VideojuegoDAO videojuegoDAO = new VideojuegoDAO();
    List<Videojuego> videojuegos = videojuegoDAO.obtenerTodosLosVideojuego();
    for (Videojuego videojuego : videojuegos) {
%>
<p><b>Juego N°: <%=videojuego.getIdVideojuego()%>
</b></p>
<p>Titulo: <%=videojuego.getTitulo()%>
</p>
<p>
    Empresa desarrolladora: <%=videojuego.getNombreDeDesarrollador()%>
</p>
<p>Precio: <%=videojuego.getPrecio()%>
</p>
<form action="SvAgregarACarrito" method="get">
    <input type="hidden" name="idVideojuego" value="<%=videojuego.getIdVideojuego()%>">
    <button type="submit">Agregar al carrito</button>
</form>
<%
    }
%>


</body>
</html>
