package com.englishlearning.user_service.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "TEACHER")
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private int id;

    @Column(name = "EMAIL")
    private String teacherEmail;

    @Column(name = "NAME")
    private String teacherName;

    @Column(name = "ADDRESS")
    private String teacherAddress;

    @Column(name = "CLASS")
    private String teacherClass;
}
