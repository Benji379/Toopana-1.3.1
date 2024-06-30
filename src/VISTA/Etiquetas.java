package VISTA;

import java.util.ArrayList;

public class Etiquetas extends COMPONET.PanelCustom {

    private ArrayList<Etiqueta> listaEtiquetas;
    private int index = 0;
    private boolean visibleQuit = true;
    
    public Etiquetas() {
        initComponents();
        listaEtiquetas = new ArrayList<>();
        index = 0;
    }

    public void addEtiqueta(String nombreEtiquetas) {
        System.out.println(index);
        Etiqueta et = new Etiqueta(nombreEtiquetas, index);
        listaEtiquetas.add(et);
        index++;
        addComponets();
        et.btnQuitar.addActionListener((java.awt.event.ActionEvent evt) -> {
//            listaEtiquetas.remove(et);
            addComponets();
        });
    }

    public void addEtiqueta(String... nombreEtiquetas) {
        for (String nmEt : nombreEtiquetas) {
            addEtiqueta(nmEt);
        }
    }

    public void addEtiqueta(ArrayList<String> nombreEtiquetas) {
        for (String nmEt : nombreEtiquetas) {
            addEtiqueta(nmEt);
        }
    }

    public ArrayList<String> getEtiquetas() {
        ArrayList<String> names = new ArrayList<>();
        for (Etiqueta et : listaEtiquetas) {
            names.add(et.getEtiqueta());
        }
        return names;
    }

    public void addComponets() {
        contenedor.removeAll();
        for (Etiqueta et : listaEtiquetas) {
            et.btnQuitar.setVisible(visibleQuit);
            contenedor.add(et);
        }
        contenedor.repaint();
        contenedor.revalidate();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new COMPONET.ScrollPaneWin11();
        contenedor = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 51, 51));
        setShadowColor(new java.awt.Color(0, 0, 0));

        jScrollPane1.setBorder(null);

        contenedor.setBackground(new java.awt.Color(0, 51, 51));
        contenedor.setLayout(new javax.swing.BoxLayout(contenedor, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(contenedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public ArrayList<Etiqueta> getListaEtiquetas() {
        return listaEtiquetas;
    }

    public void setListaEtiquetas(ArrayList<Etiqueta> listaEtiquetas) {
        this.listaEtiquetas = listaEtiquetas;
    }

    public boolean isVisibleQuit() {
        return visibleQuit;
    }

    public void setVisibleQuit(boolean visibleQuit) {
        this.visibleQuit = visibleQuit;
        addComponets();
    }
}
