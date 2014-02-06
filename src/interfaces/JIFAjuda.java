/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Dimension;

/**
 *
 * @author Allan
 */
public class JIFAjuda extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFAjuda
     */
    public JIFAjuda() {
        initComponents();
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        F2 = new javax.swing.JLabel();
        F3 = new javax.swing.JLabel();
        F9 = new javax.swing.JLabel();
        F10 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Ajuda");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Ajuda.png"))); // NOI18N

        F2.setText("F2 - Cadastro de Clientes");

        F3.setText("F3 - Cadastro de Fornecedores");

        F9.setText("F4 - Cadastro de Produtos");

        F10.setText("F9 - Impressão de Duplicatas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(F3)
                    .addComponent(F2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(F9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(F10, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(F2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(F3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(F9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(F10)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        setBounds(0, 0, 249, 163);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel F10;
    private javax.swing.JLabel F2;
    private javax.swing.JLabel F3;
    private javax.swing.JLabel F9;
    // End of variables declaration//GEN-END:variables
      
}
