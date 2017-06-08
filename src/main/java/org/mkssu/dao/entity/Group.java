package org.mkssu.dao.entity;

import javax.naming.Name;
import javax.persistence.*;
import java.util.List;

/**
 * Created by Don-Szpion on 09.06.2017.
 */
@Entity
@Table (name = "group")
public class Group {
    @Id
    @Column(name = "group_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "group")
    private List<Student> students;
    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
