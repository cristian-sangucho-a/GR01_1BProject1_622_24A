package ec.edu.epn.modelo.test;

import ec.edu.epn.modelo.entidad.CarroDeCompras;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

public class CarroDeComprasTest {

    @Test
    public void given_juegos_fueron_agregados_when_quiera_ver_then_visualizara_los_videojuegos_del_carrito() {
        //Crear el carrito de compras
        CarroDeCompras carroDeCompras = new CarroDeCompras();
        carroDeCompras.agregarVideojuegoAlCarroDeCompras(1);
        assertFalse(carroDeCompras.getVideojegosDelCarrito().isEmpty());
    }

    @Test
    public void given_juego_seleccionado_when_quiera_agregarlo_then_estaran_en_el_carrito() {
        CarroDeCompras carroDeCompras = new CarroDeCompras();
        carroDeCompras.agregarVideojuegoAlCarroDeCompras(1);
        assertEquals(1, carroDeCompras.getVideojuegoPorID(1));
    }


}