package org.mkssu.dao.entity;

import javax.persistence.*;

/**
 * Created by Don-Szpion on 04.06.2017.
 */
@Entity
@Table(name = "students")
public class Student {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "mark")
    private String mark;
    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mark='" + mark + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}