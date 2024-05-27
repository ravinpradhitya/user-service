package com.englishlearning.user_service.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "STUDENT")
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @Column(name = "ID")
//    @GeneratedValue
    private int id;

    @Column(name = "EMAIL")
    private String studentEmail;

    @Column(name = "NAME")
    private String studentName;

    @Column(name = "ADDRESS")
    private String studentAddress;

    @Column(name = "DEPARTMENT")
    private String studentDepartment;

    @Column(name = "CLASS")
    private String studentClass;
}
