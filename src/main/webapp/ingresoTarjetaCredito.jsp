<%--
  Created by IntelliJ IDEA.
  User: jeanp
  Date: 31/5/2024
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pago</title>
</head>
<body>
<div class="form-container">
    <h2>Ingreso de Tarjeta de Crédito</h2>
    <form action="SvValidadorTarjetaCredito" method="post">
        <label for="numeroDeTarjeta">Número de Tarjeta:</label>
        <input type="text" id="numeroDeTarjeta" name="cardNumber" required>

        <label for="fechaDeExpiracion">Fecha de Expiración (MM/AA):</label>
        <input type="text" id="fechaDeExpiracion" name="expiryDate" required>

        <label for="cvv">CVV:</label>
        <input type="text" id="cvv" name="cvv" required>

        <input type="submit" value="Enviar">
    </form>
</div>
</body>
</html>
