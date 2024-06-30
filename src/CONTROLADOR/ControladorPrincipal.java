package CONTROLADOR;

import MODELO.UIController;
import VISTA.frmPrincipal;
import VISTA.mdlContactos;
import VISTA.mdlLogin;
import VISTA.mdlRegistrar;
import VISTA.mdlSugerencias;
import java.awt.Point;
import javax.swing.JPanel;

public class ControladorPrincipal {

    private final frmPrincipal c;

    public ControladorPrincipal(frmPrincipal c) {
        this.c = c;
    }
    
    public void init(){
        c.setLocationRelativeTo(null);
        c.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo.png")));
        btnLogin();
    }
    public void btnSugerencias(){
        abrir(new mdlSugerencias());
    }    
    
    public void btnLogin(){
        abrir(new mdlLogin());
        c.pBotones.setVisible(false);
    }
    
    public void btnContactos(){
        abrir(new mdlContactos());
    }
    
    public void btnRegistrar(){
        abrir(new mdlRegistrar());
    }
    
    private void abrir(JPanel p){
        c.scrolPrincipal.getViewport().setViewPosition(new Point(0, 0));
        c.pTittle.setVisible(false);
        UIController.mostrarPanel(c.CONTENEDOR, p);
    }
    
}
