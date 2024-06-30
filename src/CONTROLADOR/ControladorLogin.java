package CONTROLADOR;

import DAO.DaoLogin;
import MODELO.UIController;
import VISTA.mdlContactos;
import VISTA.mdlLogin;
import java.awt.Point;
import javax.swing.JOptionPane;

public class ControladorLogin {

    private final mdlLogin c;

    public ControladorLogin(mdlLogin c) {
        this.c = c;
    }

    public void init() {
        UIController.transparentarTxtField(c.txtUsuario, c.txtPassword);
        initPlaceholder();
    }
    
    private void initPlaceholder(){
        UIController.applyPlaceholder(c.txtUsuario, "usuario");
        UIController.applyPlaceholder(c.txtPassword, "password");
    }
    
    public void btnInicioSesion() {
        String usuario = c.txtUsuario.getText();
        String password = c.txtPassword.getText();
        if (UIController.isVacio(usuario, password)) {
            if (DaoLogin.ingresar(usuario, password)) {
                ingresar();
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Rellenar credenciales", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void ingresar() {
        VISTA.frmPrincipal parentWindon = (VISTA.frmPrincipal) javax.swing.SwingUtilities.windowForComponent(c);
        parentWindon.pBotones.setVisible(true);
        parentWindon.scrolPrincipal.getViewport().setViewPosition(new Point(0, 0));
        if(!DaoLogin.RANGO.equals("administrador")){
            parentWindon.btnRegistrar.setVisible(false);
        }else{
            parentWindon.btnRegistrar.setVisible(true);
        }
        UIController.mostrarPanel(parentWindon.CONTENEDOR, new mdlContactos());
    }

}
