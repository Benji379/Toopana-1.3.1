package CONTROLADOR;

import COMPONET.FileChooserCustom;
import DAO.DaoUsuario;
import MODELO.UIController;
import MODELO.Usuario;
import VISTA.mdlRegistrar;
import java.awt.Cursor;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import javax.swing.JOptionPane;

public class ControladorRegistrar {

    private final mdlRegistrar c;

    public ControladorRegistrar(mdlRegistrar c) {
        this.c = c;
    }

    public void init() {
        UIController.transparentarTxtField(
                c.txtApellidos, c.txtNombres, c.txtUsuario, c.txtEmail,
                c.txtPassword, c.txtPasswordConfir, c.txtTelefono);
        c.imagenPerfil.setCursor(new Cursor(12));
        initTextFields();
    }

    private void initTextFields(){
        UIController.applyPlaceholder(c.txtApellidos, "apellidos");
        UIController.applyPlaceholder(c.txtEmail, "email@gmail.com");
        UIController.applyPlaceholder(c.txtNombres, "nombres");
        UIController.applyPlaceholder(c.txtPassword, "*******");
        UIController.applyPlaceholder(c.txtPasswordConfir, "*******");
        UIController.applyPlaceholder(c.txtTelefono, "992803880");
        UIController.applyPlaceholder(c.txtUsuario, "usuario");
    }
    
    public InputStream clickImagen() {
        try {
            String extensiones[] = {"png", "jpg", "jpeg"};
            String urlImgen = FileChooserCustom.FileChosserArchivo("", extensiones, ".png .jpg .jpeg");
            System.out.println(urlImgen);
            if (urlImgen != null) {
                InputStream inputUrl = UIController.toInputStream(urlImgen);
                c.imagenPerfil.setImage(UIController.toIcon(inputUrl));
                System.out.println(c.imagenPerfil.getImage().toString());
                return inputUrl;
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    public void btnRegistrar() {
        try {

            String usuario = c.txtUsuario.getText();
            String nombres = c.txtNombres.getText();
            String apellidos = c.txtApellidos.getText();
            String password = c.txtPassword.getText();
            String passwordConfir = c.txtPasswordConfir.getText();
            String email = c.txtEmail.getText();
            String telefono = c.txtTelefono.getText();
            InputStream foto = UIController.toInputStream(c.imagenPerfil.getImage());
            Timestamp fecha = UIController.obtenerFechaActual();

            if (UIController.isVacio(usuario, nombres, apellidos, password, email, telefono)) {
                if (password.equals(passwordConfir)) {
                    Usuario user = new Usuario(usuario, nombres, apellidos, password, email, telefono, foto, fecha);
                    if (!DaoUsuario.usuarioValido(usuario)) {
                        boolean registrar = DaoUsuario.registrarUsuario(user);
                        if (registrar) {
                            UIController.ventanaEmergente("Registro Exitoso", "/img/check.png");
                            limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo hacer el registro", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario existente", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Verifique los password de confirmacion", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Inputs vacios", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NullPointerException | IOException e) {
        }
    }

    private void limpiar() {
        UIController.vaciosTextField(
                c.txtApellidos, c.txtNombres, c.txtUsuario, c.txtEmail,
                c.txtPassword, c.txtPasswordConfir, c.txtTelefono);
        c.imagenPerfil.setImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/usuario.png")));
    }

}
