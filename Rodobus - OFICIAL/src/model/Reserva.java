package model;

import java.util.Date;

public class Reserva {

    private int idReserva;
    private int idRota;
    private int idPassageiro;
    private Date dataReserva;
    private String status;
    private int QuantidadeReserva;
    private double ValorTotal;

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

    public int getQuantidadeReserva() {
        return QuantidadeReserva;
    }

    public void setQuantidadeReserva(int QuantidadeReserva) {
        this.QuantidadeReserva = QuantidadeReserva;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

}
