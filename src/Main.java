
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LabingXEON
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Aplicacion aplicacion=new Aplicacion("laboratorio"); 
        aplicacion.addClase("Activo");
        aplicacion.addClase("Tipo");
        
        aplicacion.addTipos("String");        
        aplicacion.addTipos("int");
      
        Clase clase=aplicacion.getClases().get(0);
        Tipo tipo=aplicacion.getTipos().get(0);
        clase.addAtributos("nombre", tipo);
        clase.addAtributos("descripcion", tipo);
        
        
        
        
        Generador generador=new Generador();
        generador.generar(aplicacion);
    }
}
