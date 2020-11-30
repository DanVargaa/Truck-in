package com.backend.truckin.models;


import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.Calendar;


@Entity(name = "sessaoTrabalho")
public class SessaoTrabalho extends AuditModel{

    public SessaoTrabalho() {}

    public SessaoTrabalho(Long id, String tituloTrab, String nomeCliente, Long idMot, String veiculo, Long idPac, Calendar hi, Calendar hf, Calendar di, Calendar df, Calendar pi, Calendar pf, String ocorrencia, Long status) {
        this.id = id;
        this.tituloTrab = tituloTrab;
        this.nomeCliente = nomeCliente;
        this.idMot = idMot;
        this.veiculo = veiculo;
        this.idPac = idPac;
        this.hi = hi;
        this.hf = hf;
        this.di = di;
        this.df = df;
        this.pi = pi;
        this.pf = pf;
        this.ocorrencia = ocorrencia;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String tituloTrab;

    private String nomeCliente;

    private Long idMot;

    private String veiculo;

    private Long idPac;

    private Calendar hi;

    private Calendar hf;

    private Calendar di;

    private Calendar df;

    private Calendar pi;

    private Calendar pf;

    private String ocorrencia;

    private Long status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTituloTrab() {
        return tituloTrab;
    }

    public void setTituloTrab(String tituloTrab) {
        this.tituloTrab = tituloTrab;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Long getIdMot() {
        return idMot;
    }

    public void setIdMot(Long idMot) {
        this.idMot = idMot;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public Long getIdPac() {
        return idPac;
    }

    public void setIdPac(Long idPac) {
        this.idPac = idPac;
    }

    public Calendar getHi() {
        return hi;
    }

    public void setHi(Calendar hi) {
        this.hi = hi;
    }

    public Calendar getHf() {
        return hf;
    }

    public void setHf(Calendar hf) {
        this.hf = hf;
    }

    public Calendar getDi() {
        return di;
    }

    public void setDi(Calendar di) {
        this.di = di;
    }

    public Calendar getDf() {
        return df;
    }

    public void setDf(Calendar df) {
        this.df = df;
    }

    public Calendar getPi() {
        return pi;
    }

    public void setPi(Calendar pi) {
        this.pi = pi;
    }

    public Calendar getPf() {
        return pf;
    }

    public void setPf(Calendar pf) {
        this.pf = pf;
    }

    public String getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(String ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}
