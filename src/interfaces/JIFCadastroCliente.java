/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.Cad_Cliente_TO;
import classes.Cad_Estado_TO;
import classes.UpperCaseField;
import dao.Cad_Cliente_DAO;
import dao.Cad_Estado_DAO;
import grades.Tabela_Busca_Cliente;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Allan
 */
public final class JIFCadastroCliente extends javax.swing.JInternalFrame {

    private Cad_Cliente_TO cad_cliente;
    Tabela_Busca_Cliente ga;

    public JIFCadastroCliente() throws Exception {
        initComponents();
        ga = new Tabela_Busca_Cliente();
        GradeBuscaCliente.setModel(ga);
        BuscaCliente.setMinimumSize(new Dimension(850, 520));//seta a dimensão/tamanho da tela
        BuscaCliente.setLocationRelativeTo(null);//Seta o Frame centralizado
        carregaCombo();
        dataHohe();
    }

    JIFCadastroCliente(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuscaCliente = new javax.swing.JFrame();
        JBBuscaCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        GradeBuscaCliente = new javax.swing.JTable();
        JBFechar = new javax.swing.JButton();
        JLNomeRazao = new javax.swing.JLabel();
        JTFNomeRazao = new UpperCaseField(); ;
        JLCPFCNPJ = new javax.swing.JLabel();
        JTFCPFCNPJ = new UpperCaseField(); ;
        JBCNPJCPF = new javax.swing.JButton();
        JBIncricaoEstadual = new javax.swing.JLabel();
        JTFInscricaoEstadual = new UpperCaseField(); ;
        JLCADPRO = new javax.swing.JLabel();
        JTFCADPRO = new UpperCaseField(); ;
        JBSintegra = new javax.swing.JButton();
        JLEMAIL = new javax.swing.JLabel();
        JTFEmail = new UpperCaseField(); ;
        JLEndereco = new javax.swing.JLabel();
        JTFEndereco = new UpperCaseField(); ;
        JLBairroDistrito = new javax.swing.JLabel();
        JTFBairroDistrito = new UpperCaseField(); ;
        JLNumero = new javax.swing.JLabel();
        JTFNumero = new UpperCaseField(); ;
        JLCEP = new javax.swing.JLabel();
        JFTLCEP = new javax.swing.JFormattedTextField();
        JLEstado = new javax.swing.JLabel();
        JCBEstado = new javax.swing.JComboBox();
        JLCidade = new javax.swing.JLabel();
        jtfCidade = new UpperCaseField(); ;
        JLDataCadastro = new javax.swing.JLabel();
        JLTelefone = new javax.swing.JLabel();
        JFTLTelefone = new javax.swing.JFormattedTextField();
        JLCelular1 = new javax.swing.JLabel();
        JFTLCelular1 = new javax.swing.JFormattedTextField();
        JLCelular2 = new javax.swing.JLabel();
        JFTLCelular2 = new javax.swing.JFormattedTextField();
        JLObservacao = new javax.swing.JLabel();
        JBGravar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAObervacao = new javax.swing.JEditorPane();
        JDCDataCadastro = new com.toedter.calendar.JDateChooser();

        BuscaCliente.setTitle("Busca de Cliente");
        BuscaCliente.setUndecorated(true);

        JBBuscaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Selecinar.png"))); // NOI18N
        JBBuscaCliente.setToolTipText("Selecionar");
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

        JBFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fechar.png"))); // NOI18N
        JBFechar.setToolTipText("Selecionar");
        JBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BuscaClienteLayout = new javax.swing.GroupLayout(BuscaCliente.getContentPane());
        BuscaCliente.getContentPane().setLayout(BuscaClienteLayout);
        BuscaClienteLayout.setHorizontalGroup(
            BuscaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BuscaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscaClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBBuscaCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBFechar)))
                .addContainerGap())
        );
        BuscaClienteLayout.setVerticalGroup(
            BuscaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscaClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BuscaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBBuscaCliente)
                    .addComponent(JBFechar))
                .addContainerGap())
        );

        setClosable(true);
        setTitle("Cadastro de Cliente");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cliente.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(728, 555));

        JLNomeRazao.setText("Nome/Razão:");

        JTFNomeRazao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFNomeRazaoKeyPressed(evt);
            }
        });

        JLCPFCNPJ.setText("CPF/CNPJ:");

        JBCNPJCPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Busca.png"))); // NOI18N
        JBCNPJCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCNPJCPFActionPerformed(evt);
            }
        });

        JBIncricaoEstadual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JBIncricaoEstadual.setText("Inscrição Estadual:");

        JLCADPRO.setText("CADPRO:");

        JBSintegra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Busca.png"))); // NOI18N
        JBSintegra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSintegraActionPerformed(evt);
            }
        });

        JLEMAIL.setText("E-mail:");

        JLEndereco.setText("Endereço:");

        JLBairroDistrito.setText("Bairro/Distrito:");

        JLNumero.setText("Número:");

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

        try {
            JFTLCelular1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        JLCelular2.setText("Celular:");

        try {
            JFTLCelular2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        JLObservacao.setText("Observação:");

        JBGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Salvar.png"))); // NOI18N
        JBGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGravarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(JTAObervacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLNomeRazao, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLCPFCNPJ)
                            .addComponent(JLCADPRO)
                            .addComponent(JLEndereco))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTFCADPRO, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBSintegra, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLEMAIL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFEmail))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTFCPFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBCNPJCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBIncricaoEstadual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFInscricaoEstadual))
                            .addComponent(JTFNomeRazao)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JTFEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLNumero)
                                    .addComponent(JLCEP))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JFTLCEP)
                                    .addComponent(JTFNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                                .addGap(35, 35, 35))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLBairroDistrito)
                                .addGap(6, 6, 6)
                                .addComponent(JTFBairroDistrito))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLObservacao)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JLTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JFTLTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JLCelular1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JFTLCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JLCelular2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JFTLCelular2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(127, 182, 182))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(JLCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLDataCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JDCDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addComponent(JBGravar, javax.swing.GroupLayout.Alignment.TRAILING))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTFCPFCNPJ)
                        .addComponent(JLCPFCNPJ))
                    .addComponent(JBCNPJCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFInscricaoEstadual)
                    .addComponent(JBIncricaoEstadual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLCADPRO)
                        .addComponent(JTFCADPRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JBSintegra, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLEMAIL)
                        .addComponent(JTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEndereco)
                    .addComponent(JTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLNumero)
                    .addComponent(JTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBairroDistrito)
                    .addComponent(JTFBairroDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLCEP)
                    .addComponent(JFTLCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLEstado)
                            .addComponent(JCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLCidade)
                            .addComponent(JLDataCadastro)
                            .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLTelefone)
                            .addComponent(JFTLTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLCelular1)
                            .addComponent(JFTLCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLCelular2)
                            .addComponent(JFTLCelular2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLObservacao))
                    .addComponent(JDCDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBGravar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public void dataHohe() {
        JDCDataCadastro.setDate(new java.util.Date());
    }

    public void carregaTabelaClientes() {
        try {
            List l = Cad_Cliente_DAO.getInstance().buscar(JTFNomeRazao.getText());  // passa a consulta feita pelo DAO            
            ga.setDados(l);
            GradeBuscaCliente.updateUI();
        } catch (Throwable t) {
            t.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao Buscar Cliente!");
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
        JTFInscricaoEstadual.setText("");
        JTFNomeRazao.setText("");
        JTFCPFCNPJ.setText("");
        JTFInscricaoEstadual.setText("");
        JTFCADPRO.setText("");
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
        dataHohe();
    }

    private void JBSintegraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSintegraActionPerformed
        //Abrindo o site do Sintegra quando clicado no botão de busca
        Desktop desktop = null;
        desktop = Desktop.getDesktop();
        URI uri = null;

        try {
            uri = new URI("http://www.sintegra.gov.br/"); //NOI18N
            desktop.browse(uri);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (URISyntaxException use) {
            //use.printStackTrace();
            System.out.println("Erro ao acessar URL."); //NOI18N
        }
    }//GEN-LAST:event_JBSintegraActionPerformed

    private void JBCNPJCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCNPJCPFActionPerformed
        //Abrindo o site da receita para a consulta CNPJ quando clicado no botão de busca
        Desktop desktop = null;
        desktop = Desktop.getDesktop();
        URI uri = null;

        try {
            uri = new URI("http://www.receita.fazenda.gov.br/pessoajuridica/cnpj/cnpjreva/cnpjreva_solicitacao.asp"); //NOI18N
            desktop.browse(uri);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (URISyntaxException use) {
            //use.printStackTrace();
            System.out.println("Erro ao acessar URL."); //NOI18N
        }
    }//GEN-LAST:event_JBCNPJCPFActionPerformed

    private void JBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGravarActionPerformed
        //  Validacampos();
        try {
            if (cad_cliente == null) {
                Cad_Cliente_TO t = new Cad_Cliente_TO();//criando o objeto e grava nele
                t.setTxt_nomerazaosocial(JTFNomeRazao.getText());
                t.setNum_cpfcnpj(JTFCPFCNPJ.getText());
                t.setNum_inscricaoestatudal(JTFInscricaoEstadual.getText());
                t.setNum_cadpro(JTFCADPRO.getText());
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
                Cad_Cliente_DAO.incluir(t);//passando o objeto criado
                JOptionPane.showMessageDialog(this, "Cadastro realizado com Sucesso!");
            } else {
                cad_cliente.setTxt_nomerazaosocial(JTFNomeRazao.getText());
                cad_cliente.setNum_cpfcnpj(JTFCPFCNPJ.getText());
                cad_cliente.setNum_inscricaoestatudal(JTFInscricaoEstadual.getText());
                cad_cliente.setNum_cadpro(JTFCADPRO.getText());
                cad_cliente.setTxt_email(JTFEmail.getText());
                cad_cliente.setTxt_endereco(JTFEndereco.getText());
                cad_cliente.setTxt_bairrodistrito(JTFBairroDistrito.getText());
                cad_cliente.setNum_numero(JTFNumero.getText());
                cad_cliente.setNum_cep(JFTLCEP.getText());
                cad_cliente.setCad_estado((Cad_Estado_TO) JCBEstado.getSelectedItem());
                cad_cliente.setTxt_cidade(jtfCidade.getText());
                cad_cliente.setDt_datacadastro(JDCDataCadastro.getDate());
                cad_cliente.setNum_telefone(JFTLTelefone.getText());
                cad_cliente.setNum_celular1(JFTLCelular1.getText());
                cad_cliente.setNum_celular2(JFTLCelular2.getText());
                cad_cliente.setTxt_observacao(JTAObervacao.getText());
                Cad_Cliente_DAO.alterar(cad_cliente);//passando o objeto criado
                JOptionPane.showMessageDialog(this, "Cadastro alterado com Sucesso!");
            }
            carregaCombo();
            limparDados();
        } catch (Throwable t) {
            //msg quando existir duplicidade nas informações ja registradas
            JOptionPane.showMessageDialog(this, "Erro ao Cadastrar ou alterar os dados!");
            t.getMessage();
        }
    }//GEN-LAST:event_JBGravarActionPerformed

    private void JBBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscaClienteActionPerformed
        try {
            //pegando a opção selecionada na grade
            cad_cliente = (Cad_Cliente_TO) ga.getDadoAt(GradeBuscaCliente.getSelectedRow());
            if (cad_cliente != null) {
                JTFNomeRazao.setText(cad_cliente.getTxt_nomerazaosocial());
                JTFCPFCNPJ.setText(cad_cliente.getNum_cpfcnpj());
                JTFInscricaoEstadual.setText(cad_cliente.getNum_inscricaoestatudal());
                JTFCADPRO.setText(cad_cliente.getNum_cadpro());
                JTFEmail.setText(cad_cliente.getTxt_email());
                JTFEndereco.setText(cad_cliente.getTxt_endereco());
                JTFBairroDistrito.setText(cad_cliente.getTxt_bairrodistrito());
                JTFNumero.setText(cad_cliente.getNum_numero());
                JFTLCEP.setText(cad_cliente.getNum_cep());
                jtfCidade.setText(cad_cliente.getTxt_cidade());
                JDCDataCadastro.setDate(cad_cliente.getDt_datacadastro());
                JFTLTelefone.setText(cad_cliente.getNum_telefone());
                JFTLCelular1.setText(cad_cliente.getNum_celular1());
                JFTLCelular2.setText(cad_cliente.getNum_celular2());
                JTAObervacao.setText(cad_cliente.getTxt_observacao());

                for (int i = 1; i < JCBEstado.getItemCount(); i++) {
                    if (((Cad_Estado_TO) JCBEstado.getItemAt(i)).getId_cod_estado() == cad_cliente.getCad_estado().getId_cod_estado()) {
                        JCBEstado.setSelectedIndex(i);
                        break;
                    }
                }

                BuscaCliente.dispose();
            }
        } catch (Throwable t) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar lista de Clientes!");
            limparDados();
            t.printStackTrace();
        }
    }//GEN-LAST:event_JBBuscaClienteActionPerformed

    private void JTFNomeRazaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFNomeRazaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {            
            carregaTabelaClientes();
            limparDados();
            BuscaCliente.show();
        }
    }//GEN-LAST:event_JTFNomeRazaoKeyPressed

    private void JBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFecharActionPerformed
        BuscaCliente.dispose();
        limparDados();
    }//GEN-LAST:event_JBFecharActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame BuscaCliente;
    private javax.swing.JTable GradeBuscaCliente;
    private javax.swing.JButton JBBuscaCliente;
    private javax.swing.JButton JBCNPJCPF;
    private javax.swing.JButton JBFechar;
    private javax.swing.JButton JBGravar;
    private javax.swing.JLabel JBIncricaoEstadual;
    private javax.swing.JButton JBSintegra;
    private javax.swing.JComboBox JCBEstado;
    private com.toedter.calendar.JDateChooser JDCDataCadastro;
    private javax.swing.JFormattedTextField JFTLCEP;
    private javax.swing.JFormattedTextField JFTLCelular1;
    private javax.swing.JFormattedTextField JFTLCelular2;
    private javax.swing.JFormattedTextField JFTLTelefone;
    private javax.swing.JLabel JLBairroDistrito;
    private javax.swing.JLabel JLCADPRO;
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
    private javax.swing.JTextField JTFCADPRO;
    private javax.swing.JTextField JTFCPFCNPJ;
    private javax.swing.JTextField JTFEmail;
    private javax.swing.JTextField JTFEndereco;
    private javax.swing.JTextField JTFInscricaoEstadual;
    private javax.swing.JTextField JTFNomeRazao;
    private javax.swing.JTextField JTFNumero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtfCidade;
    // End of variables declaration//GEN-END:variables
}
