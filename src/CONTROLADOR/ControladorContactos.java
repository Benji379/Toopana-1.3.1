package CONTROLADOR;

import DAO.DaoContacto;
import DAO.DaoLogin;
import MODELO.UIController;
import VISTA.mdlContactos;
import java.awt.Point;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.ArrayList;

public class ControladorContactos {

    mdlContactos c;
    VISTA.Contacto contacto;
    int idSeleccionado = 0;

    public ControladorContactos(mdlContactos c) {
        this.c = c;
    }

    public void init() {
        UIController.transparentarTxtField(c.txtNombre, c.txtTelefono);
        UIController.textAreaInivisible(c.txtDescripcion, c.scrollTxt);
        cargarContactos();
        try {
            c.perfil.setImage(UIController.toIcon(DaoLogin.FOTO));
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        
        UIController.applyPlaceholder(c.txtNombre, "nombre");
        UIController.applyPlaceholder(c.txtTelefono, "992803880");
        UIController.applyPlaceholder(c.txtDescripcion, "aca pones la descripcion");
        
    }

    public void btnAgregar() {
        try {
            String telefono = c.txtTelefono.getText();
            String nombre = c.txtNombre.getText();
            String descripcion = c.txtDescripcion.getText();
            int idUsuario = DaoLogin.ID_USUARIO;
            InputStream foto = UIController.toInputStream(c.perfil.getImage());
            if (!telefono.equals("") || !nombre.equals("")) {
                btnRegistrar();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Falta rellenar Credenciales", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    public void editar() {
        try {
            int idContacto = DaoLogin.ID_USUARIO;
            String telefono = c.txtTelefono.getText();
            String nombre = c.txtNombre.getText();
            String descripcion = c.txtDescripcion.getText();
            ArrayList<String> etiquetas = c.contactos.getListaContactos().get(idSeleccionado).getEtiquetas();
            InputStream foto = UIController.toInputStream(c.contactos.getListaContactos().get(idSeleccionado).getImagenPerfil());
            Timestamp fecha = UIController.obtenerFechaActual();
            MODELO.Contacto conta = new MODELO.Contacto(telefono, idContactoSeleccionado, nombre, descripcion, etiquetas, foto, fecha);
            DaoContacto.actualizar(conta, idContactoSeleccionado);
            limpiar();
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }

//        c.contactos.editarComponet(nombre, telefono, descripcion);
    }

    public void btnRegistrar() {
        String telefono = c.txtTelefono.getText();
        String nombre = c.txtNombre.getText();
        String descripcion = c.txtDescripcion.getText();
//            InputStream fotos = UIController.toInputStream("\\IMG\\usuario.png");
        ArrayList<String> listaEtiques = new ArrayList<>();
        MODELO.Contacto cont = new MODELO.Contacto(telefono, DaoLogin.ID_USUARIO, nombre, descripcion, listaEtiques, null, UIController.obtenerFechaActual());
        DaoContacto.registrar(cont);
    }

    int idContactoSeleccionado = 0;

    private void cargarContactos() {
        c.contactos.setListaContactos(DaoContacto.toContactos());
//        c.contactos.addContact(telefono, nombre, descripcion, foto);
        int cont = 0;
        for (VISTA.Contacto co : c.contactos.getListaContactos()) {
            co.btnEditar.addActionListener((java.awt.event.ActionEvent evt) -> {
                c.txtNombre.setText(co.getNombre());
                c.txtTelefono.setText(co.getTelefono());
                c.txtDescripcion.setText(co.getDescripcion());
//                        idSeleccionado = co.getId();
                System.out.println(idContactoSeleccionado);
                idContactoSeleccionado = co.getId();
                idSeleccionado = c.contactos.getListaContactos().indexOf(co);
                System.out.println("ID LIST:" + idSeleccionado);
                VISTA.frmPrincipal parentWindon = (VISTA.frmPrincipal) javax.swing.SwingUtilities.windowForComponent(c);
                parentWindon.scrolPrincipal.getViewport().setViewPosition(new Point(0, 0));
            });
            co.btnEliminar.addActionListener((java.awt.event.ActionEvent evt) -> {
                c.txtNombre.setText(co.getNombre());
                c.txtTelefono.setText(co.getTelefono());
                c.txtDescripcion.setText(co.getDescripcion());
                idContactoSeleccionado = co.getId();
                DaoContacto.eliminar(idContactoSeleccionado);
                limpiar();
            });
            co.btnAddEtiqueta.addActionListener((java.awt.event.ActionEvent evt) -> {
                c.txtNombre.setText(co.getNombre());
                c.txtTelefono.setText(co.getTelefono());
                c.txtDescripcion.setText(co.getDescripcion());
                String etiqueta = JOptionPane.showInputDialog("Etiqueta");
                if (etiqueta != null) {
//                    co.etiquetas.add(etiqueta);
                    co.etiquets.addEtiqueta(etiqueta);
                    co.etiquets.addComponets();
                    idContactoSeleccionado = co.getId();
                    idSeleccionado = c.contactos.getListaContactos().indexOf(co);
                    editar();
//                    System.out.println("BOLA");
                }
            });
            for (VISTA.Etiqueta et : co.etiquets.getListaEtiquetas()) {
                et.btnQuitar.addActionListener((java.awt.event.ActionEvent evt) -> {
                    c.txtNombre.setText(co.getNombre());
                    c.txtTelefono.setText(co.getTelefono());
                    c.txtDescripcion.setText(co.getDescripcion());
                    co.etiquets.getListaEtiquetas().remove(et);
                    editar();
                });
            }
            
            co.perfil.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    c.txtNombre.setText(co.getNombre());
                    c.txtTelefono.setText(co.getTelefono());
                    c.txtDescripcion.setText(co.getDescripcion());
                    co.clickImagen();
                    idContactoSeleccionado = co.getId();
                    idSeleccionado = c.contactos.getListaContactos().indexOf(co);
                    editar();
                }
            });
            cont++;
        }
    }

    private void limpiar() {
        c.txtDescripcion.setText("");
        c.txtNombre.setText("");
        c.txtTelefono.setText("");
        cargarContactos();
    }

}
