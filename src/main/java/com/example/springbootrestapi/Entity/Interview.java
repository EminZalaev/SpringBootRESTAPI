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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Name_id")
    private Interview name_id;

    public Interview(int cabinet) {
        this.cabinet = cabinet;
    }

    public Interview() {
    }

    public Interview getName_id() {
        return name_id;
    }

    public void setName_id(Interview name_id) {
        this.name_id = name_id;
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
}
