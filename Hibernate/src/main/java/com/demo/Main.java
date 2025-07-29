package com.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        // st.setRollNumber(22103004);
        // st.setName("Prem");
        // st.setSubject("OOPs");
        st.setRollNumber(22103004);
        st.setName("Prem");
        st.setSubject("Computer Network");

        //hey hibernate save this object

        Configuration config = new Configuration();
        config.addAnnotatedClass(com.demo.Student.class);

        // default name not required
        config.configure("hibernate.cfg.xml");

        //it is a interface
        SessionFactory factory = config.buildSessionFactory();
        // it is a very heavy object
        // if you don't close then it will giving warning

        Session session = factory.openSession();
        // it is light weight

        // also a interface
        Transaction transaction = session.beginTransaction();
        // session.persist(st);  // save

        // fetch data
        // Student curr = session.get(Student.class,22103013);
        // Student curr = session.find(Student.class,22103013);

        // you don't need transaction for feathing , you know why
        // transaction.commit();

        // session.merge(st);
        // if object is there it will update, if not then it will create
        // for this you need transaction, you know why
        // transaction.commit();

        // delete
        Student curr = session.find(Student.class,22103013);
        session.remove(curr);
        transaction.commit();

        // System.out.println(curr);

        session.close();
        factory.close();;
    }
}
