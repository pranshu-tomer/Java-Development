package com.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
// @Entity(name = "Class") it change table name and also entity name
// @Table(name = "Class")
public class Student {

    @Id
    private int rollNumber;
    // @Column(name = "Full Name")
    private String name;
    // @Column(name = "selected subject")
    private String subject;

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
