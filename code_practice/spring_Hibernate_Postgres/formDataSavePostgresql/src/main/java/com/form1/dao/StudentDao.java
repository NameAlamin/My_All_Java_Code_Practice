package com.form1.dao;

import com.form1.entity.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class StudentDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void createUser(Student student){
        student.setStudentId(System.currentTimeMillis());
        student.setStudentName(student.getStudentName());
        student.setStudentSection(student.getStudentSection());
        var session = sessionFactory.getCurrentSession();
        try{
            session.save(student);
        }catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }
}
