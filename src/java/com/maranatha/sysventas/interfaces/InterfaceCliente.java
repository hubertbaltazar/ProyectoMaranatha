/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.maranatha.sysventas.interfaces;

import com.maranatha.sysventas.modelo.Cliente;
import java.util.List;

/**
 *
 * @author Angel
 */
public interface InterfaceCliente {
     public List<Cliente> list();
    public List<Cliente> list(int id);
    public boolean edit(Cliente cliente);
    public boolean save(Cliente cliente);
    public boolean delete(int id);
}

