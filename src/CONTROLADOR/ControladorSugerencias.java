package CONTROLADOR;

import DAO.DaoSugerencia;
import DAO.DaoUsuario;
import MODELO.Sugerencia;
import MODELO.UIController;
import VISTA.mdlSugerencias;
import java.awt.event.ActionEvent;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

public class ControladorSugerencias {

    mdlSugerencias c;

    public ControladorSugerencias(mdlSugerencias c) {
        this.c = c;
    }

    public void init() {
        selectButtons();
        UIController.transparentarTxtField(c.txtTelefono, c.txtTema, c.txtUsuario);
        UIController.textAreaInivisible(c.txtSugerencia, c.scrolSugerencia);
        initTextField();
    }

    private void initTextField(){
        UIController.applyPlaceholder(c.txtSugerencia, "mi sugerencia es...");
        UIController.applyPlaceholder(c.txtTelefono, "992803880");
        UIController.applyPlaceholder(c.txtTema, "tema");
        UIController.applyPlaceholder(c.txtUsuario, "user1");
    }
    
    private void selectButtons() {
        Enumeration<AbstractButton> buttons = c.buttonGroup1.getElements();
        while (buttons.hasMoreElements()) {
            AbstractButton button = buttons.nextElement();
            button.addActionListener((ActionEvent e) -> {
                if (button.isSelected()) {
//                System.out.println("Selected RadioButton: " + button.getActionCommand());
                    System.out.println(button.getText());
//                    seleccionado = button.getText();
                }
            });
        }
    }

    private String botonSelecionado() {
        Enumeration<AbstractButton> buttons = c.buttonGroup1.getElements();
        String seleccionado = null;
        while (buttons.hasMoreElements()) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
//                System.out.println("Selected RadioButton: " + button.getActionCommand());
                System.out.println(button.getText());
                seleccionado = button.getText();
            }
        }
        return seleccionado;
    }

    public void btnRregistrar() {
        String usuario = c.txtUsuario.getText();
        String tema = c.txtTema.getText();
        String tipoQueja = botonSelecionado();
        String telefono = c.txtTelefono.getText();
        String descripcion = c.txtSugerencia.getText();

        if (UIController.isVacio(usuario, tema, telefono, descripcion)) {
            if (DaoUsuario.usuarioValido(usuario)) {
                int idUsuario = DaoUsuario.idUsuario(usuario);
                Sugerencia sug = new Sugerencia(idUsuario, tema, tipoQueja, telefono, descripcion, UIController.obtenerFechaActual());
                DaoSugerencia.registrar(sug);
                JOptionPane.showMessageDialog(null, "Sugerencia registrada");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Rellenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void limpiar() {
        c.txtUsuario.setText("");
        c.txtTema.setText("");
        c.txtTelefono.setText("");
        c.txtSugerencia.setText("");
    }

}
