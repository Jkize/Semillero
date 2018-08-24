/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LabingXEON
 */
public class Atributo {
    private String nombre;
    //romper el modelo
    private Tipo tipo;

    public Atributo(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    
}
