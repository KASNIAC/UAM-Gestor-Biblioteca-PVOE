
package uam.pvoe.sw.menu.operaciones;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import uam.pvoe.sw.menu.clases.Material;

public class AgregarMaterial {
    
    public void agregarNuevo(Material material){
        if(material.getTipoMaterial().compareTo("Revista") == 0){
            if(material.getTema().compareTo("CBI") == 0){
                agregar("revistasCBI.txt",material);
            } else if(material.getTema().compareTo("CyAD") == 0){
                agregar("revistasCyAD.txt",material);
            } else if(material.getTema().compareTo("CSH") == 0){
                agregar("revistasCSH.txt",material);
            }
            //agregar("revistas.txt",material);
            JOptionPane.showMessageDialog(null,"Material agregado correctamente :D"); 
        } else if(material.getTipoMaterial().compareTo("Libro") == 0){
            if(material.getTema().compareTo("CBI") == 0){
                agregar("librosCBI.txt",material);
            } else if(material.getTema().compareTo("CyAD") == 0){
                agregar("librosCyAD.txt",material);
            } else if(material.getTema().compareTo("CSH") == 0){
                agregar("librosCSH.txt",material);
            }
            //agregar("libros.txt",material);
            JOptionPane.showMessageDialog(null,"Material agregado correctamente :D"); 
        } else if(material.getTipoMaterial().compareTo("Película") == 0){
            if(material.getTema().compareTo("CBI") == 0){
                agregar("peliculasCBI.txt",material);
            } else if(material.getTema().compareTo("CyAD") == 0){
                agregar("peliculasCyAD.txt",material);
            } else if(material.getTema().compareTo("CSH") == 0){
                agregar("peliculasCSH.txt",material);
            }
            //agregar("peliculas.txt",material);
            JOptionPane.showMessageDialog(null,"Material agregado correctamente :D"); 
        } else{
            JOptionPane.showMessageDialog(null,"Error desconocido","Error inesperado",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void agregar(String nombreArchivo,Material material){
        try {
            FileWriter fw = new FileWriter(nombreArchivo,true);
            BufferedWriter archivoEscritura = new BufferedWriter(fw);
            archivoEscritura.write(material.getAutor() + "," + material.getTitulo() + "," + material.getTema() + "," + 
                    material.getTipoMaterial() + "," + material.getCantidadEjemplares() + "," + material.getClaveLote() + "\n" );
            
            
            archivoEscritura.flush();
            archivoEscritura.close();
        } catch (IOException ex) {
            Logger.getLogger(AgregarMaterial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
