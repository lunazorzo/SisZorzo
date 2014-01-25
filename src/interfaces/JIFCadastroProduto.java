/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.Cad_Cliente_TO;
import classes.Cad_Estado_TO;
import classes.Cad_Fornecedor_TO;
import classes.Cad_Produto_TO;
import classes.Cad_Unidade_Medida_TO;
import classes.UpperCaseField;
import dao.Cad_Fornecedor_DAO;
import dao.Cad_Produto_DAO;
import dao.Cad_Unidade_Medida_DAO;
import grades.Grade_Busca_Produto;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Allan
 */
public final class JIFCadastroProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFProduto
     */
    private Cad_Produto_TO cad_produto;
    Grade_Busca_Produto gradeproduto;

    public JIFCadastroProduto() throws Exception {
        initComponents();
        gradeproduto = new Grade_Busca_Produto();
        GradeBuscaProduto.setModel(gradeproduto);


        carregaComboUnidadeMedidade();
        carregaComboFornecedor();

        BuscaProduto.setMinimumSize(new Dimension(850, 500));//seta a dimensão/tamanho da tela
        BuscaProduto.setUndecorated(true); //desabilita a barra de Título 
        BuscaProduto.setLocationRelativeTo(null);//Seta o Frame centralizado
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    private void limparDados() {
        JCBUnidadeMedida.setSelectedItem(null);
        JCBFornecedor.setSelectedItem(null);
        JTFNome.setText("");
        JTFNCM.setText("");
        JTFValorCompra.setText("");
        JTFValorVenda.setText("");
        JEPObservacao.setText("");
    }

    public void carregaTabelaProduto() {
        try {
            List l = Cad_Produto_DAO.getInstance().buscar(JTFNome.getText());  // passa a consulta feita pelo DAO       
            gradeproduto.setDados(l);
            GradeBuscaProduto.updateUI();
        } catch (Exception ex) {
            System.out.println(ex);//Mostra a mensagem real do erro
            JOptionPane.showMessageDialog(this, "Erro ao Buscar Produto!");
        }
    }

    private void carregaComboUnidadeMedidade() throws Exception {
        JCBUnidadeMedida.removeAllItems();//removendo tds os itens da combo
        JCBUnidadeMedida.addItem(null);
        //fazendo uma busca no banco para trazer na combo e listando a classe na qual foi criado a janela anterior
        ArrayList<Cad_Unidade_Medida_TO> l = Cad_Unidade_Medida_DAO.getInstance().buscarUnidadeNumerica(); //tem q ta = o nome da classe criada
        for (Cad_Unidade_Medida_TO tipo : l) {
            JCBUnidadeMedida.addItem(tipo);
        }

    }

    private void carregaComboFornecedor() throws Exception {
        JCBFornecedor.removeAllItems();//removendo tds os itens da combo
        JCBFornecedor.addItem(null);
        //fazendo uma busca no banco para trazer na combo e listando a classe na qual foi criado a janela anterior
        ArrayList<Cad_Fornecedor_TO> l = Cad_Fornecedor_DAO.getInstance().buscarFornecedor(); //tem q ta = o nome da classe criada
        for (Cad_Fornecedor_TO tipo : l) {
            JCBFornecedor.addItem(tipo);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuscaProduto = new javax.swing.JFrame();
        JBBuscaProduto = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        GradeBuscaProduto = new javax.swing.JTable();
        JBFechar = new javax.swing.JButton();
        JLNome = new javax.swing.JLabel();
        JTFNome = new UpperCaseField();
        JLFornecedor = new javax.swing.JLabel();
        JCBFornecedor = new javax.swing.JComboBox();
        JLUnidadeMedida = new javax.swing.JLabel();
        JCBUnidadeMedida = new javax.swing.JComboBox();
        JLValorCompra = new javax.swing.JLabel();
        JTFValorCompra = new UpperCaseField();
        JLBValorVenda = new javax.swing.JLabel();
        JTFValorVenda = new UpperCaseField();
        JLObservacao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JEPObservacao = new javax.swing.JEditorPane();
        JBGravar = new javax.swing.JButton();
        JLNCM = new javax.swing.JLabel();
        JTFNCM = new UpperCaseField();

        BuscaProduto.setTitle("Busca de Cliente");

        JBBuscaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Selecinar.png"))); // NOI18N
        JBBuscaProduto.setToolTipText("Selecionar");
        JBBuscaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscaProdutoActionPerformed(evt);
            }
        });

        GradeBuscaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(GradeBuscaProduto);

        JBFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fechar.png"))); // NOI18N
        JBFechar.setToolTipText("Fechar");
        JBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BuscaProdutoLayout = new javax.swing.GroupLayout(BuscaProduto.getContentPane());
        BuscaProduto.getContentPane().setLayout(BuscaProdutoLayout);
        BuscaProdutoLayout.setHorizontalGroup(
            BuscaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscaProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BuscaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscaProdutoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBBuscaProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBFechar)))
                .addContainerGap())
        );
        BuscaProdutoLayout.setVerticalGroup(
            BuscaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscaProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BuscaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBBuscaProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBFechar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setClosable(true);
        setTitle("Cadastro de Produto");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Produto.png"))); // NOI18N

        JLNome.setText("Descrição do Produto:");

        JTFNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFNomeKeyPressed(evt);
            }
        });

        JLFornecedor.setText("Fornecedor:");

        JCBFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JLUnidadeMedida.setText("Unidade de Medida:");

        JCBUnidadeMedida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JLValorCompra.setText("Valor de Compra R$:");

        JLBValorVenda.setText("Valor de Venda R$:");

        JLObservacao.setText("Observação:");

        jScrollPane2.setViewportView(JEPObservacao);

        JBGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Salvar.png"))); // NOI18N
        JBGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGravarActionPerformed(evt);
            }
        });

        JLNCM.setText("NCM:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JLNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBGravar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLObservacao)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLValorCompra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLBValorVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLNCM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFNCM, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCBFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLUnidadeMedida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCBUnidadeMedida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLNome)
                    .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLFornecedor)
                    .addComponent(JCBFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLUnidadeMedida)
                    .addComponent(JCBUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLValorCompra)
                    .addComponent(JTFValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLBValorVenda)
                    .addComponent(JTFValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLNCM)
                    .addComponent(JTFNCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLObservacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBGravar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGravarActionPerformed
        try {
            if (cad_produto == null) {
                Cad_Produto_TO t = new Cad_Produto_TO();//criando o objeto e grava nele
                t.setTxt_produto(JTFNome.getText());
                t.setCad_fornecedor((Cad_Fornecedor_TO) JCBFornecedor.getSelectedItem());
                t.setCad_unidade_medida((Cad_Unidade_Medida_TO) JCBUnidadeMedida.getSelectedItem());
                t.setNCM(JTFNCM.getText());
                t.setValor_compra(JTFValorCompra.getText());
                t.setValor_venda(JTFValorVenda.getText());
                t.setObservacao(JEPObservacao.getText());
                Cad_Produto_DAO.incluir(t);//passando o objeto criado
                JOptionPane.showMessageDialog(this, "Cadastro realizado com Sucesso!");
            } else {
                cad_produto.setTxt_produto(JTFNome.getText());
                cad_produto.setCad_fornecedor((Cad_Fornecedor_TO) JCBFornecedor.getSelectedItem());
                cad_produto.setCad_unidade_medida((Cad_Unidade_Medida_TO) JCBUnidadeMedida.getSelectedItem());
                cad_produto.setNCM(JTFNCM.getText());
                cad_produto.setValor_compra(JTFValorCompra.getText());
                cad_produto.setValor_venda(JTFValorVenda.getText());
                cad_produto.setObservacao(JEPObservacao.getText());
                Cad_Produto_DAO.alterar(cad_produto);//passando o objeto criado
                JOptionPane.showMessageDialog(this, "Cadastro alterado com Sucesso!");
            }
            carregaComboUnidadeMedidade();
            limparDados();
        } catch (Throwable t) {
            //msg quando existir duplicidade nas informações ja registradas
            t.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao Cadastrar ou alterar os dados!");
            t.getMessage();
        }
    }//GEN-LAST:event_JBGravarActionPerformed

    private void JTFNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            carregaTabelaProduto();
            BuscaProduto.show();
        }
    }//GEN-LAST:event_JTFNomeKeyPressed

    private void JBBuscaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscaProdutoActionPerformed
        try {
            //pegando a opção selecionada na grade
            cad_produto = (Cad_Produto_TO) gradeproduto.getDadoAt(GradeBuscaProduto.getSelectedRow());
            if (cad_produto != null) {
                JTFNome.setText(cad_produto.getTxt_produto());
                JTFNCM.setText(cad_produto.getNCM());
                JTFValorCompra.setText(cad_produto.getValor_compra());
                JTFValorVenda.setText(cad_produto.getValor_venda());
                JEPObservacao.setText(cad_produto.getObservacao());
                for (int i = 1; i < JCBFornecedor.getItemCount(); i++) {
                    if (((Cad_Fornecedor_TO) JCBFornecedor.getItemAt(i)).getId_cod_cliente() == cad_produto.getCad_fornecedor().getId_cod_cliente()) {
                        JCBFornecedor.setSelectedIndex(i);
                        break;
                    }

                }
                for (int i = 1; i < JCBUnidadeMedida.getItemCount(); i++) {
                    if (((Cad_Unidade_Medida_TO) JCBUnidadeMedida.getItemAt(i)).getId_cod_unidade_medida() == cad_produto.getCad_unidade_medida().getId_cod_unidade_medida()) {
                        JCBUnidadeMedida.setSelectedIndex(i);
                        break;
                    }
                }
                BuscaProduto.dispose();
            }
        } catch (Throwable t) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar lista de Produtos!");
            limparDados();
            t.printStackTrace();
        }
    }//GEN-LAST:event_JBBuscaProdutoActionPerformed

    private void JBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFecharActionPerformed
        BuscaProduto.dispose();
        limparDados();
    }//GEN-LAST:event_JBFecharActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame BuscaProduto;
    private javax.swing.JTable GradeBuscaProduto;
    private javax.swing.JButton JBBuscaProduto;
    private javax.swing.JButton JBFechar;
    private javax.swing.JButton JBGravar;
    private javax.swing.JComboBox JCBFornecedor;
    private javax.swing.JComboBox JCBUnidadeMedida;
    private javax.swing.JEditorPane JEPObservacao;
    private javax.swing.JLabel JLBValorVenda;
    private javax.swing.JLabel JLFornecedor;
    private javax.swing.JLabel JLNCM;
    private javax.swing.JLabel JLNome;
    private javax.swing.JLabel JLObservacao;
    private javax.swing.JLabel JLUnidadeMedida;
    private javax.swing.JLabel JLValorCompra;
    private javax.swing.JTextField JTFNCM;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFValorCompra;
    private javax.swing.JTextField JTFValorVenda;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
