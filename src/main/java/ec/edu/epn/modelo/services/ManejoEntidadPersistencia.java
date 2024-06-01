package ec.edu.epn.modelo.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ManejoEntidadPersistencia {
    private static EntityManagerFactory entityManagerFactory;

    static {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("GR01_1BP1_622_24A_PU");
        } catch (Exception e) {
            e.printStackTrace(); // Manejo de excepción
        }
    }

    private ManejoEntidadPersistencia() {
    }

    static EntityManagerFactory getEntityManagerFactoryInstance() {
        return entityManagerFactory;
    }

    public static EntityManager getEntityManager() {
        return getEntityManagerFactoryInstance().createEntityManager();
    }
}
