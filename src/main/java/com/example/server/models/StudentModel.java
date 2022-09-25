package com.example.server.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "overone129_students")
@Data
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @OneToOne
    @JoinColumn(name = "number", referencedColumnName = "number",
            nullable = false, updatable = false)
    GroupModel groupModel;
}