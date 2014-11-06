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
public class Categoria {
    private int idCATEGORIA;
    private String Nombre;
    private String Descripcion;

    public Categoria() {
    }

    public Categoria(int idCATEGORIA, String Nombre, String Descripcion) {
        this.idCATEGORIA = idCATEGORIA;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public int getIdCATEGORIA() {
        return idCATEGORIA;
    }

    public void setIdCATEGORIA(int idCATEGORIA) {
        this.idCATEGORIA = idCATEGORIA;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
}
