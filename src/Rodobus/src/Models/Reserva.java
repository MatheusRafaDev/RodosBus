package Models;

import java.util.Date;

public class Reserva {
    private int idReserva;
    private int idRota;
    private int idOnibus;
    private int idMotorista;
    private int idPassageiro;
    private Date dataReserva;
    private String status;

    public int getIdReserva() { return idReserva; }
    public void setIdReserva(int idReserva) { this.idReserva = idReserva; }

    public int getIdRota() { return idRota; }
    public void setIdRota(int idRota) { this.idRota = idRota; }

    public int getIdOnibus() { return idOnibus; }
    public void setIdOnibus(int idOnibus) { this.idOnibus = idOnibus; }

    public int getIdMotorista() { return idMotorista; }
    public void setIdMotorista(int idMotorista) { this.idMotorista = idMotorista; }

    public int getIdPassageiro() { return idPassageiro; }
    public void setIdPassageiro(int idPassageiro) { this.idPassageiro = idPassageiro; }

    public Date getDataReserva() { return dataReserva; }
    public void setDataReserva(Date dataReserva) { this.dataReserva = dataReserva; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}