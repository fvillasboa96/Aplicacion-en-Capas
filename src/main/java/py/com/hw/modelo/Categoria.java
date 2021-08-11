/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.hw.modelo;

import java.io.Serializable;

/**
 *
 * @author F996
 */
public class Categoria implements Serializable{
        
    private Integer id;
    private String categoria;
    private String descripcion;

    public Categoria(Integer id, String categoria, String descripcion) {
        this.id = id;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Categoria{id=").append(id);
        sb.append(", categoria=").append(categoria);
        sb.append(", descripcion=").append(descripcion);
        sb.append('}');
        return sb.toString();
    }

    public Categoria() {
    }
       
}