/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotallermecanico;

/**
 *
 * @author WALMART
 */
public class Auto{
    private int modelo;
    private String marca;
    private String nombrec;
    private String servicio;
    private long fechaE;
    private float costoS;
    
    public Auto(int modelo, String marca, String nombrec, String servicio, long fechaE, float costoS)
    {
    this.modelo=0;
    this.marca="";
    this.nombrec="";
    this.fechaE=0;
    this.servicio="";
    this.costoS=0;
    
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public long getFechaE() {
        return fechaE;
    }

    public void setFechaE(long fechaE)
    {
    this.fechaE=fechaE;
    }

    public float getCostoS() {
        return costoS;
    }

    public void setCostoS(float costoS) {
        this.costoS = costoS;
    }
    
   
}
