package com.app.submitoo.test;

import com.app.submitoo.util.HibernateUtil;
import org.hibernate.Session;


public class HibernateTest {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Hibernate connection successful!");
        session.close();
    }
}
