
import java.io.File;
import java.io.FileWriter;
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
public class Generador {

    public void generar(Aplicacion aplicacion) throws IOException {

        for (Clase clase : aplicacion.getClases()) {
            try {
                FileWriter escritura = new FileWriter(new File(clase.getNombre() + ".java"));
                escritura.write("public class " + clase.getNombre() + "\n");
                escritura.write("{" + "\n");
                
                for(Atributo atributo: clase.getAtributos()){
                    escritura.write("private "+atributo.getTipo().getNombre() + " "+atributo.getNombre()+";\n");             
                
                
                }
                
                  for(Atributo atributo: clase.getAtributos()){
                    escritura.write("public "+atributo.getTipo().getNombre() + " get"+((atributo.getNombre()).charAt(0)+"").toUpperCase()+atributo.getNombre().substring(1)+"(){\n"
                    +"return "+atributo.getNombre()+";\n}");
                 
                   escritura.write("public void set"+((atributo.getNombre()).charAt(0)+"").toUpperCase()+atributo.getNombre().substring(1)+" ("+atributo.getTipo().getNombre()+" "+atributo.getNombre()+"){\n"+
                           "this."+atributo.getNombre()+" = "+atributo.getNombre()+";\n}\n");
                
                
                }
                
                
                escritura.write("}\n");
                escritura.flush();
                escritura.close();

            } catch (Exception e) {
            }
        }

    }
}
