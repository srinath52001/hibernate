package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
    public static void main(String[] args) {

        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = con.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Student student = session.load(Student.class,123);
        System.out.println(student.getDesg());
    }
}
