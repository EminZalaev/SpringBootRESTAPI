package com.example.springbootrestapi.Entity;

import javax.persistence.*;

@Entity
@Table(name = "interviewer")
public class Interviewer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "vacancy")
    private String vacancy;

    @Column(name = "date")
    private String date;

    @OneToOne(mappedBy = "name_id")
    private Interview interview;

    public Interviewer(String name, String surname, String vacancy, String date) {
        this.name = name;
        this.surname = surname;
        this.vacancy = vacancy;
        this.date = date;
    }

    public Interview getInterview() {
        return interview;
    }

    public void setInterview(Interview interview) {
        this.interview = interview;
    }

    public Interviewer(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getVacancy() {
        return vacancy;
    }

    public void setVacancy(String vacancy) {
        this.vacancy = vacancy;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
