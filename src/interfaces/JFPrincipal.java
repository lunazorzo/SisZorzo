/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import classes.ClasseImagem;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;

/**
 *
 * @author Allan
 */
public class JFPrincipal extends javax.swing.JFrame {

    private int resposta;
    JIFCadastroCliente cliente;
    JIFCadastroFornecedor fornecedor;
    JIFCadastroProduto produto;
    JIFDuplicata duplicata;
    JIFAjuda ajuda;

    public JFPrincipal() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
        }
        URL url = this.getClass().getResource("/imagens/Trator.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        JDesktop = new ClasseImagem("/br/com/allan/siszorzo/imagens/Brazil_Flag.jpg");
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        CadCliente = new javax.swing.JMenuItem();
        CadFornecedor = new javax.swing.JMenuItem();
        CadProduto = new javax.swing.JMenuItem();
        jmRelatorios = new javax.swing.JMenu();
        RelDuplicata = new javax.swing.JMenuItem();
        jmSuporte = new javax.swing.JMenu();
        SupAjuda = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Zorzo Insumos Agricolas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jmCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cadastro.png"))); // NOI18N
        jmCadastro.setText("Cadastro");

        CadCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        CadCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cliente2.png"))); // NOI18N
        CadCliente.setText("Cliente");
        CadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadClienteActionPerformed(evt);
            }
        });
        jmCadastro.add(CadCliente);

        CadFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        CadFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fornecedor.png"))); // NOI18N
        CadFornecedor.setText("Fornecedor");
        CadFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadFornecedorActionPerformed(evt);
            }
        });
        jmCadastro.add(CadFornecedor);

        CadProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        CadProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Produto.png"))); // NOI18N
        CadProduto.setText("Produto");
        CadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadProdutoActionPerformed(evt);
            }
        });
        jmCadastro.add(CadProduto);

        jMenuBar1.add(jmCadastro);

        jmRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Relatorios.png"))); // NOI18N
        jmRelatorios.setText("Relatórios");

        RelDuplicata.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        RelDuplicata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Duplicata_1.png"))); // NOI18N
        RelDuplicata.setText("Duplicata");
        RelDuplicata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelDuplicataActionPerformed(evt);
            }
        });
        jmRelatorios.add(RelDuplicata);

        jMenuBar1.add(jmRelatorios);

        jmSuporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Suporte.png"))); // NOI18N
        jmSuporte.setText("Suporte");

        SupAjuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        SupAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Ajuda.png"))); // NOI18N
        SupAjuda.setText("Ajuda");
        SupAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupAjudaActionPerformed(evt);
            }
        });
        jmSuporte.add(SupAjuda);

        jMenuBar1.add(jmSuporte);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Object[] botoes = {"Sim", "Não"};//tipo de formato dos botões
        //quando abrir a janela de sair é a msg que vai ser mostrada
        resposta = JOptionPane.showOptionDialog(null, "Confirma Encerramento do Sistema?", "ATENÇÃO",
                JOptionPane.YES_NO_OPTION,//Tipo usado para confirmar o questionamento
                JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);//questionamento da msg
        if (resposta == JOptionPane.YES_OPTION) {//valor de retorno de método de classe
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void RelDuplicataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelDuplicataActionPerformed

        try {
            if (evt.getSource() == RelDuplicata) {
                if (duplicata == null) {
                    duplicata = new JIFDuplicata();
                    JDesktop.add(duplicata);
                    duplicata.setVisible(true);
                    duplicata.setPosicao();//Seta centralizado
                }
                JDesktop.moveToFront(duplicata);
            }
            if (duplicata.isClosed()) {
                duplicata = new JIFDuplicata();
                JDesktop.add(duplicata);
                duplicata.setVisible(true);
                duplicata.setPosicao();//Seta centralizado
                JDesktop.moveToFront(duplicata);
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_RelDuplicataActionPerformed

    private void CadFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadFornecedorActionPerformed
        //Não deixa com que abra duas Frame
        //http://www.guj.com.br/588-jinternalframe-cliente-abrir-somente-um-e-quando-fechar-e-abrir-novamente-abrir-um-novo
        try {
            if (evt.getSource() == CadFornecedor) {
                if (fornecedor == null) {
                    fornecedor = new JIFCadastroFornecedor();
                    JDesktop.add(fornecedor);
                    fornecedor.setVisible(true);
                    fornecedor.setPosicao();//Seta centralizado
                }
                JDesktop.moveToFront(fornecedor);
            }
            if (fornecedor.isClosed()) {
                fornecedor = new JIFCadastroFornecedor();
                JDesktop.add(fornecedor);
                fornecedor.setVisible(true);
                fornecedor.setPosicao();//Seta centralizado
                JDesktop.moveToFront(fornecedor);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_CadFornecedorActionPerformed

    private void CadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadClienteActionPerformed
        try {
            if (evt.getSource() == CadCliente) {
                if (cliente == null) {
                    cliente = new JIFCadastroCliente();
                    JDesktop.add(cliente);
                    cliente.setVisible(true);
                    cliente.setPosicao();//Seta centralizado
                }
                JDesktop.moveToFront(cliente);
            }
            if (cliente.isClosed()) {
                cliente = new JIFCadastroCliente();
                JDesktop.add(cliente);
                cliente.setVisible(true);
                cliente.setPosicao();//Seta centralizado
                JDesktop.moveToFront(cliente);
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_CadClienteActionPerformed

    private void SupAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupAjudaActionPerformed
        //
        try {
            if (evt.getSource() == SupAjuda) {
                if (ajuda == null) {
                    ajuda = new JIFAjuda();
                    JDesktop.add(ajuda);
                    ajuda.setVisible(true);
                    ajuda.setPosicao();//Seta centralizado
                }
                JDesktop.moveToFront(ajuda);
            }
            if (ajuda.isClosed()) {
                ajuda = new JIFAjuda();
                JDesktop.add(ajuda);
                ajuda.setVisible(true);
                ajuda.setPosicao();//Seta centralizado
                JDesktop.moveToFront(ajuda);
            }
        } catch (Exception e) {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_SupAjudaActionPerformed

    private void CadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadProdutoActionPerformed
        // JIFCadastroProduto produto;
        try {
            if (evt.getSource() == CadProduto) {
                if (produto == null) {
                    produto = new JIFCadastroProduto();
                    JDesktop.add(produto);
                    produto.setVisible(true);
                    produto.setPosicao();//Seta centralizado
                }
                JDesktop.moveToFront(produto);
            }
            if (produto.isClosed()) {
                produto = new JIFCadastroProduto();
                JDesktop.add(produto);
                produto.setVisible(true);
                produto.setPosicao();//Seta centralizado
                JDesktop.moveToFront(produto);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_CadProdutoActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadCliente;
    private javax.swing.JMenuItem CadFornecedor;
    private javax.swing.JMenuItem CadProduto;
    private javax.swing.JDesktopPane JDesktop;
    private javax.swing.JMenuItem RelDuplicata;
    private javax.swing.JMenuItem SupAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmRelatorios;
    private javax.swing.JMenu jmSuporte;
    // End of variables declaration//GEN-END:variables

    private JDesktopPane getTelaDesktop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
