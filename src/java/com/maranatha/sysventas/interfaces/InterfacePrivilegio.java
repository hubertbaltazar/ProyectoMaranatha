/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.maranatha.sysventas.interfaces;

import com.maranatha.sysventas.modelo.Privilegio;
import java.util.List;

/**
 *
 * @author Angel
 */
public interface InterfacePrivilegio {
     public List<Privilegio> list();
    public List<Privilegio> list(int id);
    public boolean edit(Privilegio privilegio);
    public boolean save(Privilegio privilegio);
    public boolean delete(int id);
}

