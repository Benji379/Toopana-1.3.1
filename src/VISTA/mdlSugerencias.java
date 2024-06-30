package VISTA;

import CONTROLADOR.ControladorSugerencias;

public class mdlSugerencias extends javax.swing.JPanel {

    ControladorSugerencias controlador;
    
    public mdlSugerencias() {
        initComponents();
        controlador = new ControladorSugerencias(this);
        controlador.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pTittle = new COMPONET.PanelCustom();
        pUsuario = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        separadorUsuario = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        pUsuario1 = new javax.swing.JPanel();
        separadorUsuario1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        pUsuario2 = new javax.swing.JPanel();
        txtTema = new javax.swing.JTextField();
        separadorUsuario2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        btnEnviar = new COMPONET.Button();
        pUsuario3 = new javax.swing.JPanel();
        txtTelefono = new javax.swing.JTextField();
        separadorUsuario3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        pUsuario4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        scrolSugerencia = new javax.swing.JScrollPane();
        txtSugerencia = new javax.swing.JTextArea();
        pTittle1 = new COMPONET.PanelCustom();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 0, 51));

        pTittle.setBackground(new java.awt.Color(0, 51, 51));
        pTittle.setRound(55);
        pTittle.setShadowColor(new java.awt.Color(0, 0, 0));

        pUsuario.setBackground(new java.awt.Color(0, 51, 51));

        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setToolTipText("");
        txtUsuario.setSelectionColor(new java.awt.Color(48, 2, 44));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese nombre de usuario");

        javax.swing.GroupLayout pUsuarioLayout = new javax.swing.GroupLayout(pUsuario);
        pUsuario.setLayout(pUsuarioLayout);
        pUsuarioLayout.setHorizontalGroup(
            pUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuarioLayout.createSequentialGroup()
                .addGroup(pUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pUsuarioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separadorUsuario)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)))
                    .addGroup(pUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pUsuarioLayout.setVerticalGroup(
            pUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuarioLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(separadorUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pUsuario1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese tipo de queja");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Sugerencia");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.setFocusPainted(false);

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Queja del aplicativo");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton2.setFocusPainted(false);

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Otro");
        jRadioButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton3.setFocusPainted(false);

        javax.swing.GroupLayout pUsuario1Layout = new javax.swing.GroupLayout(pUsuario1);
        pUsuario1.setLayout(pUsuario1Layout);
        pUsuario1Layout.setHorizontalGroup(
            pUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuario1Layout.createSequentialGroup()
                .addGroup(pUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pUsuario1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(separadorUsuario1))
                    .addGroup(pUsuario1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pUsuario1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        pUsuario1Layout.setVerticalGroup(
            pUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuario1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(7, 7, 7)
                .addComponent(separadorUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pUsuario2.setBackground(new java.awt.Color(0, 51, 51));

        txtTema.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtTema.setForeground(new java.awt.Color(255, 255, 255));
        txtTema.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTema.setToolTipText("");
        txtTema.setSelectionColor(new java.awt.Color(48, 2, 44));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese tema de queja");

        javax.swing.GroupLayout pUsuario2Layout = new javax.swing.GroupLayout(pUsuario2);
        pUsuario2.setLayout(pUsuario2Layout);
        pUsuario2Layout.setHorizontalGroup(
            pUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuario2Layout.createSequentialGroup()
                .addGroup(pUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pUsuario2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separadorUsuario2)
                            .addComponent(txtTema, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)))
                    .addGroup(pUsuario2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pUsuario2Layout.setVerticalGroup(
            pUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuario2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(txtTema, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(separadorUsuario2, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        btnEnviar.setBackground(new java.awt.Color(0, 153, 153));
        btnEnviar.setForeground(new java.awt.Color(0, 0, 0));
        btnEnviar.setText("Enviar");
        btnEnviar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        btnEnviar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        pUsuario3.setBackground(new java.awt.Color(0, 51, 51));

        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefono.setToolTipText("");
        txtTelefono.setSelectionColor(new java.awt.Color(48, 2, 44));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero de Telefono");

        javax.swing.GroupLayout pUsuario3Layout = new javax.swing.GroupLayout(pUsuario3);
        pUsuario3.setLayout(pUsuario3Layout);
        pUsuario3Layout.setHorizontalGroup(
            pUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuario3Layout.createSequentialGroup()
                .addGroup(pUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pUsuario3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separadorUsuario3)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)))
                    .addGroup(pUsuario3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pUsuario3Layout.setVerticalGroup(
            pUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuario3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(separadorUsuario3, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pUsuario4.setBackground(new java.awt.Color(0, 51, 51));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sugerencia o Queja");

        scrolSugerencia.setBorder(null);

        txtSugerencia.setColumns(20);
        txtSugerencia.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtSugerencia.setForeground(new java.awt.Color(255, 255, 255));
        txtSugerencia.setRows(5);
        txtSugerencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        scrolSugerencia.setViewportView(txtSugerencia);

        javax.swing.GroupLayout pUsuario4Layout = new javax.swing.GroupLayout(pUsuario4);
        pUsuario4.setLayout(pUsuario4Layout);
        pUsuario4Layout.setHorizontalGroup(
            pUsuario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuario4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pUsuario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                    .addComponent(scrolSugerencia))
                .addContainerGap())
        );
        pUsuario4Layout.setVerticalGroup(
            pUsuario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuario4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(scrolSugerencia, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pTittleLayout = new javax.swing.GroupLayout(pTittle);
        pTittle.setLayout(pTittleLayout);
        pTittleLayout.setHorizontalGroup(
            pTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTittleLayout.createSequentialGroup()
                .addGroup(pTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTittleLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pUsuario4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pTittleLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        pTittleLayout.setVerticalGroup(
            pTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTittleLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(pUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(pUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pUsuario4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pTittle1.setBackground(new java.awt.Color(0, 51, 51));
        pTittle1.setRound(55);
        pTittle1.setShadowColor(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sugerencias");

        javax.swing.GroupLayout pTittle1Layout = new javax.swing.GroupLayout(pTittle1);
        pTittle1.setLayout(pTittle1Layout);
        pTittle1Layout.setHorizontalGroup(
            pTittle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTittle1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pTittle1Layout.setVerticalGroup(
            pTittle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTittle1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(pTittle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(pTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(pTittle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(775, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        controlador.btnRregistrar();
    }//GEN-LAST:event_btnEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public COMPONET.Button btnEnviar;
    public javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JRadioButton jRadioButton1;
    public javax.swing.JRadioButton jRadioButton2;
    public javax.swing.JRadioButton jRadioButton3;
    public COMPONET.PanelCustom pTittle;
    public COMPONET.PanelCustom pTittle1;
    public javax.swing.JPanel pUsuario;
    public javax.swing.JPanel pUsuario1;
    public javax.swing.JPanel pUsuario2;
    public javax.swing.JPanel pUsuario3;
    public javax.swing.JPanel pUsuario4;
    public javax.swing.JScrollPane scrolSugerencia;
    public javax.swing.JSeparator separadorUsuario;
    public javax.swing.JSeparator separadorUsuario1;
    public javax.swing.JSeparator separadorUsuario2;
    public javax.swing.JSeparator separadorUsuario3;
    public javax.swing.JTextArea txtSugerencia;
    public javax.swing.JTextField txtTelefono;
    public javax.swing.JTextField txtTema;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
