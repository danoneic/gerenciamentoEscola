package com.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "curso")
public class Curso implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "descricao")
    private String descricao;
    @OneToMany(mappedBy="curso")
    private Set<Nivel> niveis;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    } 
    
}
