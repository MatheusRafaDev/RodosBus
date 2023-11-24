package model;

import java.util.Date;

public class ReservaInfo {

    private int idReserva;
    private int idRota;
    private int idOnibus;
    private int idMotorista;
    private int idPassageiro;
    private Date dataReserva;
    private String status;
    private String nomeMotorista;
    private String nomePassageiro;
    private String origem;
    private String destino;
    private Date dtSaida;
    private Date dtChegada;
    private String modeloOnibus;

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdRota() {
        return idRota;
    }

    public void setIdRota(int idRota) {
        this.idRota = idRota;
    }

    public int getIdOnibus() {
        return idOnibus;
    }

    public void setIdOnibus(int idOnibus) {
        this.idOnibus = idOnibus;
    }

    public int getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(int idMotorista) {
        this.idMotorista = idMotorista;
    }

    public int getIdPassageiro() {
        return idPassageiro;
    }

    public void setIdPassageiro(int idPassageiro) {
        this.idPassageiro = idPassageiro;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(Date dtSaida) {
        this.dtSaida = dtSaida;
    }

    public Date getDtChegada() {
        return dtChegada;
    }

    public void setDtChegada(Date dtChegada) {
        this.dtChegada = dtChegada;
    }

    public String getModeloOnibus() {
        return modeloOnibus;
    }

    public void setModeloOnibus(String modeloOnibus) {
        this.modeloOnibus = modeloOnibus;
    }
}


