package com.example.test.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "anno")
    private int anno;

    @ManyToMany
    @JoinColumn(name = "StudentiDellaClasse")
    private List<Studente> studenti;

    public Classe() {}

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public Integer getAnno() {return anno;}

    public void setAnno(Integer anno) {this.anno = anno;}

    public List<Studente> getStudenti() {return studenti;}

    public void setStudenti(List<Studente> studenti) {this.studenti = studenti;}




}
