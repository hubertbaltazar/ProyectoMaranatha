/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.maranatha.sysventas.interfaces;

import com.maranatha.sysventas.modelo.Ubigeo;
import java.util.List;

/**
 *
 * @author alum.fial7
 */
public interface InterfaceUbigeo {
    public List<Ubigeo> list();
    public List<Ubigeo> list(int id);
    public boolean edit(Ubigeo unidad);
    public boolean save(Ubigeo unidad);
    public boolean delete(int id);
}
