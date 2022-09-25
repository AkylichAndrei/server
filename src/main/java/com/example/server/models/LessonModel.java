package com.example.server.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "overone129_lessons")
@Data
public class LessonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "lesson_name")
    private  String name;

    @Column(name = "time")
    private long time;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "number", referencedColumnName = "number")
    GroupModel groupModel;
}
