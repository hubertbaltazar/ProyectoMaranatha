/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.maranatha.sysventas.interfaces;

import com.maranatha.sysventas.modelo.Compra;
import java.util.List;

/**
 *
 * @author Angel
 */
public interface InterfaceCompra {
    public List<Compra> list();
    public List<Compra> list(int id);
    public boolean edit(Compra compra);
    public boolean save(Compra compra);
    public boolean delete(int id);
} 

