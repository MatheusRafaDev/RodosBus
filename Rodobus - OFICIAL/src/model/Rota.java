package model;

import java.util.Date;

public class Rota {

 

    private int idRota;
    private String origem;
    private String destino;
    private String dsDuracao;
    private double vlPreco;
    private Date dtSaida;
    private Date dtChegada;
    private int idMotorista;
    private int idOnibus;
    private String NomeMotorista;
    
    public int getIdOnibus() {
        return idOnibus;
    }

    public void setIdOnibus(int idOnibus) {
        this.idOnibus = idOnibus;
    }
    
    public String getNomeMotorista() {
        return NomeMotorista;
    }

    public void setNomeMotorista(String NomeMotorista) {
        this.NomeMotorista = NomeMotorista;
    }
    
    
    public int getIdRota() {
        return idRota;
    }

    public void setIdRota(int idRota) {
        this.idRota = idRota;
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

    public String getDsDuracao() {
        return dsDuracao;
    }

    public void setDsDuracao(String dsDuracao) {
        this.dsDuracao = dsDuracao;
    }

    public double getVlPreco() {
        return vlPreco;
    }

    public void setVlPreco(double vlPreco) {
        this.vlPreco = vlPreco;
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

    public int getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(int idMotorista) {
        this.idMotorista = idMotorista;
    }
}
