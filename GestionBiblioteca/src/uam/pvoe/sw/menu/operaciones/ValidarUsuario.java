
package uam.pvoe.sw.menu.operaciones;

import uam.pvoe.sw.menu.clases.Usuario;

public class ValidarUsuario {

    public int validarUsuario(Usuario usr){
        LecturaArchivo lectura = new LecturaArchivo();
        
        String nombreArchivo = "validacion.txt";
        String usuario = usr.getLogin();
        String pass = usr.getPassword();
        
        int band = lectura.leerUsuarios(nombreArchivo, usuario, pass);
        if(band == 1){
            return 1;
        }else if(band == 2){
            return 2;
        } else if(band == 3){
            return 3;
        } else{
            return 4;
        }

    }
    
}
