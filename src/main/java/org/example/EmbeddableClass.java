package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableClass {

    public static void main(String[] args) {
        Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Student s1 = new Student();
        s1.setName("tiwari");
        s1.setDesg("piolet");

        Certificate certificate = new Certificate();
        certificate.setCourse("java");
        certificate.setDuration("2 mnths");

        s1.setCerti(certificate);

        Student s2 = new Student();
        s2.setName("balram");
        s2.setDesg("cook");

        Certificate certificate1 = new Certificate();
        certificate1.setCourse("python");
        certificate1.setDuration("1 mnths");

        s2.setCerti(certificate1);

        Transaction tx = session.beginTransaction();
        session.save(s1);
        session.save(s2);
        tx.commit();
        session.close();
    }
}
