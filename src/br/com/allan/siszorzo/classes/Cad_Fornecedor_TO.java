/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.allan.siszorzo.classes;

import java.util.Date;

/**
 *
 * @author Allan
 */
public class Cad_Fornecedor_TO {

    private Long id_cod_fornecedor;
    private Cad_Estado_TO cad_estado;
    private Date dt_datacadastro;
    private String num_cpfcnpj;
    private String num_telefone;
    private String num_celular1;
    private String num_celular2;
    private String num_cep;
    private String num_numero;
    private String txt_cidade;    
    private String num_inscricaoestatudal;
    private String txt_nomerazaosocial;
    private String txt_endereco;
    private String txt_bairrodistrito;
    private String txt_observacao;
    private String txt_email;

    public Long getId_cod_fornecedor() {
        return id_cod_fornecedor;
    }

    public void setId_cod_fornecedor(Long id_cod_fornecedor) {
        this.id_cod_fornecedor = id_cod_fornecedor;
    }

    public Cad_Estado_TO getCad_estado() {
        return cad_estado;
    }

    public void setCad_estado(Cad_Estado_TO cad_estado) {
        this.cad_estado = cad_estado;
    }

    public Date getDt_datacadastro() {
        return dt_datacadastro;
    }

    public void setDt_datacadastro(Date dt_datacadastro) {
        this.dt_datacadastro = dt_datacadastro;
    }

    public String getNum_cpfcnpj() {
        return num_cpfcnpj;
    }

    public void setNum_cpfcnpj(String num_cpfcnpj) {
        this.num_cpfcnpj = num_cpfcnpj;
    }

    public String getNum_telefone() {
        return num_telefone;
    }

    public void setNum_telefone(String num_telefone) {
        this.num_telefone = num_telefone;
    }

    public String getNum_celular1() {
        return num_celular1;
    }

    public void setNum_celular1(String num_celular1) {
        this.num_celular1 = num_celular1;
    }

    public String getNum_celular2() {
        return num_celular2;
    }

    public void setNum_celular2(String num_celular2) {
        this.num_celular2 = num_celular2;
    }

    public String getNum_cep() {
        return num_cep;
    }

    public void setNum_cep(String num_cep) {
        this.num_cep = num_cep;
    }

    public String getNum_numero() {
        return num_numero;
    }

    public void setNum_numero(String num_numero) {
        this.num_numero = num_numero;
    }

    public String getTxt_cidade() {
        return txt_cidade;
    }

    public void setTxt_cidade(String txt_cidade) {
        this.txt_cidade = txt_cidade;
    }

    public String getTxt_nomerazaosocial() {
        return txt_nomerazaosocial;
    }

    public void setTxt_nomerazaosocial(String txt_nomerazaosocial) {
        this.txt_nomerazaosocial = txt_nomerazaosocial;
    }

    public String getTxt_endereco() {
        return txt_endereco;
    }

    public void setTxt_endereco(String txt_endereco) {
        this.txt_endereco = txt_endereco;
    }

    public String getTxt_bairrodistrito() {
        return txt_bairrodistrito;
    }

    public void setTxt_bairrodistrito(String txt_bairrodistrito) {
        this.txt_bairrodistrito = txt_bairrodistrito;
    }

    public String getTxt_observacao() {
        return txt_observacao;
    }

    public void setTxt_observacao(String txt_observacao) {
        this.txt_observacao = txt_observacao;
    }

    public String getTxt_email() {
        return txt_email;
    }

    public void setTxt_email(String txt_email) {
        this.txt_email = txt_email;
    }

    public String getNum_inscricaoestatudal() {
        return num_inscricaoestatudal;
    }

    public void setNum_inscricaoestatudal(String num_inscricaoestatudal) {
        this.num_inscricaoestatudal = num_inscricaoestatudal;
    }
    @Override
    public String toString() {
        return txt_nomerazaosocial;
    }
    
}
