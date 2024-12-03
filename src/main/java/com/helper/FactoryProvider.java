package com.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {

    // session factory var
    private static SessionFactory sessionFactory;

    // get session factory object
    private static SessionFactory getFactory() {

        // if not initialized then it will firstly init the member
        if (sessionFactory != null) {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        }

        return sessionFactory;
    }

    // close session factory
    public void closeFactory() {
        if (sessionFactory.isOpen()) {
            sessionFactory.close();
        }
    }
}