package com.backend.truckin.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;


@Entity (name = "users")
public class User extends AuditModel{

    public User() { }

    public User(@NotBlank @Size(max = 50) String senha, @NotBlank @Size(max = 50) String name, @NotBlank @Size(max = 100) String lastName, @NotBlank @Size(min = 10, max = 15) String cellPhone, @NotBlank @Size(min = 11, max = 11) String cpf, @NotBlank @Size(min = 11, max = 11) String cnh, @NotBlank @Size(max = 255) String address, @NotBlank @Size(min = 8, max = 11) String since) {
        this.name = name;
        this.lastName = lastName;
        this.cellPhone = cellPhone;
        this.cpf = cpf;
        this.cnh = cnh;
        this.address = address;
        this.since = since;
        this.senha = senha;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Size(max = 50)
    private String senha;

    @NotBlank
    @Size(max = 50)
    private String name;

    @NotBlank
    @Size(max = 100)
    private String lastName;

    @NotBlank
    @Size(min = 10, max = 15)
    private String cellPhone;

    @NotBlank
    @Size(min = 11, max = 11)
    private String cpf;

    @NotBlank
    @Size(min = 11, max = 11)
    private String cnh;

    @NotBlank
    @Size(max = 255)
    private String address;

    @NotBlank
    @Size(min = 8, max = 8)
    private String since;

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
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

    public String getSenha() { return senha; }

    public void setSenha(String senha) { this.senha = senha; }


}