package VISTA;

public class Etiqueta extends COMPONET.PanelCustom {

    private String etiqueta = "Etiqueta";
    private int index;

    public Etiqueta(String etiqueta, int index) {
        initComponents();
        this.etiqueta = etiqueta;
        this.index = index;
        paintEtiqueta();
    }

    private void paintEtiqueta() {
        if (!etiqueta.equals("")) {
            txtEtiqueta.setText(etiqueta);
        }else{
            txtEtiqueta.setText("Etiqueta");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEtiqueta = new javax.swing.JLabel();
        btnQuitar = new COMPONET.Button();

        setBackground(new java.awt.Color(0, 0, 102));
        setShadowColor(new java.awt.Color(0, 0, 0));

        txtEtiqueta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtEtiqueta.setForeground(new java.awt.Color(255, 255, 255));
        txtEtiqueta.setText("Etiqueta");

        btnQuitar.setForeground(new java.awt.Color(0, 0, 0));
        btnQuitar.setText("x");
        btnQuitar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuitar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnQuitar.setRippleColor(new java.awt.Color(0, 0, 0));
        btnQuitar.setRound(50);
        btnQuitar.setShadowColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtEtiqueta)
                .addGap(5, 5, 5)
                .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public COMPONET.Button btnQuitar;
    private javax.swing.JLabel txtEtiqueta;
    // End of variables declaration//GEN-END:variables

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
        txtEtiqueta.setText(etiqueta);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
