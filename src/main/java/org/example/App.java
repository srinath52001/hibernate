package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println("Project Started");

        //SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = con.buildSessionFactory();

        Student student = new Student();
        student.setId(123);
        student.setName("rahul");
        student.setDesg("dev");
        System.out.println(student);

      /*  //for reading image
        FileInputStream file = new FileInputStream("src/main/java/resources/IMG_20230519_195052.jpg");
        byte[] data = new byte[file.available()];
        file.read(data);
        student.setImage(data);*/

        Session session = sessionFactory.openSession(); // to save we need current session to save into it
        Transaction tx = session.beginTransaction();
        session.save(student);
        tx.commit();
        session.close();

    }
}
