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
public class Cliente {
    private int idCLIENTE;
    private int idUBIGEO;
    private String Nombre;
    private String Apellido_P;
    private String Apellido_M;
    private String DNI;
    private String Telefono;
    private String Direccion;
    private String Ruc;
    private String Razon_Social;

    public Cliente() {
    }

    public Cliente(int idCLIENTE, int idUBIGEO, String Nombre, String Apellido_P, String Apellido_M, String DNI, String Telefono, String Direccion, String Ruc, String Razon_Social) {
        this.idCLIENTE = idCLIENTE;
        this.idUBIGEO = idUBIGEO;
        this.Nombre = Nombre;
        this.Apellido_P = Apellido_P;
        this.Apellido_M = Apellido_M;
        this.DNI = DNI;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Ruc = Ruc;
        this.Razon_Social = Razon_Social;
    }

    public int getIdCLIENTE() {
        return idCLIENTE;
    }

    public void setIdCLIENTE(int idCLIENTE) {
        this.idCLIENTE = idCLIENTE;
    }

    public int getIdUBIGEO() {
        return idUBIGEO;
    }

    public void setIdUBIGEO(int idUBIGEO) {
        this.idUBIGEO = idUBIGEO;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido_P() {
        return Apellido_P;
    }

    public void setApellido_P(String Apellido_P) {
        this.Apellido_P = Apellido_P;
    }

    public String getApellido_M() {
        return Apellido_M;
    }

    public void setApellido_M(String Apellido_M) {
        this.Apellido_M = Apellido_M;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getRuc() {
        return Ruc;
    }

    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }

    public String getRazon_Social() {
        return Razon_Social;
    }

    public void setRazon_Social(String Razon_Social) {
        this.Razon_Social = Razon_Social;
    }
    
   
}
