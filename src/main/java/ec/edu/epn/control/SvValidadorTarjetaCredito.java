package ec.edu.epn.control;

import ec.edu.epn.modelo.entidad.TarjetaCredito;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "SvValidadorTarjetaCredito", value = "/SvValidadorTarjetaCredito")
public class SvValidadorTarjetaCredito extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String numeroTarjeta = request.getParameter("cardNumber");
        String fechaExpiracion = request.getParameter("expiryDate");

        if(!TarjetaCredito.validateCreditCard(numeroTarjeta, fechaExpiracion)){
            response.sendRedirect("pagoInvalido.jsp");
            return;
        }

        response.sendRedirect("pagoExitoso.jsp");
    }
}
