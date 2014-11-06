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
public class Privilegio {
    private int idPRIVILEGIO;
    private int idPRIVILEGIO_2;
    private String Nombre;
    private String Url;
    private String Estado;

    public Privilegio() {
    }

    public Privilegio(int idPRIVILEGIO, int idPRIVILEGIO_2, String Nombre, String Url, String Estado) {
        this.idPRIVILEGIO = idPRIVILEGIO;
        this.idPRIVILEGIO_2 = idPRIVILEGIO_2;
        this.Nombre = Nombre;
        this.Url = Url;
        this.Estado = Estado;
    }

    public int getIdPRIVILEGIO() {
        return idPRIVILEGIO;
    }

    public void setIdPRIVILEGIO(int idPRIVILEGIO) {
        this.idPRIVILEGIO = idPRIVILEGIO;
    }

    public int getIdPRIVILEGIO_2() {
        return idPRIVILEGIO_2;
    }

    public void setIdPRIVILEGIO_2(int idPRIVILEGIO_2) {
        this.idPRIVILEGIO_2 = idPRIVILEGIO_2;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}
