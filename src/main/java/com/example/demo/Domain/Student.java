package com.example.demo.Domain;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "login")
    @NotNull
    private String login;

    @Column(name = "password")
    @NotNull
    private String password;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "university")
    @NotNull
    private String university;

    @Column(name = "course")
    @NotNull
    private int course;

    public Student(@NotNull String login, @NotNull String password, @NotNull String name, @NotNull String university, @NotNull int course) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.university = university;
        this.course = course;
    }
}

