package com.hibernate4.dao;

import com.hibernate4.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.Serializable;

@Service
@Transactional
public class StudentDao  {

    @Autowired
    private SessionFactory sessionFactory;

    public void createUser(Student student1){
//        Student student1 = new Student();
        student1.setStudentId(System.currentTimeMillis());
//        student1.setStudentName("alamin");
//        student1.setStudentSection("C");

        student1.setStudentName(student1.getStudentName());
        student1.setStudentSection(student1.getStudentSection());

        var session = sessionFactory.getCurrentSession();
        try {
            session.save(student1);
        }catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

//    public void insert(Student student){
//
//        Session session = sessionFactory.getCurrentSession();
//        try{
//            session.save(student);
//        }catch (Exception e){
//            session.getTransaction().rollback();
//        }
//        session.flush();
//
//    }
}
