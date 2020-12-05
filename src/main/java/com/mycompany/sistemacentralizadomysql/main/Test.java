/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemacentralizadomysql.main;

import com.mycompany.sistemacentralizadomysql.controller.ProductosJpaController;
import com.mycompany.sistemacentralizadomysql.entity.Productos;
import java.math.BigDecimal;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Personal
 */
public class Test {
    
    private String codigo;
    private String nombre;
    private String precio;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        // TODO code application logic here
        
        /*EntityManagerFactory emf = Persistence.createEntityManagerFactory("productosbd");
        ProductosJpaController productoController = new ProductosJpaController(emf);
        
        Productos pro = new Productos();
        
        pro.setNombre("Pera");
        pro.setPrecio(BigDecimal.valueOf(12));
        
        productoController.create(pro);*/
        
    }
    
}
