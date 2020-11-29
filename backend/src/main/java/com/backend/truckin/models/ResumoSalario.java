package com.backend.truckin.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="resumos")
public class ResumoSalario extends AuditModel {
    public ResumoSalario() {
    }

    public ResumoSalario(Double horasRegulares, Double horasExtras, Double ganhos) {
        this.horasRegulares = horasRegulares;
        this.horasExtras = horasExtras;
        this.ganhos = ganhos;

    }

    Double horasRegulares;
    Double horasExtras;
    Double ganhos;
    String mes;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Double getHorasRegulares() {
        return horasRegulares;
    }

    public void setHorasRegulares(Double salarioFinal) {
        this.horasRegulares = salarioFinal;
    }

    public Double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(Double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public Double getGanhos() {
        return ganhos;
    }

    public void setGanhos(Double ganhos) {
        this.ganhos = ganhos;
    }

}
