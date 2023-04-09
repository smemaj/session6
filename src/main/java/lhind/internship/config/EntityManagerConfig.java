package lhind.internship.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class EntityManagerConfig {

    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("jpa-intro");
    private static final EntityManager ENTITY_MANAGER = FACTORY.createEntityManager();

    private EntityManagerConfig(){}

    public static EntityManager getEntityManager(){
        return ENTITY_MANAGER;
    }

}
