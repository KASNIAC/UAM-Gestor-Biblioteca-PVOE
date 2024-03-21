
package uam.pvoe.sw.menu.clases;

public class Material {
    
    private String tipoMaterial;
    private String titulo;
    private String autor;
    private String tema;
    private int cantidadEjemplares;
    private String claveLote;

    
    public Material(){
        
    }
    public Material(String tipoMaterial, String titulo, String autor, String tema, int cantidadEjemplares, String claveLote) {
        this.tipoMaterial = tipoMaterial;
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.cantidadEjemplares = cantidadEjemplares;
        this.claveLote = claveLote;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public String getClaveLote() {
        return claveLote;
    }

    public void setClaveLote(String claveLote) {
        this.claveLote = claveLote;
    }

    @Override
    public String toString() {
        return this.autor + ": " + this.titulo ;
    }
    
    
    
          
    
}
