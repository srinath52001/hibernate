package org.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class EmClass {
    public static void main(String[] args) {
        Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

  /*      Question q1 = new Question();
        q1.setQuestion_id(01234);
        q1.setQuestion("what is java ?");

        Answer answer = new Answer();
        answer.setAnswer_id(321);
        answer.setAnswer("Java is a Programming language");
        answer.setQuestion(q1);
        q1.setAnswer(answer);


        Question q2 = new Question();
        q2.setQuestion_id(03244);
        q2.setQuestion("springboot ?");

        Answer answer1 = new Answer();
        answer1.setAnswer_id(564);
        answer1.setAnswer("collection Framework");
        answer1.setQuestion(q2);
        q2.setAnswer(answer1);

        session.save(q1);
        session.save(q2);
        session.save(answer1);
        session.save(answer);*/

        Question q = new Question();
        q.setQuestion_id(12);
        q.setQuestion("what is java");

        Answer answer = new Answer();
        answer.setAnswer_id(32);
        answer.setAnswer("java is a programming language");
        answer.setQuestion(q);

        Answer answer1 = new Answer();
        answer1.setAnswer_id(42);
        answer1.setAnswer("java is robust");
        answer1.setQuestion(q);

        Answer answer2 = new Answer();
        answer2.setAnswer_id(22);
        answer2.setAnswer("java is portable");
        answer2.setQuestion(q);
        List<Answer> list = new ArrayList();
        list.add(answer);
        list.add(answer1);
        list.add(answer2);

        q.setAnswer(list);

        session.save(q);
        session.save(answer2);
        session.save(answer);
        session.save(answer1);

        tx.commit();
        factory.close();
    }
}
