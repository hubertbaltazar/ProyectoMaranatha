/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.maranatha.sysventas.interfaces;

import com.maranatha.sysventas.modelo.Categoria;
import java.util.List;

/**
 *
 * @author Angel
 */
public interface InterfaceCategoria {
    public List<Categoria> list();
    public List<Categoria> list(int id);
    public boolean edit(Categoria categoria);
    public boolean save(Categoria categoria);
    public boolean delete(int id);
}

