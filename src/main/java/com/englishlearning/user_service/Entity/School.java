package com.englishlearning.user_service.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name= "SCHOOL")
@NoArgsConstructor
@AllArgsConstructor
public class School {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "EMAIL")
    private String schoolEmail;

    @Column(name = "NAME")
    private String schoolName;

    @Column(name = "ADDRESS")
    private String schoolAddress;
}
