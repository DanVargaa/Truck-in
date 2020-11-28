package com.backend.truckin.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity (name = "horas")
public class HorarioTrab extends AuditModel{

    public HorarioTrab(@NotBlank String hi, @NotBlank String hf, @NotBlank String di, @NotBlank String df, @NotBlank String pi, @NotBlank String pf, @NotBlank String idMotoristaH) {
        this.hi = hi;
        this.hf = hf;
        this.di = di;
        this.df = df;
        this.pi = pi;
        this.pf = pf;
        this.idMotoristaH = idMotoristaH;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String hi;

    @NotBlank
    private String hf;

    @NotBlank
    private String di;

    @NotBlank
    private String df;

    @NotBlank
    private String pi;

    @NotBlank
    private String pf;

    @NotBlank
    private String idMotoristaH;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getIdMotoristaH() {
        return idMotoristaH;
    }

    public void setIdMotoristaH(String idMotoristaH) {
        this.idMotoristaH = idMotoristaH;
    }
}