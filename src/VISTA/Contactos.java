package VISTA;

import MODELO.UIController;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

public class Contactos extends COMPONET.PanelCustom {

    private ArrayList<Contacto> listaContactos;
    private int id = 0;
    private mdlContactos ventanContactos;

    public Contactos() {
        initComponents();
        listaContactos = new ArrayList<>();
        id = 0;
        addComponet();
    }

    public void addContact() {
        Contacto con = new Contacto();
        listaContactos.add(con);
        addContacto(con);
    }

    public void addContact(String telefono, String empresa, String descripcion) {
        Contacto con = new Contacto();
        con.setTelefono(telefono);
        con.setNombre(empresa);
        con.setDescripcion(descripcion);
        addContacto(con);
    }

    public void addContact(String telefono, String empresa, String descripcion, InputStream foto) {
        Contacto con = new Contacto();
        con.setTelefono(telefono);
        con.setNombre(empresa);
        con.setDescripcion(descripcion);
        try {
            con.setImagenPerfil(UIController.toIcon(foto));
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        addContacto(con);
    }

    public void addContact(String telefono, String empresa, String descripcion, InputStream foto, ArrayList<String> etiquetas) {
        Contacto con = new Contacto();
        con.setTelefono(telefono);
        con.setNombre(empresa);
        con.setDescripcion(descripcion);
        con.setEtiquetas(etiquetas);
        addContacto(con);
    }

    public void addContactos(ArrayList<Contacto> listaContactos) {
        for (Contacto con : listaContactos) {
            addContacto(con);
        }
    }

    private void addContacto(Contacto con) {
        con.setId(id);
        id++;
        listaContactos.add(con);
        addComponet();
        con.btnEliminar.addActionListener((java.awt.event.ActionEvent evt) -> {
            listaContactos.remove(con);
            addComponet();
        });
        con.btnEditar.addActionListener((java.awt.event.ActionEvent evt) -> {
            id = con.getId();
        });

    }

    private void addComponet() {
        contenedor.removeAll();
        for (Contacto con : listaContactos) {
            contenedor.add(con);
        }
        contenedor.revalidate();
        contenedor.repaint();
    }

    public void editarComponet(String nombre, String telefono, String descripcion) {
        for (Contacto con : listaContactos) {
            if (con.getId() == id) {
                con.setNombre(nombre);
                con.setTelefono(telefono);
                con.setDescripcion(descripcion);
                break;
            }
        }
        addComponet();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new COMPONET.ScrollPaneWin11();
        contenedor = new javax.swing.JPanel();

        setBackground(new java.awt.Color(48, 2, 44));
        setShadowColor(new java.awt.Color(0, 0, 0));

        jScrollPane1.setBorder(null);

        contenedor.setBackground(new java.awt.Color(48, 2, 44));
        contenedor.setLayout(new javax.swing.BoxLayout(contenedor, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPane1.setViewportView(contenedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public ArrayList<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(ArrayList<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
        addComponet();
    }
}
