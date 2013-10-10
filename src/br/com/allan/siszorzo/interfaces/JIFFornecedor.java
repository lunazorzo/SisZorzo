/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.allan.siszorzo.interfaces;

import br.com.allan.siszorzo.classes.Cad_Estado_TO;
import br.com.allan.siszorzo.classes.Cad_Fornecedor_TO;
import br.com.allan.siszorzo.dao.Cad_Cliente_DAO;
import br.com.allan.siszorzo.dao.Cad_Estado_DAO;
import br.com.allan.siszorzo.dao.Cad_Fornecedor_DAO;
import br.com.allan.siszorzo.grades.Tabela_Busca_Cliente;
import br.com.allan.siszorzo.grades.Tabela_Busca_Fornecedor;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Allan
 */
public class JIFFornecedor extends javax.swing.JInternalFrame {

    private Cad_Fornecedor_TO cad_fornecedor;
    Tabela_Busca_Fornecedor ga;

    public JIFFornecedor() throws Exception {
        initComponents();
        ga = new Tabela_Busca_Fornecedor();
        GradeBuscaCliente.setModel(ga);
        BuscaForncedor.setLocation(400, 207);//seta a localização da tela
        BuscaForncedor.setMinimumSize(new Dimension(850, 500));//seta a dimensão/tamanho da tela
        BuscaForncedor.setResizable(false);//desabilita a opção de maximizar
        carregaCombo();
        carregaTabelaClientes();
    }

    public void carregaTabelaClientes() {
        try {
            List l = Cad_Fornecedor_DAO.getInstance().buscar(JTFNomeRazao.getText());  // passa a consulta feita pelo DAO       
            ga.setDados(l);
            GradeBuscaCliente.updateUI();
        } catch (Throwable t) {
            JOptionPane.showMessageDialog(this, "Erro ao Buscar Fornecedor!");
        }
    }

    public void carregaCombo() throws Exception {
        JCBEstado.removeAllItems();//removendo tds os itens da combo
        JCBEstado.addItem(null);
        //fazendo uma busca no banco para trazer na combo e listando a classe na qual foi criado a janela anterior
        ArrayList<Cad_Estado_TO> l = Cad_Estado_DAO.getInstance().buscar(); //tem q ta = o nome da classe criada
        for (Cad_Estado_TO tipo : l) {
            JCBEstado.addItem(tipo);
        }
    }

    public void limparDados() {
        JCBEstado.setSelectedItem(null);
        jtfCidade.setText("");
        JTFInscricaoEstadual.setText("");
        JTFNomeRazao.setText("");
        JTFCPFCNPJ.setText("");
        JTFInscricaoEstadual.setText("");
        JTFEmail.setText("");
        JTFEndereco.setText("");
        JTFBairroDistrito.setText("");
        JTFNumero.setText("");
        JFTLCEP.setText("");
        jtfCidade.setText("");
        JDCDataCadastro.setDate(null);
        JFTLTelefone.setText("");
        JFTLCelular1.setText("");
        JFTLCelular2.setText("");
        JTAObervacao.setText("");
        JTFNomeRazao.requestFocus(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuscaForncedor = new javax.swing.JFrame();
        JBBuscaCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        GradeBuscaCliente = new javax.swing.JTable();
        JLNomeRazao = new javax.swing.JLabel();
        JLCPFCNPJ = new javax.swing.JLabel();
        JTFCPFCNPJ = new javax.swing.JTextField();
        JLEMAIL = new javax.swing.JLabel();
        JTFEmail = new javax.swing.JTextField();
        JBIncricaoEstadual = new javax.swing.JLabel();
        JTFInscricaoEstadual = new javax.swing.JTextField();
        JTFNomeRazao = new javax.swing.JTextField();
        JLNumero = new javax.swing.JLabel();
        JLBairroDistrito = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAObervacao = new javax.swing.JEditorPane();
        JFTLCelular2 = new javax.swing.JFormattedTextField();
        JLEndereco = new javax.swing.JLabel();
        JLObservacao = new javax.swing.JLabel();
        JTFEndereco = new javax.swing.JTextField();
        JDCDataCadastro = new com.toedter.calendar.JDateChooser();
        JLCEP = new javax.swing.JLabel();
        JTFNumero = new javax.swing.JTextField();
        JFTLCEP = new javax.swing.JFormattedTextField();
        JLEstado = new javax.swing.JLabel();
        JCBEstado = new javax.swing.JComboBox();
        JLCidade = new javax.swing.JLabel();
        jtfCidade = new javax.swing.JTextField();
        JLDataCadastro = new javax.swing.JLabel();
        JLTelefone = new javax.swing.JLabel();
        JFTLTelefone = new javax.swing.JFormattedTextField();
        JLCelular1 = new javax.swing.JLabel();
        JLCelular2 = new javax.swing.JLabel();
        JFTLCelular1 = new javax.swing.JFormattedTextField();
        jbGravar = new javax.swing.JButton();
        JTFBairroDistrito = new javax.swing.JTextField();

        BuscaForncedor.setTitle("Busca de Cliente");

        JBBuscaCliente.setText("Selecionar o Cliente Desejado");
        JBBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscaClienteActionPerformed(evt);
            }
        });

        GradeBuscaCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(GradeBuscaCliente);

        javax.swing.GroupLayout BuscaForncedorLayout = new javax.swing.GroupLayout(BuscaForncedor.getContentPane());
        BuscaForncedor.getContentPane().setLayout(BuscaForncedorLayout);
        BuscaForncedorLayout.setHorizontalGroup(
            BuscaForncedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscaForncedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BuscaForncedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscaForncedorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBBuscaCliente)))
                .addContainerGap())
        );
        BuscaForncedorLayout.setVerticalGroup(
            BuscaForncedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscaForncedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBBuscaCliente)
                .addContainerGap())
        );

        setClosable(true);
        setTitle("Cadastro Fornecedor");

        JLNomeRazao.setText("Fantasia:");

        JLCPFCNPJ.setText("CNPJ:");

        JLEMAIL.setText("E-mail:");

        JBIncricaoEstadual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JBIncricaoEstadual.setText("Inscrição Estadual:");

        JTFNomeRazao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFNomeRazaoKeyPressed(evt);
            }
        });

        JLNumero.setText("Número:");

        JLBairroDistrito.setText("Bairro:");

        jScrollPane1.setViewportView(JTAObervacao);

        try {
            JFTLCelular2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        JLEndereco.setText("Endereço:");

        JLObservacao.setText("Observação:");

        JLCEP.setText("CEP:");

        try {
            JFTLCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        JLEstado.setText("Estado:");

        JLCidade.setText("Cidade:");

        JLDataCadastro.setText("Data do Cadastro:");

        JLTelefone.setText("Telefone:");

        try {
            JFTLTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        JLCelular1.setText("Celular:");

        JLCelular2.setText("Celular:");

        try {
            JFTLCelular1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jbGravar.setText("Gravar");
        jbGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jbGravar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLObservacao)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JFTLTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLCelular1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JFTLCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JLCelular2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JFTLCelular2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(JLCPFCNPJ)
                                    .addGap(26, 26, 26)
                                    .addComponent(JTFCPFCNPJ)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(JBIncricaoEstadual)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JTFInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(JLNomeRazao)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JTFNomeRazao, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(JLCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLDataCadastro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JDCDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLEMAIL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFEmail))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JLEndereco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JLBairroDistrito)
                                        .addGap(24, 24, 24)
                                        .addComponent(JTFBairroDistrito)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLNumero)
                                    .addComponent(JLCEP))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JFTLCEP)
                                    .addComponent(JTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLNomeRazao)
                    .addComponent(JTFNomeRazao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFCPFCNPJ)
                    .addComponent(JLCPFCNPJ)
                    .addComponent(JBIncricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEndereco)
                    .addComponent(JTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLNumero)
                    .addComponent(JTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBairroDistrito)
                    .addComponent(JLCEP)
                    .addComponent(JFTLCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFBairroDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLEstado)
                        .addComponent(JCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLCidade)
                        .addComponent(JLDataCadastro)
                        .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JDCDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEMAIL)
                    .addComponent(JTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLTelefone)
                    .addComponent(JFTLTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLCelular1)
                    .addComponent(JFTLCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLCelular2)
                    .addComponent(JFTLCelular2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLObservacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbGravar)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarActionPerformed
        try {
            if (cad_fornecedor == null) {
                Cad_Fornecedor_TO t = new Cad_Fornecedor_TO();//criando o objeto e grava nele
                t.setTxt_nomerazaosocial(JTFNomeRazao.getText());
                t.setNum_cpfcnpj(JTFCPFCNPJ.getText());
                t.setNum_inscricaoestatudal(JTFInscricaoEstadual.getText());
                t.setTxt_email(JTFEmail.getText());
                t.setTxt_endereco(JTFEndereco.getText());
                t.setTxt_bairrodistrito(JTFBairroDistrito.getText());
                t.setNum_numero(JTFNumero.getText());
                t.setNum_cep(JFTLCEP.getText());
                t.setCad_estado((Cad_Estado_TO) JCBEstado.getSelectedItem());
                t.setTxt_cidade(jtfCidade.getText());
                t.setDt_datacadastro(JDCDataCadastro.getDate());
                t.setNum_telefone(JFTLTelefone.getText());
                t.setNum_celular1(JFTLCelular1.getText());
                t.setNum_celular2(JFTLCelular2.getText());
                t.setTxt_observacao(JTAObervacao.getText());
                Cad_Fornecedor_DAO.incluir(t);
                JOptionPane.showMessageDialog(this, "Cadastro realizado com Sucesso!");
            } else {
                cad_fornecedor.setTxt_nomerazaosocial(JTFNomeRazao.getText());
                cad_fornecedor.setNum_cpfcnpj(JTFCPFCNPJ.getText());
                cad_fornecedor.setNum_inscricaoestatudal(JTFInscricaoEstadual.getText());
                cad_fornecedor.setTxt_email(JTFEmail.getText());
                cad_fornecedor.setTxt_endereco(JTFEndereco.getText());
                cad_fornecedor.setTxt_bairrodistrito(JTFBairroDistrito.getText());
                cad_fornecedor.setNum_numero(JTFNumero.getText());
                cad_fornecedor.setNum_cep(JFTLCEP.getText());
                cad_fornecedor.setCad_estado((Cad_Estado_TO) JCBEstado.getSelectedItem());
                cad_fornecedor.setTxt_cidade(jtfCidade.getText());
                cad_fornecedor.setDt_datacadastro(JDCDataCadastro.getDate());
                cad_fornecedor.setNum_telefone(JFTLTelefone.getText());
                cad_fornecedor.setNum_celular1(JFTLCelular1.getText());
                cad_fornecedor.setNum_celular2(JFTLCelular2.getText());
                cad_fornecedor.setTxt_observacao(JTAObervacao.getText());
                Cad_Fornecedor_DAO.alterar(cad_fornecedor);
                JOptionPane.showMessageDialog(this, "Cadastro alterado com Sucesso!");
            }
            carregaCombo();
            limparDados();
        } catch (Throwable t) {
            JOptionPane.showMessageDialog(this, "Erro ao Cadastrar ou alterar os dados!");
            t.getMessage();
        }
    }//GEN-LAST:event_jbGravarActionPerformed

    private void JBBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscaClienteActionPerformed
        try {
            //pegando a opção selecionada na grade
            cad_fornecedor = (Cad_Fornecedor_TO) ga.getDadoAt(GradeBuscaCliente.getSelectedRow());
            if (cad_fornecedor != null) {
                JTFNomeRazao.setText(cad_fornecedor.getTxt_nomerazaosocial());
                JTFCPFCNPJ.setText(cad_fornecedor.getNum_cpfcnpj());
                JTFInscricaoEstadual.setText(cad_fornecedor.getNum_inscricaoestatudal());
                JTFEmail.setText(cad_fornecedor.getTxt_email());
                JTFEndereco.setText(cad_fornecedor.getTxt_endereco());
                JTFBairroDistrito.setText(cad_fornecedor.getTxt_bairrodistrito());
                JTFNumero.setText(cad_fornecedor.getNum_numero());
                JFTLCEP.setText(cad_fornecedor.getNum_cep());

                for (int i = 1; i < JCBEstado.getItemCount(); i++) {
                    if (((Cad_Estado_TO) JCBEstado.getItemAt(i)).getId_cod_estado() == cad_fornecedor.getCad_estado().getId_cod_estado()) {
                        JCBEstado.setSelectedIndex(i);
                        break;
                    }
                }
                jtfCidade.setText(cad_fornecedor.getTxt_cidade());
                JDCDataCadastro.setDate(cad_fornecedor.getDt_datacadastro());
                JFTLTelefone.setText(cad_fornecedor.getNum_telefone());
                JFTLCelular1.setText(cad_fornecedor.getNum_celular1());
                JFTLCelular2.setText(cad_fornecedor.getNum_celular2());
                JTAObervacao.setText(cad_fornecedor.getTxt_observacao());
                BuscaForncedor.dispose();
            }
        } catch (Throwable t) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar lista de Clientes!");
            limparDados();
            t.printStackTrace();
        }
    }//GEN-LAST:event_JBBuscaClienteActionPerformed

    private void JTFNomeRazaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFNomeRazaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //   carregaTabelaClientes();
            BuscaForncedor.show();
        }
    }//GEN-LAST:event_JTFNomeRazaoKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame BuscaForncedor;
    private javax.swing.JTable GradeBuscaCliente;
    private javax.swing.JButton JBBuscaCliente;
    private javax.swing.JLabel JBIncricaoEstadual;
    private javax.swing.JComboBox JCBEstado;
    private com.toedter.calendar.JDateChooser JDCDataCadastro;
    private javax.swing.JFormattedTextField JFTLCEP;
    private javax.swing.JFormattedTextField JFTLCelular1;
    private javax.swing.JFormattedTextField JFTLCelular2;
    private javax.swing.JFormattedTextField JFTLTelefone;
    private javax.swing.JLabel JLBairroDistrito;
    private javax.swing.JLabel JLCEP;
    private javax.swing.JLabel JLCPFCNPJ;
    private javax.swing.JLabel JLCelular1;
    private javax.swing.JLabel JLCelular2;
    private javax.swing.JLabel JLCidade;
    private javax.swing.JLabel JLDataCadastro;
    private javax.swing.JLabel JLEMAIL;
    private javax.swing.JLabel JLEndereco;
    private javax.swing.JLabel JLEstado;
    private javax.swing.JLabel JLNomeRazao;
    private javax.swing.JLabel JLNumero;
    private javax.swing.JLabel JLObservacao;
    private javax.swing.JLabel JLTelefone;
    private javax.swing.JEditorPane JTAObervacao;
    private javax.swing.JTextField JTFBairroDistrito;
    private javax.swing.JTextField JTFCPFCNPJ;
    private javax.swing.JTextField JTFEmail;
    private javax.swing.JTextField JTFEndereco;
    private javax.swing.JTextField JTFInscricaoEstadual;
    private javax.swing.JTextField JTFNomeRazao;
    private javax.swing.JTextField JTFNumero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbGravar;
    private javax.swing.JTextField jtfCidade;
    // End of variables declaration//GEN-END:variables
}
