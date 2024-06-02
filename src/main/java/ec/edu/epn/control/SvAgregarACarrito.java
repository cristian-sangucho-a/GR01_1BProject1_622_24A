package ec.edu.epn.control;

import ec.edu.epn.modelo.entidad.CarroDeCompras;
import ec.edu.epn.modelo.entidad.Videojuego;
import ec.edu.epn.modelo.persistencia.VideojuegoDAO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "SvAgregarACarrito", value = "/SvAgregarACarrito")
public class SvAgregarACarrito extends HttpServlet {
    CarroDeCompras carroDeCompras = new CarroDeCompras();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idVideojuego = Integer.parseInt(request.getParameter("idVideojuego"));
        VideojuegoDAO vDAO = new VideojuegoDAO();
        carroDeCompras.agregarVideojuegoAlCarroDeCompras(vDAO.obtenerVideojuegoPorId(idVideojuego));
        response.sendRedirect("index.jsp");
    }
}
