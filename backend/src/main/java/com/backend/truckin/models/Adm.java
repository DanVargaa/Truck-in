package com.backend.truckin.models;

import com.backend.truckin.models.AuditModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity(name = "adms")
public class Adm extends AuditModel {

    public Adm() { }

    public Adm(@NotBlank @Size(min = 8, max = 11) String senha, @NotBlank @Size(max = 50) String name, @NotBlank @Size(max = 100) String estado, @NotBlank @Size(max = 100) String cidade, @NotBlank @Size(min = 10, max = 15) String cellPhone, @NotBlank @Size(min = 11, max = 11) String cpf, @NotBlank @Size(min = 11, max = 11) String cargo, @NotBlank @Size(max = 255) String address, @NotBlank @Size(min = 8, max = 11) String since, @NotBlank @Size(min = 8, max = 11) String complemento) {
        this.name = name;
        this.estado = estado;
        this.cidade = cidade;
        this.cellPhone = cellPhone;
        this.cpf = cpf;
        this.cargo = cargo;
        this.address = address;
        this.complemento = complemento;
        this.since = since;
        this.senha = senha;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Size(max = 50)
    private String name;

    @NotBlank
    @Size(max = 100)
    private String estado;

    @NotBlank
    @Size(max = 100)
    private String cidade;

    @NotBlank
    @Size(min = 10, max = 15)
    private String cellPhone;

    @NotBlank
    @Size(min = 11, max = 11)
    private String cpf;

    @NotBlank
    @Size(min = 11, max = 11)
    private String cargo;

    @NotBlank
    @Size(max = 255)
    private String address;

    @NotBlank
    @Size(min = 8, max = 11)
    private String since;


    @NotBlank
    @Size(min = 8, max = 11)
    private String complemento;

    @NotBlank
    @Size(min = 8, max = 11)
    private String senha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = since;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }



}