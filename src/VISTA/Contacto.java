package VISTA;

import COMPONET.FileChooserCustom;
import MODELO.UIController;
import java.awt.Cursor;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import javax.swing.Icon;

public class Contacto extends COMPONET.PanelCustom {

    private Icon imagenPerfil = new javax.swing.ImageIcon(getClass().getResource("/IMG/usuario.png"));
    private String telefono = "+51992803880";
    private String descripcion = "Estudiante de ingenieria de software de la universidad ";
    private String nombre = "Impro ATS";
    public ArrayList<String> etiquetas = new ArrayList<>();
    private int id = 0;
    
    public Contacto() {
        initComponents();
        perfil.setCursor(new Cursor(12));
        paint();
    }

    private void paint() {
        perfil.setImage(imagenPerfil);
        txtTelefono.setText(telefono);
        txtDescripcion.setText("<html>" + descripcion + "</html>");
        txtNombre.setText(nombre);
        for (String et : etiquetas) {
            etiquets.addEtiqueta(et);
        }
        etiquetas = new ArrayList<>();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustom1 = new COMPONET.PanelCustom();
        perfil = new COMPONET.ImageAvatar();
        txtTelefono = new javax.swing.JLabel();
        etiquets = new VISTA.Etiquetas();
        txtNombre = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAddEtiqueta = new COMPONET.Button();
        btnEditar = new COMPONET.Button();
        btnEliminar = new COMPONET.Button();

        setBackground(new java.awt.Color(0, 51, 51));
        setRound(55);
        setShadowColor(new java.awt.Color(0, 0, 0));

        panelCustom1.setBackground(new java.awt.Color(0, 51, 51));
        panelCustom1.setRound(55);
        panelCustom1.setShadowColor(new java.awt.Color(0, 0, 0));

        perfil.setGradientColor1(new java.awt.Color(51, 0, 51));
        perfil.setGradientColor2(new java.awt.Color(0, 51, 51));
        perfil.setImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/usuario.png"))); // NOI18N

        javax.swing.GroupLayout panelCustom1Layout = new javax.swing.GroupLayout(panelCustom1);
        panelCustom1.setLayout(panelCustom1Layout);
        panelCustom1Layout.setHorizontalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        panelCustom1Layout.setVerticalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        txtTelefono.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTelefono.setText("+51 955899977");

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtNombre.setText("Nombre");
        txtNombre.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDescripcion.setText("Descripcion");
        txtDescripcion.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        btnAddEtiqueta.setBackground(new java.awt.Color(51, 0, 51));
        btnAddEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/etiqueta.png"))); // NOI18N
        btnAddEtiqueta.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddEtiqueta.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAddEtiqueta.setShadowColor(new java.awt.Color(0, 0, 0));

        btnEditar.setBackground(new java.awt.Color(51, 0, 51));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/editar.png"))); // NOI18N
        btnEditar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEditar.setShadowColor(new java.awt.Color(0, 0, 0));

        btnEliminar.setBackground(new java.awt.Color(51, 0, 51));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/eliminar.png"))); // NOI18N
        btnEliminar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEliminar.setShadowColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnAddEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(etiquets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                            .addGap(15, 15, 15))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtTelefono)
                        .addGap(15, 15, 15)
                        .addComponent(etiquets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    public InputStream clickImagen() {
        try {
            String extensiones[] = {"png", "jpg", "jpeg"};
            String urlImgen = FileChooserCustom.FileChosserArchivo("", extensiones, ".png .jpg .jpeg");
            System.out.println(urlImgen);
            if (urlImgen != null) {
                InputStream inputUrl = UIController.toInputStream(urlImgen);
                perfil.setImage(UIController.toIcon(inputUrl));
                return inputUrl;
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public COMPONET.Button btnAddEtiqueta;
    public COMPONET.Button btnEditar;
    public COMPONET.Button btnEliminar;
    public VISTA.Etiquetas etiquets;
    public javax.swing.JPanel jPanel1;
    public COMPONET.PanelCustom panelCustom1;
    public COMPONET.ImageAvatar perfil;
    public javax.swing.JLabel txtDescripcion;
    public javax.swing.JLabel txtNombre;
    public javax.swing.JLabel txtTelefono;
    // End of variables declaration//GEN-END:variables

    public Icon getImagenPerfil() {
        return perfil.getImage();
    }

    public void setImagenPerfil(Icon imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
        paint();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
        paint();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        paint();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        paint();
    }

    public ArrayList<String> getEtiquetas() {
        return etiquets.getEtiquetas();
    }

    public void setEtiquetas(ArrayList<String> etiquetas) {
        this.etiquetas = etiquetas;
        paint();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public InputStream getIcono(){
        try {
            return UIController.toInputStream(perfil.getImage());
        } catch (IOException ex) {
            System.out.println("ERROR: "+ex.getMessage());
        }
        return null;
    }
    
}
