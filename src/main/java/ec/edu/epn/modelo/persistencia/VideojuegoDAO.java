package ec.edu.epn.modelo.persistencia;

import ec.edu.epn.modelo.services.ManejoEntidadPersistecia;
import ec.edu.epn.modelo.entidad.Videojuego;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class VideojuegoDAO {
    private String titulo;
    private String nombreDeDesarrollador;
    private double precio;
    private ManejoEntidadPersistecia manejoEntidadPersistecia; //Necesario para llamar al unico EntityManager

    public VideojuegoDAO(String titulo, String nombreDeDesarrollador, double precio) {
        this.titulo = titulo;
        this.nombreDeDesarrollador = nombreDeDesarrollador;
        this.precio = precio;
    }

    public VideojuegoDAO() {

    }


    public void crearVideojuego(Videojuego videojuegoAPersistir){
        EntityManager entityManager = manejoEntidadPersistecia.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(videojuegoAPersistir);
            entityManager.getTransaction().commit();
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }

    public List<Videojuego> obtenerTodosLosVideojuego() {
        EntityManager entityManager = manejoEntidadPersistecia.getEntityManager();
        try{
            Query query = entityManager.createQuery("SELECT v FROM Videojuego v");
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }

    public List<Videojuego> obtenerVideojuegoPorTitulo(String tituloDelVideojuego) {
        EntityManager entityManager = manejoEntidadPersistecia.getEntityManager();
        try{
            Query query = entityManager.createQuery("SELECT v FROM Videojuego v WHERE v.titulo = :tituloDelVideojuego");
            query.setParameter("tituloDelVideojuego", tituloDelVideojuego);
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }

    public List<Videojuego> obtenerVideojuegosPorRangoDePrecio(double precioMinimo, double precioMaximo) {
        EntityManager entityManager = manejoEntidadPersistecia.getEntityManager();
        try{
            Query query = entityManager.createQuery("SELECT v from Videojuego v where v.precio between :precioMinimo and :precioMaximo");
            query.setParameter("precioMinimo", precioMinimo);
            query.setParameter("precioMaximo", precioMaximo);
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }

    public List<Videojuego> obtenerVideojuegoPorDesarrollador(String nombreDeDesarrollador) {
        EntityManager entityManager = manejoEntidadPersistecia.getEntityManager();
        try{
            Query query = entityManager.createQuery("SELECT v FROM Videojuego v WHERE v.nombreDeDesarrollador = :nombreDeDesarrollador");
            query.setParameter("nombreDeDesarrollador", nombreDeDesarrollador);
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }
}
