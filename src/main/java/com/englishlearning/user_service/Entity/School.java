package com.englishlearning.user_service.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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

    @JsonIgnore
    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Student> students;
}
