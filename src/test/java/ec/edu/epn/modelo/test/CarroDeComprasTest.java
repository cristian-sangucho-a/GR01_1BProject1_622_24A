package ec.edu.epn.modelo.test;

import ec.edu.epn.modelo.entidad.CarroDeCompras;
import ec.edu.epn.modelo.entidad.Videojuego;
import ec.edu.epn.modelo.persistencia.VideojuegoDAO;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

public class CarroDeComprasTest {
    CarroDeCompras carroDeCompras = Mockito.mock(CarroDeCompras.class);
    public static Videojuego videojuego1 = new Videojuego();
    public static Videojuego videojuego2 = new Videojuego();
    @BeforeClass
    public static void setUp() {
        String tituloEntrante = "GTA V";
        String tituloEntrante2 = "The Witcher";
        Double precioVideojuego = 20.00;
        Double precioVideojuego2 = 30.00;
        String desarrolladorVideojuego = "Jorman Chuquer";
        String desarrolladorVideojuego2 = "Cristian Sangucho";
        videojuego1.setTitulo(tituloEntrante);
        videojuego2.setTitulo(tituloEntrante2);
        videojuego1.setPrecio(precioVideojuego);
        videojuego2.setPrecio(precioVideojuego2);
        videojuego1.setNombreDeDesarrollador(desarrolladorVideojuego);
        videojuego2.setNombreDeDesarrollador(desarrolladorVideojuego2);
    }

    @Test
    public void given_juegos_fueron_agregados_when_quiera_ver_then_visualizara_los_videojuegos_del_carrito() {
        // Crear un mock de CarroDeCompras

        ArrayList<Videojuego> videojuegos = new ArrayList<>();
        videojuegos.add(videojuego1);
        videojuegos.add(videojuego2);

        // Definir el comportamiento del mock
        Mockito.when(carroDeCompras.getVideojuegosDelCarrito()).thenReturn(videojuegos);

        // Asegurarse de que la lista de videojuegos del carrito no esté vacía
        assertFalse(carroDeCompras.getVideojuegosDelCarrito().isEmpty());
    }



    @Test
    public void testAgregarVideojuegoAlCarroDeCompras() {

        // Crear el CarroDeCompras
        CarroDeCompras carroDeCompras = new CarroDeCompras();

        // Llamar al método que se está probando
        carroDeCompras.agregarVideojuegoAlCarroDeCompras(videojuego1);

        // Verificar que el Videojuego se agregó al CarroDeCompras
        assertTrue(carroDeCompras.getVideojuegosDelCarrito().contains(videojuego1));
    }
}


