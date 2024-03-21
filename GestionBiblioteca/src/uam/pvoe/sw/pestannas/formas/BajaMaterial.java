/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.sw.pestannas.formas;

import java.util.LinkedList;
import uam.pvoe.sw.menu.clases.Material;
import uam.pvoe.sw.menu.operaciones.EliminarMaterial;
import uam.pvoe.sw.menu.operaciones.LlenadoListas;

/**
 *
 * @author ALEXISGARCIA
 */
public class BajaMaterial extends javax.swing.JPanel {

    /**
     * Creates new form BajaMaterial
     */
    LinkedList<String> listaTemas;
    LinkedList<Material> listaMateriales;
    boolean mostrarElemento1 = false;
    
    public BajaMaterial() {
        initComponents();
        radioButtons();
        cmbTema.removeAllItems();
        cmbOpcionBaja.removeAllItems();
        
        ocultarElementos();
        listaTemas();
    }

    private void radioButtons(){
        bgroupTipoMaterial.add(rbLibro);
        bgroupTipoMaterial.add(rbPelicula);
        bgroupTipoMaterial.add(rbRevista);
        
        rbRevista.setSelected(true);
        //lblElementosEncontrados.setText("Elementos encontrados de revistas: ");
    }
    
    private void ocultarElementos(){
        lblElementosEncontrados.setVisible(false);
        lblAutor.setVisible(false);
        lblTitulo.setVisible(false);
        lblEjemplares.setVisible(false);
        lblClaveLote.setVisible(false);
        lblOpcionBaja.setVisible(false);
        lblDatosSeleccionado.setVisible(false);
        
        cmbElementosEncontrados.setVisible(false);
        cmbOpcionBaja.setVisible(false);
        txtAutor.setVisible(false);
        txtTitulo.setVisible(false);
        txtClaveLote.setVisible(false);
        txtEjemplares.setVisible(false);
        
        btnBaja.setVisible(false);
        btnLimpiar.setVisible(false);
    }
    
    private void listaTemas(){
        LlenadoListas llenado = new LlenadoListas();
        
        listaTemas = llenado.llenarListaArea();
        for(int i = 0; i<listaTemas.size(); i++){
            cmbTema.addItem(listaTemas.get(i));
        }
    }
    
    private void limpiarDatos(){
        rbRevista.setSelected(true);
        lblElementosEncontrados.setText("Elementos encontrados de revistas: ");
        
        //comboBox();
        
        txtAutor.setText("");
        txtClaveLote.setText("");
        txtEjemplares.setText("");
        txtTitulo.setText("");
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgroupTipoMaterial = new javax.swing.ButtonGroup();
        lblBaja = new javax.swing.JLabel();
        lblIngreseDatos = new javax.swing.JLabel();
        lblTipoMaterial = new javax.swing.JLabel();
        rbRevista = new javax.swing.JRadioButton();
        rbLibro = new javax.swing.JRadioButton();
        rbPelicula = new javax.swing.JRadioButton();
        lblElementosEncontrados = new javax.swing.JLabel();
        cmbElementosEncontrados = new javax.swing.JComboBox<>();
        lblAutor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblTema = new javax.swing.JLabel();
        lblEjemplares = new javax.swing.JLabel();
        txtEjemplares = new javax.swing.JTextField();
        lblClaveLote = new javax.swing.JLabel();
        txtClaveLote = new javax.swing.JTextField();
        lblOpcionBaja = new javax.swing.JLabel();
        cmbOpcionBaja = new javax.swing.JComboBox<>();
        btnBaja = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cmbTema = new javax.swing.JComboBox<>();
        lblDatosSeleccionado = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 0, 0));

        lblBaja.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBaja.setText("Dar de Baja un Material");

        lblIngreseDatos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIngreseDatos.setText("Ingrese los datos:");

        lblTipoMaterial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTipoMaterial.setText("Tipo de material");

        rbRevista.setText("Revista");
        rbRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRevistaActionPerformed(evt);
            }
        });

        rbLibro.setText("Libro");
        rbLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLibroActionPerformed(evt);
            }
        });

        rbPelicula.setText("Película");
        rbPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPeliculaActionPerformed(evt);
            }
        });

        lblElementosEncontrados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        cmbElementosEncontrados.setModel(new javax.swing.DefaultComboBoxModel<>(new Material[] {null}));
        cmbElementosEncontrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbElementosEncontradosActionPerformed(evt);
            }
        });

        lblAutor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAutor.setText("Autor");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTitulo.setText("Título");

        lblTema.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTema.setText("Área (tema)");

        lblEjemplares.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEjemplares.setText("Ejemplares existentes");

        lblClaveLote.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblClaveLote.setText("Clave del lote");

        lblOpcionBaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOpcionBaja.setText("Elige como desea darlo de baja");

        cmbOpcionBaja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnBaja.setText("Confirmar Baja");
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar Campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cmbTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTemaActionPerformed(evt);
            }
        });

        lblDatosSeleccionado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDatosSeleccionado.setText("Datos del material seleccionado: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(lblBaja))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(btnBaja)
                        .addGap(258, 258, 258)
                        .addComponent(btnLimpiar)))
                .addContainerGap(333, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmbTema, 0, 424, Short.MAX_VALUE)
                        .addComponent(lblTema)
                        .addComponent(lblTitulo)
                        .addComponent(lblAutor)
                        .addComponent(lblTipoMaterial)
                        .addComponent(lblIngreseDatos)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rbRevista)
                            .addGap(18, 18, 18)
                            .addComponent(rbLibro)
                            .addGap(18, 18, 18)
                            .addComponent(rbPelicula))
                        .addComponent(txtAutor)
                        .addComponent(txtTitulo))
                    .addComponent(lblElementosEncontrados, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbElementosEncontrados, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblClaveLote, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblEjemplares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEjemplares))
                            .addComponent(txtClaveLote, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbOpcionBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOpcionBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(256, 256, 256))))
            .addGroup(layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(lblDatosSeleccionado)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblBaja)
                .addGap(37, 37, 37)
                .addComponent(lblIngreseDatos)
                .addGap(28, 28, 28)
                .addComponent(lblTipoMaterial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbRevista)
                    .addComponent(rbLibro)
                    .addComponent(rbPelicula))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblTema)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOpcionBaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbOpcionBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addComponent(lblElementosEncontrados, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbElementosEncontrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(lblDatosSeleccionado)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor)
                    .addComponent(lblEjemplares))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(lblClaveLote))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClaveLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBaja)
                    .addComponent(btnLimpiar))
                .addContainerGap(229, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRevistaActionPerformed
        if(mostrarElemento1){
            mostrarTrasSeleccion();
        }
    }//GEN-LAST:event_rbRevistaActionPerformed

    private void rbLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLibroActionPerformed
        if(mostrarElemento1){
            mostrarTrasSeleccion();
        }
    }//GEN-LAST:event_rbLibroActionPerformed

    private void rbPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPeliculaActionPerformed
        if(mostrarElemento1){
            mostrarTrasSeleccion();
        }
    }//GEN-LAST:event_rbPeliculaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        //limpiarDatos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        // TODO add your handling code here:
        Material baja = new Material();
        baja = (Material) cmbElementosEncontrados.getSelectedItem();
        
        EliminarMaterial eliminarMaterial = new EliminarMaterial();
        eliminarMaterial.eliminar(listaMateriales, baja);
        
        ocultarElementos();
        cmbTema.setSelectedIndex(0);
    }//GEN-LAST:event_btnBajaActionPerformed

    private void cmbTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTemaActionPerformed
        // TODO add your handling code here:
        mostrarTrasSeleccion();
    }//GEN-LAST:event_cmbTemaActionPerformed

    private void cmbElementosEncontradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbElementosEncontradosActionPerformed
        if(cmbElementosEncontrados.getSelectedIndex() > 0){
            Material material = (Material) cmbElementosEncontrados.getSelectedItem();
            lblDatosSeleccionado.setVisible(true);

            lblAutor.setVisible(true);
            txtAutor.setVisible(true);
            txtAutor.setText(material.getAutor());

            lblTitulo.setVisible(true);
            txtTitulo.setVisible(true);
            txtTitulo.setText(material.getTitulo());

            lblClaveLote.setVisible(true);
            txtClaveLote.setVisible(true);
            txtClaveLote.setText(material.getClaveLote());

            lblEjemplares.setVisible(true);
            txtEjemplares.setVisible(true);
            txtEjemplares.setText(material.getCantidadEjemplares() + "");

            btnBaja.setVisible(true);
        } else{
            lblDatosSeleccionado.setVisible(false);
            lblAutor.setVisible(false);
            txtAutor.setVisible(false);
            

            lblTitulo.setVisible(false);
            txtTitulo.setVisible(false);

            lblClaveLote.setVisible(false);
            txtClaveLote.setVisible(false);
            
            lblEjemplares.setVisible(false);
            txtEjemplares.setVisible(false);

            btnBaja.setVisible(false);
        }
    }//GEN-LAST:event_cmbElementosEncontradosActionPerformed

    private void mostrarTrasSeleccion(){
        if(cmbTema.getSelectedIndex() >0){
             LlenadoListas lecturaTipos = new LlenadoListas();
            
            cmbElementosEncontrados.removeAllItems();
            int tipoMaterial = 1;
            if(rbRevista.isSelected()){
                tipoMaterial = 1;
            } else if(rbLibro.isSelected()){
                tipoMaterial = 2;
            } else if(rbPelicula.isSelected()){
                tipoMaterial = 3;
            }
            
            String tema = (String)cmbTema.getSelectedItem();
            //System.out.println(tema);
            
            lblElementosEncontrados.setText(mostarEtiquetaEncontrados(tipoMaterial, tema));
            lblElementosEncontrados.setVisible(true);
            mostrarElemento1 = true;
            
            listaMateriales = lecturaTipos.llenarListaEncontrados(tipoMaterial, tema);
            
            
            for(int i = 0; i<listaMateriales.size(); i++){
                cmbElementosEncontrados.addItem(listaMateriales.get(i));
            } 
            
            cmbElementosEncontrados.setVisible(true);
        } else{
            cmbElementosEncontrados.setVisible(false);
            lblElementosEncontrados.setVisible(false);
            mostrarElemento1 = false;
        }

    }
        
    private String mostarEtiquetaEncontrados(int tipoMaterial,String tema){
        String cadena1 = "";
        if(rbRevista.isSelected()){
                cadena1 = "Revista";
        } else if(rbLibro.isSelected()){
            cadena1 = "Libro";
        } else if(rbPelicula.isSelected()){
            cadena1 = "Película";
        }
        
        return "Elementos de tipo " + cadena1 + " del area " + tema;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgroupTipoMaterial;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<Material> cmbElementosEncontrados;
    private javax.swing.JComboBox<String> cmbOpcionBaja;
    private javax.swing.JComboBox<String> cmbTema;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblBaja;
    private javax.swing.JLabel lblClaveLote;
    private javax.swing.JLabel lblDatosSeleccionado;
    private javax.swing.JLabel lblEjemplares;
    private javax.swing.JLabel lblElementosEncontrados;
    private javax.swing.JLabel lblIngreseDatos;
    private javax.swing.JLabel lblOpcionBaja;
    private javax.swing.JLabel lblTema;
    private javax.swing.JLabel lblTipoMaterial;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbLibro;
    private javax.swing.JRadioButton rbPelicula;
    private javax.swing.JRadioButton rbRevista;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtClaveLote;
    private javax.swing.JTextField txtEjemplares;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
