package br.com.allan.siszorzo.dao;

import br.com.allan.siszorzo.classes.Cad_Estado_TO;
import br.com.allan.siszorzo.conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Cad_Estado_DAO {

    private static Cad_Estado_DAO instance;

    //incluindo no banco de dados
    public static void incluir(Cad_Estado_TO to) throws Exception {
        Conexao con = new Conexao();
        String sql = "INSERT INTO dbestado (txt_nome_estado) VALUES (?)";//quando nao for passar tds atributos do banco colocar entre parentes o nome da chave no banco
        con.prepararPst(sql);
        con.setParam(1, to.getTxt_nome_estado());//preparando a instrução
        con.executarPst(Conexao.ACAO_FECHAR);//confirma a intrução recebida, grava no banco e fechando a conexao
    }

    public static void excluir(Cad_Estado_TO tt) throws Exception {
        Conexao con = new Conexao();
        String sql = "DELETE FROM dbestado WHERE id_cod_estado = ?";
        con.prepararPst(sql);
        con.setParam(1, tt.getId_cod_estado());
        con.executarPst(con.ACAO_FECHAR);
    }

    public static void alterar(Cad_Estado_TO tt) throws Exception {
        Conexao con = new Conexao();
        String sql = "UPDATE dbestado SET txt_nome_estado = ? WHERE id_cod_estado = ?";
        con.prepararPst(sql);
        con.setParam(1, tt.getTxt_nome_estado());//passando a descrição
        con.setParam(2, tt.getId_cod_estado());//passando o id
        con.executarPst(con.ACAO_FECHAR);
    }

    public static Cad_Estado_DAO getInstance() {
        return instance == null ? instance = new Cad_Estado_DAO() : instance;
    }

//    buscando para a grade
    public ArrayList<Cad_Estado_TO> buscar() throws Exception {//listando para fazer a impressao na grade
        Conexao con = new Conexao();
        String sql = "SELECT * FROM dbestado";//selecionando no banco passando o nome da tabela
        PreparedStatement ps = con.getCon().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        ArrayList<Cad_Estado_TO> registros = new ArrayList<Cad_Estado_TO>();
        Cad_Estado_TO tanqueTemp;
        while (rs.next()) {
            tanqueTemp = new Cad_Estado_TO();
            tanqueTemp.setId_cod_estado(rs.getLong("id_cod_estado"));//pasando a id
            tanqueTemp.setTxt_nome_estado(rs.getString("txt_nome_estado"));//passa o nome do campo no banco
            registros.add(tanqueTemp);
        }
        return registros;

    }

    Cad_Estado_TO achar(long id) throws Exception {
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
