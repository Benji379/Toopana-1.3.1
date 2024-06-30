package VISTA;

import CONTROLADOR.ControladorPrincipal;

public class frmPrincipal extends javax.swing.JFrame {
    
    ControladorPrincipal controlador;
    
    public frmPrincipal() {
        initComponents();
        controlador = new ControladorPrincipal(this);
        controlador.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrolPrincipal = new COMPONET.ScrollPaneWin11();
        pFondo = new javax.swing.JPanel();
        pTittle = new COMPONET.PanelCustom();
        jlbTittle = new javax.swing.JLabel();
        pContenedor = new COMPONET.PanelCustom();
        CONTENEDOR = new javax.swing.JPanel();
        jlbCopyrigth = new javax.swing.JLabel();
        pBotones = new COMPONET.PanelRound();
        btnContactos = new COMPONET.Button();
        btnAcceder = new COMPONET.Button();
        btnRegistrar = new COMPONET.Button();
        btnSuferencia = new COMPONET.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicativo Toopana");
        setResizable(false);

        scrolPrincipal.setBorder(null);

        pFondo.setBackground(new java.awt.Color(51, 0, 51));

        pTittle.setBackground(new java.awt.Color(0, 51, 51));
        pTittle.setRound(55);
        pTittle.setShadowColor(new java.awt.Color(0, 0, 0));

        jlbTittle.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jlbTittle.setForeground(new java.awt.Color(255, 255, 255));
        jlbTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTittle.setText("Bienvenidos a Toopana");

        javax.swing.GroupLayout pTittleLayout = new javax.swing.GroupLayout(pTittle);
        pTittle.setLayout(pTittleLayout);
        pTittleLayout.setHorizontalGroup(
            pTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTittleLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jlbTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        pTittleLayout.setVerticalGroup(
            pTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTittleLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jlbTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pContenedor.setBackground(new java.awt.Color(51, 0, 51));
        pContenedor.setShadowColor(new java.awt.Color(0, 0, 0));

        CONTENEDOR.setBackground(new java.awt.Color(255, 255, 255));
        CONTENEDOR.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout pContenedorLayout = new javax.swing.GroupLayout(pContenedor);
        pContenedor.setLayout(pContenedorLayout);
        pContenedorLayout.setHorizontalGroup(
            pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CONTENEDOR, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                .addContainerGap())
        );
        pContenedorLayout.setVerticalGroup(
            pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CONTENEDOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jlbCopyrigth.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jlbCopyrigth.setForeground(new java.awt.Color(255, 255, 255));
        jlbCopyrigth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbCopyrigth.setText("Copyright 2024 - Grupo de Integrador I UTP");

        pBotones.setBackground(new java.awt.Color(51, 0, 51));
        pBotones.setRoundBottomLeft(15);
        pBotones.setRoundBottomRight(15);
        pBotones.setRoundTopLeft(15);
        pBotones.setRoundTopRight(15);

        btnContactos.setBackground(new java.awt.Color(51, 0, 51));
        btnContactos.setForeground(new java.awt.Color(255, 255, 255));
        btnContactos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/contactos.png"))); // NOI18N
        btnContactos.setText("Contactos");
        btnContactos.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContactos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnContactos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnContactos.setShadowColor(new java.awt.Color(0, 0, 0));
        btnContactos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnContactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactosActionPerformed(evt);
            }
        });

        btnAcceder.setBackground(new java.awt.Color(51, 0, 51));
        btnAcceder.setForeground(new java.awt.Color(255, 255, 255));
        btnAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/MainAcceder.png"))); // NOI18N
        btnAcceder.setText("Acceder");
        btnAcceder.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcceder.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAcceder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAcceder.setShadowColor(new java.awt.Color(0, 0, 0));
        btnAcceder.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(51, 0, 51));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/MainRegistrar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnSuferencia.setBackground(new java.awt.Color(51, 0, 51));
        btnSuferencia.setForeground(new java.awt.Color(255, 255, 255));
        btnSuferencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/MainEnviarSugerencia.png"))); // NOI18N
        btnSuferencia.setText("Sugerencia");
        btnSuferencia.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuferencia.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        btnSuferencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuferencia.setShadowColor(new java.awt.Color(0, 0, 0));
        btnSuferencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSuferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuferenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBotonesLayout = new javax.swing.GroupLayout(pBotones);
        pBotones.setLayout(pBotonesLayout);
        pBotonesLayout.setHorizontalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(btnContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnSuferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pBotonesLayout.setVerticalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSuferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContactos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout pFondoLayout = new javax.swing.GroupLayout(pFondo);
        pFondo.setLayout(pFondoLayout);
        pFondoLayout.setHorizontalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbCopyrigth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addComponent(pTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(55, 55, 55))
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addComponent(pContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pFondoLayout.setVerticalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(jlbCopyrigth)
                .addGap(20, 20, 20)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        scrolPrincipal.setViewportView(pFondo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrolPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrolPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
          controlador.btnRegistrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactosActionPerformed
        controlador.btnContactos();
    }//GEN-LAST:event_btnContactosActionPerformed

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        controlador.btnLogin();
    }//GEN-LAST:event_btnAccederActionPerformed

    private void btnSuferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuferenciaActionPerformed
        controlador.btnSugerencias();
    }//GEN-LAST:event_btnSuferenciaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel CONTENEDOR;
    public COMPONET.Button btnAcceder;
    public COMPONET.Button btnContactos;
    public COMPONET.Button btnRegistrar;
    public COMPONET.Button btnSuferencia;
    public javax.swing.JLabel jlbCopyrigth;
    public javax.swing.JLabel jlbTittle;
    public COMPONET.PanelRound pBotones;
    public COMPONET.PanelCustom pContenedor;
    public javax.swing.JPanel pFondo;
    public COMPONET.PanelCustom pTittle;
    public javax.swing.JScrollPane scrolPrincipal;
    // End of variables declaration//GEN-END:variables
}
