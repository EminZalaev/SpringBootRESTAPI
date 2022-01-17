package com.example.springbootrestapi.Entity;

import javax.persistence.*;

@Entity
@Table(name = "interview")
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "cabinet")
    private int cabinet;

    @Column(name = "interviewername")
    private String interviewername;

    public Interview(String name, int cabinet, String interviewerName) {
        this.cabinet = cabinet;
        this.interviewername = interviewername;
    }

    public Interview() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCabinet() {
        return cabinet;
    }

    public void setCabinet(int cabinet) {
        this.cabinet = cabinet;
    }

    public String getInterviewerName() {
        return interviewername;
    }

    public void setInterviewerName(String interviewerName) {
        this.interviewername = interviewerName;
    }
}
