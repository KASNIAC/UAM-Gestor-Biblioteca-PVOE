
package uam.pvoe.sw.menu.operaciones;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import uam.pvoe.sw.menu.clases.Material;

public class EliminarMaterial {
    
      //Actualizar Material luego de eliminacion
    public void eliminar(LinkedList<Material> listaMateriales, Material material){
        if(material.getTipoMaterial().compareTo("Revista") == 0){
            if(material.getTema().compareTo("CBI") == 0){
                eliminarMaterial("revistasCBI.txt",listaMateriales,material);
            } else if(material.getTema().compareTo("CyAD") == 0){
                eliminarMaterial("revistasCyAD.txt",listaMateriales,material);
            } else if(material.getTema().compareTo("CSH") == 0){
                eliminarMaterial("revistasCSH.txt",listaMateriales,material);
            }
            JOptionPane.showMessageDialog(null,"Material eliminado correctamente :D"); 
        } else if(material.getTipoMaterial().compareTo("Libro") == 0){
            if(material.getTema().compareTo("CBI") == 0){
                eliminarMaterial("librosCBI.txt",listaMateriales,material);
            } else if(material.getTema().compareTo("CyAD") == 0){
                eliminarMaterial("librosCyAD.txt",listaMateriales,material);
            } else if(material.getTema().compareTo("CSH") == 0){
                eliminarMaterial("librosCSH.txt",listaMateriales,material);
            }
            JOptionPane.showMessageDialog(null,"Material eliminado correctamente :D"); 
        } else if(material.getTipoMaterial().compareTo("Película") == 0){ //Podria causar errores :,v
            if(material.getTema().compareTo("CBI") == 0){
                eliminarMaterial("peliculasCBI.txt",listaMateriales,material);
            } else if(material.getTema().compareTo("CyAD") == 0){
                eliminarMaterial("peliculasCyAD.txt",listaMateriales,material);
            } else if(material.getTema().compareTo("CSH") == 0){
                eliminarMaterial("peliculasCSH.txt",listaMateriales,material);
            }
            JOptionPane.showMessageDialog(null,"Material eliminado correctamente :D"); 
        } else{
            JOptionPane.showMessageDialog(null,"Error desconocido","Error inesperado",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminarMaterial(String nombreArchivo,LinkedList<Material> listaMateriales, Material baja){
        try {
            FileWriter fw = new FileWriter(nombreArchivo);
            BufferedWriter archivoEscritura = new BufferedWriter(fw);
            
            for(int i = 1; i<listaMateriales.size(); i++){
                Material material = new Material();
                material = listaMateriales.get(i);
                if(material.getAutor().compareTo(baja.getAutor()) != 0 && material.getTitulo().compareTo(baja.getTitulo()) !=0){
                    archivoEscritura.write(material.getAutor() + "," + material.getTitulo() + "," + material.getTema() + "," + 
                    material.getTipoMaterial() + "," + material.getCantidadEjemplares() + "," + material.getClaveLote() + "\n" );
                }
            }
            
            archivoEscritura.flush();
            archivoEscritura.close();
        } catch (IOException ex) {
            Logger.getLogger(AgregarMaterial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
