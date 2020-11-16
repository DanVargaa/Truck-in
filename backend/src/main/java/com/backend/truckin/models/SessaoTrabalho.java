package com.backend.truckin.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity(name = "sessoes")
public class SessaoTrabalho {
    public SessaoTrabalho() { }

    public SessaoTrabalho(@NotBlank @Size(max = 100) String horaInicial, @NotBlank @Size(max = 100) String horaFinal, @NotBlank @Size(max = 100) String comecoDescanso, @NotBlank @Size(max = 100) String fimDescanso, @NotBlank @Size(max = 100) String inicioUsoForaDaSessao, @NotBlank @Size(max = 100) String fimUsoForaDaSessao,
            @NotBlank @Size(max = 100) String motorista, @NotBlank @Size(max = 100) String veiculo, @NotBlank @Size(max = 100) Date data, @NotBlank @Size(max = 5000) String ocorrencias, @NotBlank @Size(max = 10) String pacote) {

        this.motorista = motorista;
        this.veiculo = veiculo;
        this.data = data;
        this.ocorrencias = ocorrencias;
        this.pacote = pacote;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.comecoDescanso = comecoDescanso;
        this.fimDescanso = fimDescanso;
        this.inicioUsoForaDaSessao = inicioUsoForaDaSessao;
        this.fimUsoForaDaSessao = fimUsoForaDaSessao;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Size(max = 100)
    private String motorista;

    @NotBlank
    @Size(max = 100)
    private String veiculo;

    @NotBlank
    @Size(max = 100)
    private Date data;

    @NotBlank
    @Size(max = 5000 )
    private String ocorrencias;

    @NotBlank
    @Size(max = 10)
    private String pacote;

    @NotBlank
    @Size(max = 100)
    private String horaInicial;

    @NotBlank
    @Size(max = 100)
    private String horaFinal;

    @NotBlank
    @Size(max = 100)
    private String comecoDescanso;

    @NotBlank
    @Size(max = 100)
    private String fimDescanso;

    @NotBlank
    @Size(max = 100)
    private String inicioUsoForaDaSessao;

    @NotBlank
    @Size(max = 100)
    private String fimUsoForaDaSessao;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(String ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public String getPacote() {
        return pacote;
    }

    public void setPacote(String pacote) {
        this.pacote = pacote;
    }
    public String getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }
}
