package VISTA;

import CONTROLADOR.ControladorLogin;

public class mdlLogin extends javax.swing.JPanel {
    
    private final ControladorLogin controlador;
    
    public mdlLogin() {
        initComponents();
        controlador = new ControladorLogin(this);
        controlador.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        pTittle = new COMPONET.PanelCustom();
        jlbTittle = new javax.swing.JLabel();
        pFondo = new COMPONET.PanelCustom();
        pFondoLogo = new COMPONET.PanelCustom();
        logo = new COMPONET.Imagen();
        pTxtUsuario = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        separadorUsuario = new javax.swing.JSeparator();
        ptxtPassword = new javax.swing.JPanel();
        separadorPassword = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        btnAcceder = new COMPONET.Button();

        jPasswordField1.setText("jPasswordField1");

        setBackground(new java.awt.Color(51, 0, 51));

        pTittle.setBackground(new java.awt.Color(0, 51, 51));
        pTittle.setRound(55);
        pTittle.setShadowColor(new java.awt.Color(0, 0, 0));

        jlbTittle.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jlbTittle.setForeground(new java.awt.Color(255, 255, 255));
        jlbTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTittle.setText("Log in");

        javax.swing.GroupLayout pTittleLayout = new javax.swing.GroupLayout(pTittle);
        pTittle.setLayout(pTittleLayout);
        pTittleLayout.setHorizontalGroup(
            pTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTittleLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        pTittleLayout.setVerticalGroup(
            pTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTittleLayout.createSequentialGroup()
                .addComponent(jlbTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pFondo.setBackground(new java.awt.Color(0, 51, 51));
        pFondo.setRound(55);
        pFondo.setShadowColor(new java.awt.Color(0, 0, 0));

        pFondoLogo.setBackground(new java.awt.Color(220, 9, 134));
        pFondoLogo.setRound(55);
        pFondoLogo.setShadowColor(new java.awt.Color(0, 0, 0));

        logo.setImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo2.png"))); // NOI18N

        javax.swing.GroupLayout pFondoLogoLayout = new javax.swing.GroupLayout(pFondoLogo);
        pFondoLogo.setLayout(pFondoLogoLayout);
        pFondoLogoLayout.setHorizontalGroup(
            pFondoLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pFondoLogoLayout.setVerticalGroup(
            pFondoLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFondoLogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pTxtUsuario.setBackground(new java.awt.Color(0, 51, 51));

        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setToolTipText("");
        txtUsuario.setSelectionColor(new java.awt.Color(48, 2, 44));

        javax.swing.GroupLayout pTxtUsuarioLayout = new javax.swing.GroupLayout(pTxtUsuario);
        pTxtUsuario.setLayout(pTxtUsuarioLayout);
        pTxtUsuarioLayout.setHorizontalGroup(
            pTxtUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTxtUsuarioLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pTxtUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separadorUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
                .addContainerGap())
        );
        pTxtUsuarioLayout.setVerticalGroup(
            pTxtUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTxtUsuarioLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(separadorUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        ptxtPassword.setBackground(new java.awt.Color(0, 51, 51));

        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout ptxtPasswordLayout = new javax.swing.GroupLayout(ptxtPassword);
        ptxtPassword.setLayout(ptxtPasswordLayout);
        ptxtPasswordLayout.setHorizontalGroup(
            ptxtPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ptxtPasswordLayout.createSequentialGroup()
                .addGroup(ptxtPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ptxtPasswordLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(separadorPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
                    .addGroup(ptxtPasswordLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtPassword)))
                .addContainerGap())
        );
        ptxtPasswordLayout.setVerticalGroup(
            ptxtPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ptxtPasswordLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAcceder.setBackground(new java.awt.Color(0, 153, 153));
        btnAcceder.setForeground(new java.awt.Color(0, 0, 0));
        btnAcceder.setText("Acceder");
        btnAcceder.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcceder.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        btnAcceder.setShadowColor(new java.awt.Color(0, 0, 0));
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pFondoLayout = new javax.swing.GroupLayout(pFondo);
        pFondo.setLayout(pFondoLayout);
        pFondoLayout.setHorizontalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFondoLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(pFondoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAcceder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pTxtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ptxtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(95, 95, 95))
        );
        pFondoLayout.setVerticalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pFondoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(pTxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addComponent(pFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        controlador.btnInicioSesion();
    }//GEN-LAST:event_btnAccederActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public COMPONET.Button btnAcceder;
    public javax.swing.JPasswordField jPasswordField1;
    public javax.swing.JLabel jlbTittle;
    public COMPONET.Imagen logo;
    public COMPONET.PanelCustom pFondo;
    public COMPONET.PanelCustom pFondoLogo;
    public COMPONET.PanelCustom pTittle;
    public javax.swing.JPanel pTxtUsuario;
    public javax.swing.JPanel ptxtPassword;
    public javax.swing.JSeparator separadorPassword;
    public javax.swing.JSeparator separadorUsuario;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
