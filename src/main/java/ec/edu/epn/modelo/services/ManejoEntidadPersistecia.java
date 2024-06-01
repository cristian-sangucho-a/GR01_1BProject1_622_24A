package ec.edu.epn.modelo.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ManejoEntidadPersistecia {
    private static EntityManagerFactory entityManagerFactory;

    private ManejoEntidadPersistecia() {
        entityManagerFactory = Persistence.createEntityManagerFactory("GR01_1BP1_622_24A_PU");
        this.entityManagerFactory = entityManagerFactory;
    }

    static EntityManagerFactory getEntityManagerFactoryInstance() {
        return entityManagerFactory;
    }

    public static EntityManager getEntityManager() {
        EntityManager entityManager = getEntityManagerFactoryInstance().createEntityManager();
        return entityManager;
    }
}
