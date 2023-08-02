package org.example2.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example2.entity.Medicines;
import org.example2.entity.Pharmacy;
import org.example2.entity.Worker;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.awt.print.Book;
import java.util.Properties;

public class HibernateConfig {
    public static EntityManager getEntityManagerFactory() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "org.postgresql.Driver");
        properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/postgres");
        properties.put(Environment.USER, "postgres");
        properties.put(Environment.PASS, "1234");
        properties.put(Environment.HBM2DDL_AUTO, "create");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
        properties.put(Environment.SHOW_SQL, "true");


        Configuration configuration = new Configuration();
        configuration.addProperties(properties);
        configuration.addAnnotatedClass(Worker.class);
        configuration.addAnnotatedClass(Medicines.class);
        configuration.addAnnotatedClass(Pharmacy.class);
        return configuration.buildSessionFactory().createEntityManager();
    }
    }
