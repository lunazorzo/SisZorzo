/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.Cad_Cliente_TO;
import classes.Cad_Estado_TO;
import classes.Util;
import conexao.Conexao;
import dao.Cad_Cliente_DAO;
import dao.Cad_Estado_DAO;
import grades.Grade_Busca_Cliente_Duplicata;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public final class JIFDuplicata extends javax.swing.JInternalFrame {

    private Cad_Cliente_TO cad_cliente;
    Grade_Busca_Cliente_Duplicata ga;

    public JIFDuplicata() throws Exception {
        initComponents();
        ga = new Grade_Busca_Cliente_Duplicata();
        GradeBuscaCliente.setModel(ga);
        BuscaCliente.setMinimumSize(new Dimension(850, 500));//seta a dimensão/tamanho da tela
      //  BuscaCliente.setResizable(false);//desabilita a opção de maximizar
        BuscaCliente.setUndecorated(true); //desabilita a barra de Título 
        BuscaCliente.setLocationRelativeTo(null);//Seta o Frame centralizado

        carregaCombo();
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
        JTFNomeRazao = new javax.swing.JTextField();
        JLCPFCNPJ = new javax.swing.JLabel();
        JTFCPFCNPJ = new javax.swing.JTextField();
        JBIncricaoEstadual = new javax.swing.JLabel();
        JTFInscricaoEstadual = new javax.swing.JTextField();
        JLEndereco = new javax.swing.JLabel();
        JTFEndereco = new javax.swing.JTextField();
        JLBairroDistrito = new javax.swing.JLabel();
        JTFBairroDistrito = new javax.swing.JTextField();
        JLCEP = new javax.swing.JLabel();
        JFTLCEP = new javax.swing.JFormattedTextField();
        JLEstado = new javax.swing.JLabel();
        JCBEstado = new javax.swing.JComboBox();
        JLCidade = new javax.swing.JLabel();
        jtfCidade = new javax.swing.JTextField();
        JLDataCadastro = new javax.swing.JLabel();
        JLCelular1 = new javax.swing.JLabel();
        jftlCelular1 = new javax.swing.JFormattedTextField();
        JBGerarDuplicata = new javax.swing.JButton();
        jlNumFaturaDuplicata = new javax.swing.JLabel();
        jtfNumFaturaDuplicata = new javax.swing.JTextField();
        jlValorFatura = new javax.swing.JLabel();
        jtfValorFatura = new javax.swing.JTextField();
        jlValorExtenso = new javax.swing.JLabel();
        jtfValorExtenso = new javax.swing.JTextField();
        JDCDataVencimento = new com.toedter.calendar.JDateChooser();
        JLNumero = new javax.swing.JLabel();
        jtfNumero = new javax.swing.JTextField();

        BuscaCliente.setTitle("Busca de Cliente");

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
        JBFechar.setToolTipText("Fechar");
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
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
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BuscaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBBuscaCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBFechar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setClosable(true);
        setTitle("Duplicata");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Duplicata_1.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(690, 325));

        JLNomeRazao.setText("Nome/Razão:");

        JTFNomeRazao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFNomeRazaoKeyPressed(evt);
            }
        });

        JLCPFCNPJ.setText("CPF/CNPJ:");

        JBIncricaoEstadual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JBIncricaoEstadual.setText("Inscrição Estadual:");

        JLEndereco.setText("Endereço:");

        JLBairroDistrito.setText("Bairro/Distrito:");

        JLCEP.setText("CEP:");

        try {
            JFTLCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        JLEstado.setText("Estado:");

        JLCidade.setText("Cidade:");

        JLDataCadastro.setText("Data do Vencimento:");

        JLCelular1.setText("Celular:");

        try {
            jftlCelular1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        JBGerarDuplicata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Impressão.png"))); // NOI18N
        JBGerarDuplicata.setToolTipText("Gerar Impressão da Duplicata");
        JBGerarDuplicata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGerarDuplicataActionPerformed(evt);
            }
        });

        jlNumFaturaDuplicata.setText("Nº Fatura/Duplicata:");

        jlValorFatura.setText("Valor da Fatura/Duplicata:");

        jtfValorFatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfValorFaturaKeyReleased(evt);
            }
        });

        jlValorExtenso.setText("Valor por Extenso:");

        JDCDataVencimento.setDateFormatString("dd/MM/yyyy");

        JLNumero.setText("Número:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlValorFatura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfValorFatura, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jlValorExtenso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfValorExtenso))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(JLDataCadastro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JDCDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlNumFaturaDuplicata)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNumFaturaDuplicata, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JBGerarDuplicata)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(JLEstado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(JLCidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfCidade))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(JLBairroDistrito)
                                        .addGap(6, 6, 6)
                                        .addComponent(JTFBairroDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(JTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JLCelular1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jftlCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(JLNumero)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtfNumero))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(JLCEP)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(JFTLCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLNomeRazao, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLCPFCNPJ)
                                    .addComponent(JLEndereco))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JTFNomeRazao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JTFCPFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JBIncricaoEstadual)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFInscricaoEstadual)))))
                        .addGap(62, 62, 62)))
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
                    .addComponent(JTFInscricaoEstadual)
                    .addComponent(JBIncricaoEstadual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEndereco)
                    .addComponent(JTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLNumero)
                    .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLCEP)
                        .addComponent(JFTLCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLBairroDistrito)
                        .addComponent(JTFBairroDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLEstado)
                            .addComponent(JCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLCidade)
                            .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLDataCadastro)
                            .addComponent(JDCDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLCelular1)
                            .addComponent(jftlCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNumFaturaDuplicata)
                            .addComponent(jtfNumFaturaDuplicata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlValorFatura)
                    .addComponent(jtfValorFatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlValorExtenso)
                    .addComponent(jtfValorExtenso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBGerarDuplicata)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Seta a posição da tela para o centro.

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public void carregaTabelaClientes() {
        try {
            List l = Cad_Cliente_DAO.getInstance().buscarDuplicata(JTFNomeRazao.getText());  // passa a consulta feita pelo DAO       
            ga.setDados(l);
            GradeBuscaCliente.updateUI();
        } catch (Exception ex) {
            System.out.println(ex);//Mostra a mensagem real do erro
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
        JTFNomeRazao.setText("");
        JTFCPFCNPJ.setText("");
        JTFInscricaoEstadual.setText("");
        JTFEndereco.setText("");
        jtfNumero.setText("");
        JTFBairroDistrito.setText("");
        JFTLCEP.setText("");
        JCBEstado.setSelectedItem(null);
        jtfCidade.setText("");
        jftlCelular1.setText("");
        JDCDataVencimento.setDate(null);
        jtfNumFaturaDuplicata.setText("");
        jtfValorFatura.setText("");
        jtfValorExtenso.setText("");
        JTFNomeRazao.requestFocus(true);
    }

    private void JBGerarDuplicataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGerarDuplicataActionPerformed

        try {
            URL arquivo = getClass().getResource("/relatorios/Duplicata.jasper");//Pega o arquivo criado no IReport
            Map<String, Object> map = new HashMap<>();
            map.put("txt_nomerazaosocial", JTFNomeRazao.getText());
            map.put("num_cpfcnpj", JTFCPFCNPJ.getText());
            map.put("num_incricaoestatudal", JTFInscricaoEstadual.getText());
            map.put("txt_endereco", JTFEndereco.getText());
            map.put("num_numero", jtfNumero.getText());
            map.put("txt_bairro", JTFBairroDistrito.getText());
            map.put("num_cep", JFTLCEP.getText());
            //tem que realizar a conversão
            Cad_Estado_TO estadoTmp = (Cad_Estado_TO) JCBEstado.getSelectedItem();
            map.put("txt_nome_estado", estadoTmp.getTxt_nome_estado());
            map.put("txt_cidade", jtfCidade.getText());
            map.put("num_celular1", jftlCelular1.getText());
            map.put("dt_vencimento", JDCDataVencimento.getDate());
            map.put("num_duplicata", jtfNumFaturaDuplicata.getText());
            map.put("num_valor_fatura", jtfValorFatura.getText());
            map.put("valor_extenso", jtfValorExtenso.getText());
            Conexao c = new Conexao();
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(arquivo);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map, c.getCon());
            JasperViewer jrviewer = new JasperViewer(jasperPrint, false);
            jrviewer.setVisible(true);
            jrviewer.toFront();
            limparDados();
        } catch (Exception ex) {
           // ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Preencha os dados!");
        }
    }//GEN-LAST:event_JBGerarDuplicataActionPerformed

    private void JBBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscaClienteActionPerformed
        try {
            //pegando a opção selecionada na grade
            cad_cliente = (Cad_Cliente_TO) ga.getDadoAt(GradeBuscaCliente.getSelectedRow());
            if (cad_cliente != null) {
                JTFNomeRazao.setText(cad_cliente.getTxt_nomerazaosocial());
                JTFCPFCNPJ.setText(cad_cliente.getNum_cpfcnpj());
                JTFInscricaoEstadual.setText(cad_cliente.getNum_inscricaoestatudal());
                JTFEndereco.setText(cad_cliente.getTxt_endereco());
                JTFBairroDistrito.setText(cad_cliente.getTxt_bairrodistrito());
                JFTLCEP.setText(cad_cliente.getNum_cep());
                jtfNumero.setText(cad_cliente.getNum_numero());
                for (int i = 1; i < JCBEstado.getItemCount(); i++) {
                    if (((Cad_Estado_TO) JCBEstado.getItemAt(i)).getId_cod_estado() == cad_cliente.getCad_estado().getId_cod_estado()) {
                        JCBEstado.setSelectedIndex(i);
                        break;
                    }
                }
                jtfCidade.setText(cad_cliente.getTxt_cidade());
                jftlCelular1.setText(cad_cliente.getNum_celular1());
                JDCDataVencimento.setDate(cad_cliente.getDt_datacadastro());
                jftlCelular1.setText(cad_cliente.getNum_celular1());
                System.out.println(jftlCelular1);//Mostra a mensagem real do erro
                BuscaCliente.dispose();
            }
        } catch (Throwable t) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar lista de Clientes!");
            limparDados();
           // t.printStackTrace();
        }
    }//GEN-LAST:event_JBBuscaClienteActionPerformed

    private void JTFNomeRazaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFNomeRazaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            carregaTabelaClientes();
            BuscaCliente.show();
        }
    }//GEN-LAST:event_JTFNomeRazaoKeyPressed

    private void jtfValorFaturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfValorFaturaKeyReleased
        String valorTxt = jtfValorFatura.getText();
        valorTxt = valorTxt.replaceAll("\\.", "").replaceAll(",", "\\.");
        double valor = Double.valueOf(valorTxt);
        String extenso = Util.valorPorExtenso(valor);
        jtfValorExtenso.setText(extenso);
    }//GEN-LAST:event_jtfValorFaturaKeyReleased

    private void JBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFecharActionPerformed
        BuscaCliente.dispose();
        limparDados();
    }//GEN-LAST:event_JBFecharActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame BuscaCliente;
    private javax.swing.JTable GradeBuscaCliente;
    private javax.swing.JButton JBBuscaCliente;
    private javax.swing.JButton JBFechar;
    private javax.swing.JButton JBGerarDuplicata;
    private javax.swing.JLabel JBIncricaoEstadual;
    private javax.swing.JComboBox JCBEstado;
    private com.toedter.calendar.JDateChooser JDCDataVencimento;
    private javax.swing.JFormattedTextField JFTLCEP;
    private javax.swing.JLabel JLBairroDistrito;
    private javax.swing.JLabel JLCEP;
    private javax.swing.JLabel JLCPFCNPJ;
    private javax.swing.JLabel JLCelular1;
    private javax.swing.JLabel JLCidade;
    private javax.swing.JLabel JLDataCadastro;
    private javax.swing.JLabel JLEndereco;
    private javax.swing.JLabel JLEstado;
    private javax.swing.JLabel JLNomeRazao;
    private javax.swing.JLabel JLNumero;
    private javax.swing.JTextField JTFBairroDistrito;
    private javax.swing.JTextField JTFCPFCNPJ;
    private javax.swing.JTextField JTFEndereco;
    private javax.swing.JTextField JTFInscricaoEstadual;
    private javax.swing.JTextField JTFNomeRazao;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFormattedTextField jftlCelular1;
    private javax.swing.JLabel jlNumFaturaDuplicata;
    private javax.swing.JLabel jlValorExtenso;
    private javax.swing.JLabel jlValorFatura;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfNumFaturaDuplicata;
    private javax.swing.JTextField jtfNumero;
    private javax.swing.JTextField jtfValorExtenso;
    private javax.swing.JTextField jtfValorFatura;
    // End of variables declaration//GEN-END:variables
}
