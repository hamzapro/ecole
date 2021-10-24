package com.ecole.ecole.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTeacher;
    private String lastName;
    private String firstName;
    private LocalDate subscriptionDate;
    private Long salary;
    @ManyToOne
    @JoinColumn(name = "teachers")
    private Subject subject;
}
