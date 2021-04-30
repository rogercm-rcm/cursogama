package br.itau.projeto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // declarando para o JPA que vai utilizar um BD
@Table(name = "itmn_usuario")

public class User {
    
    @Id //indica chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto numerado pelo banco no padrao 1,2,3,...
    @Column(name = "id") //nome da coluna no BD
    private int id;
    
    @Column(name = "nome", length = 100, nullable = false) // length tamanho do bco, e nullable mostra que o campo é obrigatorio
    private String nome;

    @Column(name = "email", length = 100, nullable = false, unique = true) //unique este campo server para mostrar somente um campo
    private String email;
    
    @Column(name = "racf", length = 7, nullable = false, unique = true)
    private String racf;
    
    @Column(name = "senha", length = 30, nullable = false)
    private String senha;

    @Column(name = "linkfoto", length = 200)
    private String linkFoto;

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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRacf() {
        return racf;
    }
    public void setRacf(String racf) {
        this.racf = racf;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getLinkFoto() {
        return linkFoto;
    }
    public void setLinkFoto(String linkFoto) {
        this.linkFoto = linkFoto;
    }
    
}
