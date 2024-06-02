package ec.edu.epn.modelo.test;

import ec.edu.epn.modelo.entidad.CarroDeCompras;
import ec.edu.epn.modelo.entidad.TarjetaCredito;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

public class TarjetaCreditoTest {

    @Test
    public void given_tarjeta_fue_ingresado_when_quiera_pagar_then_aceptara_la_tarjeta() {
        String numeroTarjeta = "4857178587547167";
        String fechaExpiracion = "10/2026";
        String cvv = "967";

        assertTrue(TarjetaCredito.validarTarjeta(numeroTarjeta.toCharArray()));
    }

    @Test
    public void given_tarjeta_fue_ingresada_incorrectamente_when_quiera_pagar_then_rechazara_la_tarjeta() {
        String numeroTarjeta = "4857178587";
        String fechaExpiracion = "10/2026";
        String cvv = "967";

        assertFalse(TarjetaCredito.validarTarjeta(numeroTarjeta.toCharArray()));
    }
}


