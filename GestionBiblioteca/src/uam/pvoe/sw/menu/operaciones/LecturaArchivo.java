
package uam.pvoe.sw.menu.operaciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import uam.pvoe.sw.menu.clases.Material;
//import uam.pvoe.sw.menu.clases.Usuario;

public class LecturaArchivo {
    
    public int leerUsuarios(String nombreArchivo, String usuario, String pass){
        String cadenaLeida; //cadenaLeida
        
        FileReader fr;
        BufferedReader archivoLectura;
        
        try {
            fr = new FileReader(nombreArchivo);
            archivoLectura = new BufferedReader(fr);
            cadenaLeida = archivoLectura.readLine();
           
            while(cadenaLeida != null){
                StringTokenizer st = new StringTokenizer(cadenaLeida,",");
                
                String login = st.nextToken();
                String password = st.nextToken();
                /*
                Usuario usuarioTemp = new Usuario();
                usuarioTemp.setLogin(st.nextToken());
                usuarioTemp.setPassword(st.nextToken());
                */
                if(usuario.compareTo(login) == 0){
                    if(pass.compareTo(password) == 0){
                        archivoLectura.close();
                        return 1;
                    } else{
                        archivoLectura.close();
                        return 2;
                    }
                }
                cadenaLeida = archivoLectura.readLine();
            }
            archivoLectura.close();
            return 3;
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LecturaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 4;
      }
    
    
    public LinkedList<Material> leerMateriales(String nombreArchivo){
        LinkedList<Material> lista = new LinkedList<Material>();
        
        FileReader fr;
        BufferedReader archivoLectura;
        
        String cadenaLeida = "";
        try {
            fr = new FileReader(nombreArchivo);
            archivoLectura = new BufferedReader(fr);
            cadenaLeida = archivoLectura.readLine();
           
            while(cadenaLeida != null){
                StringTokenizer st = new StringTokenizer(cadenaLeida,",");
                
                Material material = new Material();
                material.setAutor(st.nextToken());
                material.setTitulo(st.nextToken());
                material.setTema(st.nextToken());
                material.setTipoMaterial(st.nextToken());
                material.setCantidadEjemplares(Integer.parseInt(st.nextToken()));
                material.setClaveLote(st.nextToken());
                
                lista.add(material);
                //System.out.println(material + "\n");
                
                cadenaLeida = archivoLectura.readLine();
            }
            archivoLectura.close();
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LecturaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Material temp = new Material();
        if(lista.size() > 0){
            temp.setAutor("Seleccione un material");
            temp.setTitulo("");
        } else{
            temp.setAutor("Ningún elemento en existencia");
            temp.setTitulo("");
        }
        
        
        lista.addFirst(temp);
        return lista;
    }
    
    
}
