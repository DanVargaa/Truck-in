package com.backend.truckin.models;


import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity(name = "sessaoTrabalho")
public class SessaoTrabalho extends AuditModel{

    public SessaoTrabalho() {}

    public SessaoTrabalho(Long status, String tituloTrab, String nomeCliente, Long idMot, String veiculo, Long idPac, String hi, String hf, String di, String df, String pi, String pf, String ocorrencia) {
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

    private String hi;

    private String hf;

    private String di;

    private String df;

    private String pi;

    private String pf;

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

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    //------------------------------------------------------

    public String getHi() {
        return hi;
    }

    public void setHi(String hi) {
        this.hi = hi;
    }

    public String getHf() {
        return hf;
    }

    public void setHf(String hf) {
        this.hf = hf;
    }

    public String getDi() {
        return di;
    }

    public void setDi(String di) {
        this.di = di;
    }

    public String getDf() {
        return df;
    }

    public void setDf(String df) {
        this.df = df;
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getPf() {
        return pf;
    }

    public void setPf(String pf) {
        this.pf = pf;
    }

    public String getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(String ocorrencia) {
        this.ocorrencia = ocorrencia;
    }
}
