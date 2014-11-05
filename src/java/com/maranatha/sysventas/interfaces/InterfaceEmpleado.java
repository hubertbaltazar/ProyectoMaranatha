/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.maranatha.sysventas.interfaces;

import com.maranatha.sysventas.modelo.Empleado;
import java.util.List;

/**
 *
 * @author alum.fial7
 */
public interface InterfaceEmpleado {
     public List<Empleado> list();
    public List<Empleado> list(int id);
    public boolean edit(Empleado unidad);
    public boolean save(Empleado unidad);
    public boolean delete(int id);
}
