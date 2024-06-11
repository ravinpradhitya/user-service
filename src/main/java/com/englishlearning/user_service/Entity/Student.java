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
    @Column(name = "NISN", length = 10)
    private String id;

    @Column(name = "EMAIL")
    private String studentEmail;

    @Column(name = "NAME")
    private String studentName;

    @Column(name = "ADDRESS")
    private String studentAddress;
}
