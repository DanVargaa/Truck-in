package com.backend.truckin.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="resumos")
public class ResumoSalario extends AuditModel {
    public ResumoSalario(){}

    public ResumoSalario(Double salarioFinal, Double horasExtras, Double ganhos, String mes) {
        this.salarioFinal = salarioFinal;
        this.horasExtras = horasExtras;
        this.ganhos = ganhos;
        this.mes = mes;
    }

    Double salarioFinal;
    Double horasExtras;
    Double ganhos;
    String mes;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    public Double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(Double salarioFinal) {
        this.salarioFinal = salarioFinal;
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

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}
