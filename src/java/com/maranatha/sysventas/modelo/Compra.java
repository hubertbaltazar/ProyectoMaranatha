/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.maranatha.sysventas.modelo;


/**
 *
 * @author Angel
 */
public class Compra {
    private int idCOMPRA;
    private int idEMPLEADO;
    private int  idPROVEEDOR;
    private String Fecha;
    private double Subtotal;
    private double Total;
    private double igv;

    public Compra() {
    }

    public Compra(int idCOMPRA, int idEMPLEADO, int idPROVEEDOR, String Fecha, double Subtotal, double Total, double igv) {
        this.idCOMPRA = idCOMPRA;
        this.idEMPLEADO = idEMPLEADO;
        this.idPROVEEDOR = idPROVEEDOR;
        this.Fecha = Fecha;
        this.Subtotal = Subtotal;
        this.Total = Total;
        this.igv = igv;
    }

    public int getIdCOMPRA() {
        return idCOMPRA;
    }

    public void setIdCOMPRA(int idCOMPRA) {
        this.idCOMPRA = idCOMPRA;
    }

    public int getIdEMPLEADO() {
        return idEMPLEADO;
    }

    public void setIdEMPLEADO(int idEMPLEADO) {
        this.idEMPLEADO = idEMPLEADO;
    }

    public int getIdPROVEEDOR() {
        return idPROVEEDOR;
    }

    public void setIdPROVEEDOR(int idPROVEEDOR) {
        this.idPROVEEDOR = idPROVEEDOR;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }
 
}