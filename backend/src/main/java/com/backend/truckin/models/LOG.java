package com.backend.truckin.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity(name="loggs")
public class LOG extends AuditModel {
    public LOG(){}
    public LOG(Long idAdm, @NotBlank Long idUser, @NotBlank @Size(max = 50) String acaoEfetuada) {
        this.idAdm = idAdm;
        this.idUser = idUser;
        this.acaoEfetuada = acaoEfetuada;

    }


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idAdm;
    @NotBlank
    private Long idUser;
    @NotBlank

    private String acaoEfetuada;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getAcaoEfetuada() {
        return acaoEfetuada;
    }
    public void setAcaoEfetuada(String acaoEfetuada) {
        this.acaoEfetuada = acaoEfetuada;
    }
    @NotBlank
    public Long getIdAdm() {
        return idAdm;
    }
    public void setIdAdm(Long idAdm) {
        this.idAdm = idAdm;
    }

}
