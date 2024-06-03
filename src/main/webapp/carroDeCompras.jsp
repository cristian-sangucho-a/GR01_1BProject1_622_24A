<%@ page import="java.util.List" %>
<%@ page import="ec.edu.epn.modelo.entidad.Videojuego" %>
<%@ page import="ec.edu.epn.modelo.persistencia.VideojuegoDAO" %>
<%@ page import="ec.edu.epn.modelo.entidad.CarroDeCompras" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: usuario
  Date: 31/5/2024
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% CarroDeCompras cdp =(CarroDeCompras) session.getAttribute("carroDeCompras");%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Bienvenido a tu carrito de compras</h1>
<br>
<hr>
<a href="ingresoTarjetaCredito.jsp"><h3>Pagar</h3></a>
<hr>
<a href="index.jsp">Volver</a> <br>
<hr>
<p>Cantidad de videojuegos : <%= cdp.getCantidadDeVideojuegoAgregados()%></p>

<p>Precio del carrito: <%=cdp.getPrecioTotalDeCarrito()%></p>
<hr>
<br>
<%
    CarroDeCompras carroDeCompras = (CarroDeCompras) session.getAttribute("carroDeCompras");
    ArrayList<Videojuego> videojuegos = carroDeCompras.getVideojuegosDelCarrito();
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

<%
    }
%>


</body>
</html>
