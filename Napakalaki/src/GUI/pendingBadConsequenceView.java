/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import napakalaki.BadConsequence;

/**
 *
 *
 */
public class pendingBadConsequenceView extends javax.swing.JPanel {
    private BadConsequence badModel;
    /**
     * Creates new form pendingBadConsequenceView
     */
    public pendingBadConsequenceView() {
        initComponents();
    }

    public void setpendingBadConsequence(BadConsequence bad){
        specificHiddenTreasures.setText(bad.getSpecificHiddenTreasures().toString());
        specificVisibleTreasures.setText(bad.getSpecificVisibleTreasures().toString());
        repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        specificVisibleLabel = new javax.swing.JLabel();
        specificVisibleTreasures = new javax.swing.JTextField();
        specificHiddenLabel = new javax.swing.JLabel();
        specificHiddenTreasures = new javax.swing.JTextField();

        specificVisibleLabel.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        specificVisibleLabel.setText("Tipos de Tesoros Visibles");
        specificVisibleLabel.setToolTipText("");

        specificVisibleTreasures.setEditable(false);
        specificVisibleTreasures.setText("specificVisibleTreasures");

        specificHiddenLabel.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        specificHiddenLabel.setText("Tipos de Tesoros Ocultos");
        specificHiddenLabel.setToolTipText("");

        specificHiddenTreasures.setEditable(false);
        specificHiddenTreasures.setText("specificHiddenTreasures");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(specificVisibleLabel)
                            .addComponent(specificHiddenLabel))
                        .addGap(210, 210, 210))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(specificHiddenTreasures, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(specificVisibleTreasures, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(specificVisibleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(specificVisibleTreasures, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(specificHiddenLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(specificHiddenTreasures, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel specificHiddenLabel;
    private javax.swing.JTextField specificHiddenTreasures;
    private javax.swing.JLabel specificVisibleLabel;
    private javax.swing.JTextField specificVisibleTreasures;
    // End of variables declaration//GEN-END:variables
}