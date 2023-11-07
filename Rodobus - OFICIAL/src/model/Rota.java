package model;

import java.util.Date;

public class Rota {


    private int idRota;
    private String origem;
    private String destino;
    private String duracao;
    private double preco;
    
    private Date saida;
    private Date chegada;

    public int getIdRota() { return idRota; }
    public void setIdRota(int idRota) { this.idRota = idRota; }

    public String getOrigem() { return origem; }
    public void setOrigem(String origem) { this.origem = origem; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }


    public String getDuracao() { return duracao; }
    public void setDuracao(String duracao) { this.duracao = duracao; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    
        public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }
    public Date getChegada() {
        return chegada;
    }

    public void setChegada(Date chegada) {
        this.chegada = chegada;
    }
}