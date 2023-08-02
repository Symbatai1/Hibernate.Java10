package org.example2;

import org.example2.config.HibernateConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HibernateConfig.getEntityManagerFactory();
    }
}
