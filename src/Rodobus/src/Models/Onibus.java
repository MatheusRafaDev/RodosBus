package models;

public class Onibus {
    private int idOnibus;
    private String modelo;
    private String placa;
    private int anoFabricacao;
    private int capacidade;

    public int getIdOnibus() { return idOnibus; }
    public void setIdOnibus(int idOnibus) { this.idOnibus = idOnibus; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public int getAnoFabricacao() { return anoFabricacao; }
    public void setAnoFabricacao(int anoFabricacao) { this.anoFabricacao = anoFabricacao; }

    public int getCapacidade() { return capacidade; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }
}
