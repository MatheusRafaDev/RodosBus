package models;

public class Rota {
    private int idRota;
    private String origem;
    private String destino;
    private double distancia;
    private String duracao;
    private double preco;

    public int getIdRota() { return idRota; }
    public void setIdRota(int idRota) { this.idRota = idRota; }

    public String getOrigem() { return origem; }
    public void setOrigem(String origem) { this.origem = origem; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public double getDistancia() { return distancia; }
    public void setDistancia(double distancia) { this.distancia = distancia; }

    public String getDuracao() { return duracao; }
    public void setDuracao(String duracao) { this.duracao = duracao; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
}