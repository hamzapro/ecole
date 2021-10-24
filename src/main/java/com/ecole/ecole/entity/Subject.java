package com.ecole.ecole.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSubject;

    private String label;

    @ManyToMany
    private Set<Student> students;

    @OneToMany(mappedBy = "subject")
    private Set<Teacher> teachers;
}
