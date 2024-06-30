package VISTA;

import CONTROLADOR.ControladorRegistrar;
import MODELO.UIController;

public class mdlRegistrar extends javax.swing.JPanel {

    ControladorRegistrar controlador;

    public mdlRegistrar() {
        initComponents();
        controlador = new ControladorRegistrar(this);
        controlador.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTittle = new COMPONET.PanelCustom();
        jLabel1 = new javax.swing.JLabel();
        pTittle1 = new COMPONET.PanelCustom();
        panelCustom1 = new COMPONET.PanelCustom();
        imagenPerfil = new COMPONET.ImageAvatar();
        pInput1 = new javax.swing.JPanel();
        pUsuario = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        separadorUsuario = new javax.swing.JSeparator();
        pNombres = new javax.swing.JPanel();
        txtNombres = new javax.swing.JTextField();
        separadorUsuario1 = new javax.swing.JSeparator();
        pApellidos = new javax.swing.JPanel();
        txtApellidos = new javax.swing.JTextField();
        separadorUsuario2 = new javax.swing.JSeparator();
        pInput2 = new javax.swing.JPanel();
        pPassword = new javax.swing.JPanel();
        separadorUsuario3 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        pPasswordConfir = new javax.swing.JPanel();
        separadorUsuario4 = new javax.swing.JSeparator();
        txtPasswordConfir = new javax.swing.JPasswordField();
        pEmail = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        separadorUsuario5 = new javax.swing.JSeparator();
        pTelefono = new javax.swing.JPanel();
        txtTelefono = new javax.swing.JTextField();
        separadorUsuario6 = new javax.swing.JSeparator();
        btnRegistrar = new COMPONET.Button();

        setBackground(new java.awt.Color(51, 0, 51));

        pTittle.setBackground(new java.awt.Color(0, 51, 51));
        pTittle.setRound(55);
        pTittle.setShadowColor(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar");

        javax.swing.GroupLayout pTittleLayout = new javax.swing.GroupLayout(pTittle);
        pTittle.setLayout(pTittleLayout);
        pTittleLayout.setHorizontalGroup(
            pTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTittleLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pTittleLayout.setVerticalGroup(
            pTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTittleLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );

        pTittle1.setBackground(new java.awt.Color(0, 51, 51));
        pTittle1.setRound(55);
        pTittle1.setShadowColor(new java.awt.Color(0, 0, 0));

        panelCustom1.setBackground(new java.awt.Color(0, 51, 51));
        panelCustom1.setRound(55);
        panelCustom1.setShadowColor(new java.awt.Color(0, 0, 0));

        imagenPerfil.setGradientColor1(new java.awt.Color(51, 0, 51));
        imagenPerfil.setGradientColor2(new java.awt.Color(0, 51, 51));
        imagenPerfil.setImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/usuario.png"))); // NOI18N
        imagenPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenPerfilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelCustom1Layout = new javax.swing.GroupLayout(panelCustom1);
        panelCustom1.setLayout(panelCustom1Layout);
        panelCustom1Layout.setHorizontalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imagenPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelCustom1Layout.setVerticalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imagenPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pInput1.setBackground(new java.awt.Color(0, 51, 51));

        pUsuario.setBackground(new java.awt.Color(0, 51, 51));

        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setToolTipText("");
        txtUsuario.setSelectionColor(new java.awt.Color(48, 2, 44));

        javax.swing.GroupLayout pUsuarioLayout = new javax.swing.GroupLayout(pUsuario);
        pUsuario.setLayout(pUsuarioLayout);
        pUsuarioLayout.setHorizontalGroup(
            pUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuarioLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separadorUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                .addContainerGap())
        );
        pUsuarioLayout.setVerticalGroup(
            pUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuarioLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(separadorUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pNombres.setBackground(new java.awt.Color(0, 51, 51));

        txtNombres.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(255, 255, 255));
        txtNombres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombres.setToolTipText("");
        txtNombres.setSelectionColor(new java.awt.Color(48, 2, 44));

        javax.swing.GroupLayout pNombresLayout = new javax.swing.GroupLayout(pNombres);
        pNombres.setLayout(pNombresLayout);
        pNombresLayout.setHorizontalGroup(
            pNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNombresLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separadorUsuario1)
                    .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                .addContainerGap())
        );
        pNombresLayout.setVerticalGroup(
            pNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNombresLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(separadorUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pApellidos.setBackground(new java.awt.Color(0, 51, 51));

        txtApellidos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidos.setToolTipText("");
        txtApellidos.setSelectionColor(new java.awt.Color(48, 2, 44));

        javax.swing.GroupLayout pApellidosLayout = new javax.swing.GroupLayout(pApellidos);
        pApellidos.setLayout(pApellidosLayout);
        pApellidosLayout.setHorizontalGroup(
            pApellidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pApellidosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pApellidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separadorUsuario2)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                .addContainerGap())
        );
        pApellidosLayout.setVerticalGroup(
            pApellidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pApellidosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(separadorUsuario2, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout pInput1Layout = new javax.swing.GroupLayout(pInput1);
        pInput1.setLayout(pInput1Layout);
        pInput1Layout.setHorizontalGroup(
            pInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInput1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        pInput1Layout.setVerticalGroup(
            pInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInput1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pInput2.setBackground(new java.awt.Color(0, 51, 51));

        pPassword.setBackground(new java.awt.Color(0, 51, 51));

        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pPasswordLayout = new javax.swing.GroupLayout(pPassword);
        pPassword.setLayout(pPasswordLayout);
        pPasswordLayout.setHorizontalGroup(
            pPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPasswordLayout.createSequentialGroup()
                .addGroup(pPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPasswordLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(separadorUsuario3, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
                    .addGroup(pPasswordLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtPassword)))
                .addContainerGap())
        );
        pPasswordLayout.setVerticalGroup(
            pPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(separadorUsuario3, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pPasswordConfir.setBackground(new java.awt.Color(0, 51, 51));

        txtPasswordConfir.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtPasswordConfir.setForeground(new java.awt.Color(255, 255, 255));
        txtPasswordConfir.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pPasswordConfirLayout = new javax.swing.GroupLayout(pPasswordConfir);
        pPasswordConfir.setLayout(pPasswordConfirLayout);
        pPasswordConfirLayout.setHorizontalGroup(
            pPasswordConfirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPasswordConfirLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(separadorUsuario4, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pPasswordConfirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pPasswordConfirLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtPasswordConfir, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pPasswordConfirLayout.setVerticalGroup(
            pPasswordConfirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPasswordConfirLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(separadorUsuario4, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(pPasswordConfirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pPasswordConfirLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(txtPasswordConfir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        pEmail.setBackground(new java.awt.Color(0, 51, 51));

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setToolTipText("");
        txtEmail.setSelectionColor(new java.awt.Color(48, 2, 44));

        javax.swing.GroupLayout pEmailLayout = new javax.swing.GroupLayout(pEmail);
        pEmail.setLayout(pEmailLayout);
        pEmailLayout.setHorizontalGroup(
            pEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmailLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separadorUsuario5)
                    .addComponent(txtEmail))
                .addContainerGap())
        );
        pEmailLayout.setVerticalGroup(
            pEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmailLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(separadorUsuario5, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pTelefono.setBackground(new java.awt.Color(0, 51, 51));

        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefono.setToolTipText("");
        txtTelefono.setSelectionColor(new java.awt.Color(48, 2, 44));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pTelefonoLayout = new javax.swing.GroupLayout(pTelefono);
        pTelefono.setLayout(pTelefonoLayout);
        pTelefonoLayout.setHorizontalGroup(
            pTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTelefonoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separadorUsuario6)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
                .addContainerGap())
        );
        pTelefonoLayout.setVerticalGroup(
            pTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTelefonoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(separadorUsuario6, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout pInput2Layout = new javax.swing.GroupLayout(pInput2);
        pInput2.setLayout(pInput2Layout);
        pInput2Layout.setHorizontalGroup(
            pInput2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInput2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInput2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pPasswordConfir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pInput2Layout.setVerticalGroup(
            pInput2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInput2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pPasswordConfir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnRegistrar.setBackground(new java.awt.Color(0, 153, 153));
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        btnRegistrar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pTittle1Layout = new javax.swing.GroupLayout(pTittle1);
        pTittle1.setLayout(pTittle1Layout);
        pTittle1Layout.setHorizontalGroup(
            pTittle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTittle1Layout.createSequentialGroup()
                .addGroup(pTittle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTittle1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(panelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pInput1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pTittle1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(pInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pTittle1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        pTittle1Layout.setVerticalGroup(
            pTittle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTittle1Layout.createSequentialGroup()
                .addGroup(pTittle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTittle1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(panelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pTittle1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(pInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(pInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pTittle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(pTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(pTittle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        controlador.btnRegistrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void imagenPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenPerfilMouseClicked
        controlador.clickImagen();
    }//GEN-LAST:event_imagenPerfilMouseClicked

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        UIController.limitacionNumeros(txtTelefono, evt, 9);
    }//GEN-LAST:event_txtTelefonoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public COMPONET.Button btnRegistrar;
    public COMPONET.ImageAvatar imagenPerfil;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JPanel pApellidos;
    public javax.swing.JPanel pEmail;
    public javax.swing.JPanel pInput1;
    public javax.swing.JPanel pInput2;
    public javax.swing.JPanel pNombres;
    public javax.swing.JPanel pPassword;
    public javax.swing.JPanel pPasswordConfir;
    public javax.swing.JPanel pTelefono;
    public COMPONET.PanelCustom pTittle;
    public COMPONET.PanelCustom pTittle1;
    public javax.swing.JPanel pUsuario;
    public COMPONET.PanelCustom panelCustom1;
    public javax.swing.JSeparator separadorUsuario;
    public javax.swing.JSeparator separadorUsuario1;
    public javax.swing.JSeparator separadorUsuario2;
    public javax.swing.JSeparator separadorUsuario3;
    public javax.swing.JSeparator separadorUsuario4;
    public javax.swing.JSeparator separadorUsuario5;
    public javax.swing.JSeparator separadorUsuario6;
    public javax.swing.JTextField txtApellidos;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtNombres;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JPasswordField txtPasswordConfir;
    public javax.swing.JTextField txtTelefono;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
