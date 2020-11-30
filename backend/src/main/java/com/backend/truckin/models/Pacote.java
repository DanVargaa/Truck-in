package com.backend.truckin.models;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity(name = "pacotes")
public class Pacote extends AuditModel{

    public Pacote() { }

    public Pacote(@NotBlank String IdMotorista, @NotBlank @Size(max = 100) String pontoDePartida, @NotBlank @Size(max = 100) String pontoDeChegada, @NotBlank @Size(max = 1000) String descricao, @NotBlank @Size(max = 100) String titulo, @NotBlank @Size(max = 100) String cliente) {
        this.pontoDePartida = pontoDePartida;
        this.pontoDeChegada = pontoDeChegada;
        this.descricao = descricao;
        this.titulo = titulo;
        this.cliente = cliente;
        this.idMotorista = idMotorista;
    }


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Size(max = 100)
    private String pontoDePartida;

    @NotBlank
    @Size(max = 100)
    private String pontoDeChegada;

    @NotBlank
    @Size(max = 1000)
    private String descricao;

    @NotBlank
    @Size(max = 100)
    private String titulo;

    @NotBlank
    @Size(max = 100)
    private String cliente;

    private
    @NotBlank String idMotorista;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPontoDePartida() {
        return pontoDePartida;
    }

    public void setPontoDePartida(String pontoDePartida) {
        this.pontoDePartida = pontoDePartida;
    }

    public String getPontoDeChegada() {
        return pontoDeChegada;
    }

    public void setPontoDeChegada(String pontoDeChegada) {
        this.pontoDeChegada = pontoDeChegada;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(String idMotorista) {
        this.idMotorista = idMotorista;
    }
}
