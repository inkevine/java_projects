package com.app.submitoo.util;


import com.app.submitoo.model.Assignment;
import com.app.submitoo.model.Submission;
import com.app.submitoo.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static {
        try {
            // Configure Hibernate and add entity classes programmatically
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")  // Load the Hibernate configuration from the XML file
                    .addAnnotatedClass(User.class)     // Add entity classes
                    .addAnnotatedClass(Assignment.class)
                    .addAnnotatedClass(Submission.class)
                    .buildSessionFactory();
        } catch (Exception e) {
            // Log the exception and throw a more detailed error message
            e.printStackTrace();
            throw new ExceptionInInitializerError("Hibernate " + e.getMessage());
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
