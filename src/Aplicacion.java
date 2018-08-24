
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhoan Saavedra
 */
public class Aplicacion {
        private String nombre;
        private ArrayList<Clase> clases=new  ArrayList<>();
        private ArrayList<Tipo> tipos=new ArrayList<>();
    public Aplicacion(String nombre) {
        this.nombre = nombre;
        this.clases=new ArrayList<>();
        this.tipos=new ArrayList<>();
    }

    public ArrayList<Tipo> getTipos() {
        return tipos;
    }

    public void addTipos(String nombre) {
        this.tipos.add(new Tipo(nombre));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void addClase(String nombre) {
        this.clases.add(new Clase(nombre));
    }

    public void addAtributo(String nombre, Tipo tipo){
        
    }
    
        
}
