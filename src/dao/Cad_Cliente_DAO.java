/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Cad_Cliente_TO;
import classes.Cad_Estado_TO;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Allan
 */
public class Cad_Cliente_DAO {

    private static Object instance;
    public Connection con;

    public static void incluir(Cad_Cliente_TO to) throws Exception {
        Conexao con = new Conexao();
        String sql = "INSERT INTO dbcliente (id_cod_estado, dt_datacadastro, num_cpfcnpj, num_telefone, txt_cidade, txt_nomerazaosocial, num_cep, "
                + "num_numero, num_inscricaoestatudal, num_cadpro, txt_endereco, "
                + "txt_bairrodistrito, txt_observacao, num_celular2, num_celular1, txt_email) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";//quando nao for passar tds atributos do banco colocar entre parentes o nome da chave no banco
        //se passar dentro dos () nao importa a ordem
        con.prepararPst(sql);
        con.setParam(1, to.getCad_estado().getId_cod_estado());
        con.setParam(2, new java.sql.Date(to.getDt_datacadastro().getTime()));
        con.setParam(3, to.getNum_cpfcnpj());
        con.setParam(4, to.getNum_telefone());
        con.setParam(5, to.getTxt_cidade());
        con.setParam(6, to.getTxt_nomerazaosocial());
        con.setParam(7, to.getNum_cep());
        con.setParam(8, to.getNum_numero());
        con.setParam(9, to.getNum_inscricaoestatudal());
        con.setParam(10, to.getNum_cadpro());
        con.setParam(11, to.getTxt_endereco());
        con.setParam(12, to.getTxt_bairrodistrito());
        con.setParam(13, to.getTxt_observacao());
        con.setParam(14, to.getNum_celular2());
        con.setParam(15, to.getNum_celular1());
        con.setParam(16, to.getTxt_email());
        con.executarPst(Conexao.ACAO_FECHAR);//confirma a intrução recebida, grava no banco e fechando a conexao
    }

    public static void alterar(Cad_Cliente_TO tt) throws Exception {
        Conexao con = new Conexao();
        String sql;
        sql = "UPDATE dbcliente SET txt_nomerazaosocial=?, num_cpfcnpj=?, num_inscricaoestatudal=?, num_cadpro=?, txt_email=?, txt_endereco=?, txt_bairrodistrito=?,"
                + " num_numero=?, num_cep=?, dt_datacadastro=?, num_telefone=?, num_celular1=?, num_celular2=?, txt_observacao=?, id_cod_estado=?, txt_cidade=?"
                + " WHERE id_cod_cliente=?";
        con.prepararPst(sql);
        con.setParam(1, tt.getTxt_nomerazaosocial());//verificar
        con.setParam(2, tt.getNum_cpfcnpj());//verificar
        con.setParam(3, tt.getNum_inscricaoestatudal());//verificar
        con.setParam(4, tt.getNum_cadpro());
        con.setParam(5, tt.getTxt_email());
        con.setParam(6, tt.getTxt_endereco());
        con.setParam(7, tt.getTxt_bairrodistrito());
        con.setParam(8, tt.getNum_numero());
        con.setParam(9, tt.getNum_cep());
        con.setParam(10, new java.sql.Date(tt.getDt_datacadastro().getTime()));
        con.setParam(11, tt.getNum_telefone());
        con.setParam(12, tt.getNum_celular1());
        con.setParam(13, tt.getNum_celular2());
        con.setParam(14, tt.getTxt_observacao());//verificar
        con.setParam(15, tt.getCad_estado().getId_cod_estado());
        con.setParam(16, tt.getTxt_cidade());
        con.setParam(17, tt.getId_cod_cliente());
        con.executarPst(Conexao.ACAO_FECHAR);
    }

    public static Cad_Cliente_DAO getInstance() {//instanciando a classe
        return (Cad_Cliente_DAO) (instance == null ? instance = new Cad_Cliente_DAO() : instance);
    }

//    http://javafree.uol.com.br/artigo/874102/Acessando-dados-com-Java-1%C2%BA-parte-Simples-Dao.html
    public ArrayList<Cad_Cliente_TO> buscar(String razaosocial) throws Exception {//listando para fazer a impressao na grade
        Conexao con = new Conexao();
        String sql = "SELECT * FROM dbcliente where txt_nomerazaosocial ILIKE ? ";//selecionando no banco passando o nome da tabela
        PreparedStatement ps = con.getCon().prepareStatement(sql);
        ps.setString(1, "%" + razaosocial + "%");
        ResultSet rs = ps.executeQuery();
        ArrayList<Cad_Cliente_TO> registros = new ArrayList<>();
        Cad_Cliente_TO UserTemp;
        Cad_Cliente_DAO tadao = Cad_Cliente_DAO.getInstance();
        while (rs.next()) {
            UserTemp = new Cad_Cliente_TO();
            UserTemp.setId_cod_cliente(rs.getLong("id_cod_cliente"));
            UserTemp.setTxt_nomerazaosocial(rs.getString("txt_nomerazaosocial"));
            UserTemp.setNum_cpfcnpj(rs.getString("num_cpfcnpj"));
            UserTemp.setNum_inscricaoestatudal(rs.getString("num_inscricaoestatudal"));
            UserTemp.setNum_cadpro(rs.getString("num_cadpro"));
            UserTemp.setTxt_email(rs.getString("txt_email"));
            UserTemp.setTxt_endereco(rs.getString("txt_endereco"));
            UserTemp.setTxt_bairrodistrito(rs.getString("txt_bairrodistrito"));
            UserTemp.setNum_numero(rs.getString("num_numero"));
            UserTemp.setNum_cep(rs.getString("num_cep"));
            UserTemp.setDt_datacadastro(rs.getDate("dt_datacadastro"));
            UserTemp.setNum_telefone(rs.getString("num_telefone"));
            UserTemp.setNum_celular1(rs.getString("Num_celular1"));
            UserTemp.setNum_celular2(rs.getString("Num_celular2"));
            UserTemp.setTxt_observacao(rs.getString("txt_observacao"));
            UserTemp.setTxt_cidade(rs.getString("txt_cidade"));
            Cad_Estado_TO ta = tadao.achar(rs.getLong("id_cod_estado"));
            UserTemp.setCad_estado(ta);
            registros.add(UserTemp);            
        }      
        ps.close();
        return registros;
    }

    public ArrayList<Cad_Cliente_TO> buscarDuplicata(String razaosocial) throws Exception {//listando para fazer a impressao na grade
        Conexao con = new Conexao();
        String sql = "SELECT * FROM dbcliente where txt_nomerazaosocial ILIKE ? ";//selecionando no banco passando o nome da tabela
        PreparedStatement ps = con.getCon().prepareStatement(sql);
        ps.setString(1, "%" + razaosocial + "%");
        ResultSet rs = ps.executeQuery();
        ArrayList<Cad_Cliente_TO> registros = new ArrayList<>();
        Cad_Cliente_TO UserTemp;
        Cad_Cliente_DAO tadao = Cad_Cliente_DAO.getInstance();
        while (rs.next()) {
            UserTemp = new Cad_Cliente_TO();
            UserTemp.setId_cod_cliente(rs.getLong("id_cod_cliente"));
            UserTemp.setTxt_nomerazaosocial(rs.getString("txt_nomerazaosocial"));
            UserTemp.setNum_cpfcnpj(rs.getString("num_cpfcnpj"));
            UserTemp.setNum_inscricaoestatudal(rs.getString("num_inscricaoestatudal"));
            UserTemp.setNum_cadpro(rs.getString("num_cadpro"));
            UserTemp.setTxt_email(rs.getString("txt_email"));
            UserTemp.setTxt_endereco(rs.getString("txt_endereco"));
            UserTemp.setTxt_bairrodistrito(rs.getString("txt_bairrodistrito"));
            UserTemp.setNum_numero(rs.getString("num_numero"));
            UserTemp.setNum_cep(rs.getString("num_cep"));
            UserTemp.setNum_celular1(rs.getString("Num_celular1"));
            UserTemp.setTxt_cidade(rs.getString("txt_cidade"));
            Cad_Estado_TO ta = tadao.achar(rs.getLong("id_cod_estado"));
            UserTemp.setCad_estado(ta);
            registros.add(UserTemp);
        }
        ps.close();
        return registros;
    }

    private Cad_Estado_TO achar(long id) throws Exception {
        Conexao con = new Conexao();
        String sql = "SELECT * FROM dbestado WHERE id_cod_estado = " + id;//selecionando no banco passando o nome da tabela
        PreparedStatement ps = con.getCon().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Cad_Estado_TO adubacaoTemp = null;
        if (rs.next()) {
            adubacaoTemp = new Cad_Estado_TO();
            adubacaoTemp.setId_cod_estado(rs.getLong("id_cod_estado"));//pasando a id
            adubacaoTemp.setTxt_nome_estado(rs.getString("txt_nome_estado"));//passa o nome do campo no banco
        }
        rs.close();
        return adubacaoTemp;
    }
}
