/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.maranatha.sysventas.dao;

import com.maranatha.sysventas.factory.ConexionBD;
import com.maranatha.sysventas.factory.FactoryConnectionDB;
import com.maranatha.sysventas.interfaces.InterfaceCategoria;
import com.maranatha.sysventas.modelo.Categoria;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Angel
 */
public class CategoriaDAO implements InterfaceCategoria{
    ConexionBD conn;
    @Override
    public List<Categoria> list() {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM departamento");
        List<Categoria> list = new ArrayList<Categoria>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while(rs.next()){
            Categoria cat = new Categoria();
            cat.setIdCATEGORIA(rs.getInt("idCATEGORIA"));
            cat.setNombre(rs.getString("Nombre"));
            cat.setDescripcion(rs.getString("Descropcion"));
            list.add(cat);
            }
        } catch (SQLException e) {
        } finally{
            this.conn.close();
        }
        return list;
    }
    @Override
    public List<Categoria> list(int id) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM CATEGORIA WHERE idCATEGORIA=").append(id);
        List<Categoria> list = new ArrayList<Categoria>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while(rs.next()){
            Categoria cat = new Categoria();
            cat.setIdCATEGORIA(rs.getInt("idCATEGORIA"));
            cat.setNombre(rs.getString("Nombre"));
            cat.setDescripcion(rs.getString("Descripcion"));
            list.add(cat);
            }
        } catch (SQLException e) {
        } finally{
            this.conn.close();
        }
        return list;
    }
    @Override
    public boolean edit(Categoria categoria) {
       this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        boolean save = false;
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE categoria SET idCATEGORIA = ").append(categoria.getIdCATEGORIA());
            sql.append(", Nombre = '").append(categoria.getNombre());
            sql.append("', Descripcion = ").append(categoria.getDescripcion()).append(" WHERE idCATEGORIA = ").append(categoria.getIdCATEGORIA());
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
    public boolean save(Categoria categoria) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        boolean save = false;
        try {
//            System.out.println(departamentp.getId()+", "+departamentp.getProv()+", "+departamentp.getDir()+", "+departamentp.getRuc()+", "+departamentp.getTel()+", "+departamentp.getEst());
                StringBuilder sql = new StringBuilder();
                sql.append("INSERT INTO categoria(idCATEGORIA, Nombre,Descripcion) VALUES(").append("NULL");
                sql.append(", '").append(categoria.getNombre());
                sql.append("', ").append(categoria.getDescripcion()).append(")");
        
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
            sql.append("DELETE FROM categoria WHERE idCATEGORIA = ").append(id);
            this.conn.execute(sql.toString());
            delete = true;
        } catch (Exception e) {
            
        }finally{
            this.conn.close();
        }
        return delete;
    }
    
}

