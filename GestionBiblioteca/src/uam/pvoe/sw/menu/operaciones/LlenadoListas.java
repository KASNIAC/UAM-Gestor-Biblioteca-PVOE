
package uam.pvoe.sw.menu.operaciones;

import java.util.LinkedList;
import uam.pvoe.sw.menu.clases.Material;

public class LlenadoListas {
    
    public LinkedList<String> llenarListaArea(){
        LinkedList<String> lista = new LinkedList<String>();
        
        lista.add("Selecciona un area");
        lista.add("CBI");
        lista.add("CyAD");
        lista.add("CSH");

        return lista;
    }
    
    public LinkedList<Material> llenarListaEncontrados(int tipoMaterial,String tema){
        LinkedList<Material> lista = new LinkedList<Material>();
        
        //Revista 1; Libro 2; Pelicual 3
        LecturaArchivo lecturaMateriales = new LecturaArchivo();
        if(tipoMaterial == 1){
            if(tema.compareTo("CBI") == 0){
                lista = lecturaMateriales.leerMateriales("revistasCBI.txt");
            } else if(tema.compareTo("CyAD") == 0){
                lista = lecturaMateriales.leerMateriales("revistasCyAD.txt");
            } else if(tema.compareTo("CSH") == 0){
                lista = lecturaMateriales.leerMateriales("revistasCSH.txt");
            }
        } else if(tipoMaterial == 2){
            if(tema.compareTo("CBI") == 0){
                lista = lecturaMateriales.leerMateriales("librosCBI.txt");
            } else if(tema.compareTo("CyAD") == 0){
                lista = lecturaMateriales.leerMateriales("librosCyAD.txt");
            } else if(tema.compareTo("CSH") == 0){
                lista = lecturaMateriales.leerMateriales("librosCSH.txt");
            }
        } else if(tipoMaterial == 3){
            if(tema.compareTo("CBI") == 0){
                lista = lecturaMateriales.leerMateriales("peliculasCBI.txt");
            } else if(tema.compareTo("CyAD") == 0){
                lista = lecturaMateriales.leerMateriales("peliculasCyAD.txt");
            } else if(tema.compareTo("CSH") == 0){
                lista = lecturaMateriales.leerMateriales("peliculasCSH.txt");
            }
        }
        
        return lista;
    }
    
    /*
    public LinkedList<String> llenarListaMateriales(int indice){
        LinkedList<String> lista = new LinkedList<String>();
        
        for(int i = 1; i<=5; i++){
            String opcion = indice + " DEP " + i;
            lista.add(opcion);
        }
        return lista;
    }
    */
    
    
}
