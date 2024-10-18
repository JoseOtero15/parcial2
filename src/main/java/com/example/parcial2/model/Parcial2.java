package com.example.parcial2.model;
import jakarta.persistence.*;

@Entity
@Table(name = "parcial2")
public class Parcial2 {
    @Id
    @Column(name = "id")
    private Long id;

    public Parcial2() {
    }

    public Parcial2(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
