/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.maranatha.sysventas.dao;

import com.maranatha.sysventas.factory.ConexionBD;
import com.maranatha.sysventas.factory.FactoryConnectionDB;
import com.maranatha.sysventas.interfaces.InterfaceCliente;
import com.maranatha.sysventas.modelo.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Angel
 */
public class ClienteDAO implements InterfaceCliente{
    ConexionBD conn;
    @Override
    public List<Cliente> list() {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM cliente");
        List<Cliente> list = new ArrayList<Cliente>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while(rs.next()){
            Cliente clie = new Cliente();
            clie.setIdCLIENTE(rs.getInt("idCLIENTE"));
            clie.setIdUBIGEO(rs.getInt("idUBIGEO"));
            clie.setNombre(rs.getString("Nombre"));
            clie.setApellido_P(rs.getString("Apellido_P"));
            clie.setApellido_M(rs.getString("Apellido_M"));
            clie.setDNI(rs.getString("DNI"));
            clie.setTelefono(rs.getString("Telefono"));
            clie.setDireccion(rs.getString("Direccion"));
            clie.setRuc(rs.getString("Ruc"));
            clie.setRazon_Social(rs.getString("Razon_Social"));
            list.add(clie);
            }
        } catch (SQLException e) {
        } finally{
            this.conn.close();
        }
        return list;
    }
    @Override
    public List<Cliente> list(int id) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM cliente WHERE idCLIENTE=").append(id);
        List<Cliente> list = new ArrayList<Cliente>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while(rs.next()){
            Cliente clie = new Cliente();
            clie.setIdCLIENTE(rs.getInt("idCLIENTE"));
            clie.setIdUBIGEO(rs.getInt("idUBIGEO"));
            clie.setNombre(rs.getString("Nombre"));
            clie.setApellido_P(rs.getString("Apellido_P"));
            clie.setApellido_M(rs.getString("Apellido_M"));
            clie.setDNI(rs.getString("DNI"));
            clie.setTelefono(rs.getString("Telefono"));
            clie.setDireccion(rs.getString("Direccion"));
            clie.setRuc(rs.getString("Ruc"));
            clie.setRazon_Social(rs.getString("Razon_Social"));
            list.add(clie);
            }
        } catch (SQLException e) {
        } finally{
            this.conn.close();
        }
        return list;
    }
    @Override
    public boolean edit(Cliente cliente) {
       this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        boolean save = false;
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE cliente SET idCLIENTE = ").append(cliente.getIdCLIENTE());
            sql.append(", idUBIGEO = '").append(cliente.getIdUBIGEO());
            sql.append("', Nombre = ").append(cliente.getNombre());
            sql.append(", Apellido_P = '").append(cliente.getApellido_P());
            sql.append("', Apellido_M = ").append(cliente.getApellido_M());
            sql.append(", DNI = '").append(cliente.getDNI());
            sql.append("', Telefono = ").append(cliente.getTelefono());
            sql.append(", Direccion = '").append(cliente.getDireccion());
            sql.append("', Ruc = ").append(cliente.getRuc());
            sql.append(", Razon_Social = ").append(cliente.getIdCLIENTE()).append(" WHERE idCLIENTE = ").append(cliente.getIdCLIENTE());
            this.conn.execute(sql.toString());
            save = true;
            //System.out.println(departamento.getDpto());
        } catch (Exception e) {
        }finally{
            this.conn.close();
        }
//        System.out.println(departamento.getIddpto());
//        System.out.println(departamento.getDpto());
//        System.out.println(departamento.getCostos());
//        System.out.println(departamento.getStatus());
        return save;
    }
    @Override
    public boolean save(Cliente cliente) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        boolean save = false;
        try {
//            System.out.println(departamentp.getId()+", "+departamentp.getProv()+", "+departamentp.getDir()+", "+departamentp.getRuc()+", "+departamentp.getTel()+", "+departamentp.getEst());
                StringBuilder sql = new StringBuilder();
                sql.append("INSERT INTO cliente(idCLIENTE, idUBIGEO, Nombre, Apellido_P, Apellido_M,DNI, Direccion, Ruc, Razon_Social) VALUES(").append("NULL");
                sql.append(", '").append(cliente.getIdUBIGEO());
                sql.append("', ").append(cliente.getNombre());
                sql.append(", ").append(cliente.getApellido_P());
                sql.append(", '").append(cliente.getApellido_M());
                sql.append("', ").append(cliente.getDNI());
                sql.append(", ").append(cliente.getTelefono());
                sql.append(", '").append(cliente.getDireccion());
                sql.append("', ").append(cliente.getRuc());
                sql.append(", ").append(cliente.getRazon_Social()).append(")");
                //String sql1 = "INSERT INTO Proveedor(iddepartamentp)VALUES(10)";
                this.conn.execute(sql.toString());
                save = true;
        } catch (Exception e) {
            this.conn.close();
        }        
        return save;
    }

    @Override
    public boolean delete(int id) {
         this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        boolean delete = false;
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("DELETE FROM cliente WHERE idCLIENTE = ").append(id);
            this.conn.execute(sql.toString());
            delete = true;
        } catch (Exception e) {
            
        }finally{
            this.conn.close();
        }
        return delete;
    }
    
}


