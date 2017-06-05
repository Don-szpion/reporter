package org.mkssu.dao.entity;

import javax.persistence.*;

/**
 * Created by Don-Szpion on 04.06.2017.
 */
@Entity
@Table(name = "Student")
public class Student {
    @Id
    @Column(name = "STUDENT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int student_id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "MARK")
    private String mark;
    @Column(name = "EMAIL")
    private String email;

    public long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}