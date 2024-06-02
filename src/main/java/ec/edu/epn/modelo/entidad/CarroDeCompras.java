package ec.edu.epn.modelo.entidad;

import ec.edu.epn.modelo.persistencia.VideojuegoDAO;

import java.util.ArrayList;

public class CarroDeCompras {
    private int idCarrito;
    private Integer cantidadDeVideojuegoAgregados;
    private Double precioTotalDeCarrito;
    private ArrayList<Integer>  idsVideojegosDelCarrito;


    public CarroDeCompras(int idCarrito, Double precioTotalDeCarrito, Integer cantidadDeVideojuegoAgregados, ArrayList<Integer> idsVideojegosDelCarrito) {
        this.precioTotalDeCarrito = precioTotalDeCarrito;
        this.cantidadDeVideojuegoAgregados = cantidadDeVideojuegoAgregados;
        this.idsVideojegosDelCarrito = idsVideojegosDelCarrito;
    }

    public CarroDeCompras() {
    }

    public ArrayList<Integer> getVideojegosDelCarrito() {
        return idsVideojegosDelCarrito;
    }

    public void agregarVideojuegoAlCarroDeCompras( int idVideojuego){
        VideojuegoDAO videojuegoDAO = new VideojuegoDAO();
        idsVideojegosDelCarrito.add(videojuegoDAO.obtenerVideojuegoPorId(idVideojuego).getIdVideojuego());
        cantidadDeVideojuegoAgregados++;
        precioTotalDeCarrito += videojuegoDAO.obtenerVideojuegoPorId(idVideojuego).getPrecio();
    }

    public int getVideojuegoPorID(int idBuscada) {
        for (int id : idsVideojegosDelCarrito) {
            if (id == idBuscada) {
                return id;
            }
        }
        return 0;
    }
}
