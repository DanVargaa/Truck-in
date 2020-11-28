package com.backend.truckin.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity(name = "veiculos")

public class Veiculo extends AuditModel
{
    public Veiculo(){}

    public Veiculo(Long id, @NotBlank @Size(max = 7) String placa, @NotBlank @Size(max = 50) String montadora, @NotBlank @Size(max = 50) String modelo, @NotBlank @Size(max = 50) String categoria) {
        this.id = id;
        this.placa = placa;
        this.montadora = montadora;
        this.modelo = modelo;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Size(max = 7)
    private String placa;

    @NotBlank
    @Size(max = 50)
    private String montadora;


    public Veiculo(@NotBlank @Size(max = 500) String history) {
        this.history = history;
    }

    @NotBlank
    @Size(max = 500)
    private String history;

    @NotBlank
    @Size(max = 50)
    private String modelo;

    @NotBlank
    @Size(max = 50)
    private String categoria;
}
