package ec.edu.epn.modelo.entidad;

import java.util.ArrayList;

public class CarroDeCompras {
    private int idCarrito;
    private Integer cantidadDeVideojuegoAgregados;
    private Double precioTotalDeCarrito;
    private ArrayList<Videojuego> videojuegosDelCarrito = new ArrayList<Videojuego>();

    public CarroDeCompras() {
        this.precioTotalDeCarrito = Double.valueOf(0);
        this.cantidadDeVideojuegoAgregados = 0;
    }

    public ArrayList<Videojuego> getVideojuegosDelCarrito() {
        return videojuegosDelCarrito;
    }

    public void agregarVideojuegoAlCarroDeCompras(Videojuego videojuego){
        videojuegosDelCarrito.add(videojuego);
        cantidadDeVideojuegoAgregados++;
        precioTotalDeCarrito += videojuego.getPrecio();
    }

    public Videojuego getVideojuegoPorID(int idBuscada) {
        for (Videojuego videojuego : videojuegosDelCarrito) {
            if (videojuego.getIdVideojuego() == idBuscada) {
                return videojuego;
            }
        }
        return null;
    }
}
