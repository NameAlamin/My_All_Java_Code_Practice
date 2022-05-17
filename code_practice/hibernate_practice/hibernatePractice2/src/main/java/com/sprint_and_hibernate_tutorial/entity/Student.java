package com.sprint_and_hibernate_tutorial.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "studentId")
    private long studentId;

    public long getKhokonId() {
        return studentId;
    }

    public void setKhokonId(long khokonId) {
        this.studentId = khokonId;
    }

    @Column(name = "studentName")
    private String studentName;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Column(name = "studentSection")
    private String studentSection;

    public String getStudentSection() {
        return studentSection;
    }

    public void setStudentSection(String studentSection) {
        this.studentSection = studentSection;
    }
}
