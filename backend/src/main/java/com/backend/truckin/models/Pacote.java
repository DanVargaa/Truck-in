package com.backend.truckin.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity(name = "sessaoPacote")
public class Pacote {

    public Pacote() { }
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    public Pacote(@NotBlank long IdMotorista, @NotBlank @Size(max = 100) String pontoDePartida, @NotBlank @Size(max = 100) String pontoDeChegada, @NotBlank @Size(max = 1000) String descricao, @NotBlank @Size(max = 100) String titulo, @NotBlank @Size(max = 100) String cliente) {
        this.pontoDePartida = pontoDePartida;
        this.pontoDeChegada = pontoDeChegada;
        this.descricao = descricao;
        this.titulo = titulo;
        this.cliente = cliente;
        this.IdMotorista = IdMotorista;
    }

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

    @NotBlank
    private long IdMotorista;


}
