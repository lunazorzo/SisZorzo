package dao;

import classes.Cad_Estado_TO;
import classes.Cad_Cidade_TO;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

public class Cad_Cidade_DAO {

    private static Cad_Cidade_DAO instance;

    public static void incluir(Cad_Cidade_TO to) throws Exception {
        Conexao con = new Conexao();
        String sql = "INSERT INTO dbcidade (txt_nome_cidade, id_cod_estado) VALUES (?,?)";//quando nao for passar tds atributos do banco colocar entre parentes o nome da chave no banco
        //se passar dentro dos () nao importa a ordem
        con.prepararPst(sql);
        con.setParam(1, to.getTxt_nome_cidade());//passando a descrição
        con.setParam(2, to.getCad_estado().getId_cod_estado());
        con.executarPst(con.ACAO_FECHAR);//confirma a intrução recebida, grava no banco e fechando a conexao
    }

    public static void excluir(Cad_Cidade_TO tt) throws Exception {
        Conexao con = new Conexao();
        String sql = "DELETE FROM dbcidade WHERE id_cod_cidade = ?";
        con.prepararPst(sql);
        con.setParam(1, tt.getId_cod_cidade());
        con.executarPst(con.ACAO_FECHAR);
    }

    public static void alterar(Cad_Cidade_TO tt) throws Exception {
        Conexao con = new Conexao();
        String sql = "UPDATE dbcidade SET txt_nome_cidade = ?, id_cod_estado = ? WHERE id_cod_cidade = ? ";
        con.prepararPst(sql);
        con.setParam(1, tt.getTxt_nome_cidade());//passando a descrição
        con.setParam(2, tt.getCad_estado().getId_cod_estado());
        con.setParam(3, tt.getId_cod_cidade());
        con.executarPst(con.ACAO_FECHAR);
    }

    public static Cad_Cidade_DAO getInstance() {
        return instance == null ? instance = new Cad_Cidade_DAO() : instance;
    }

    //buscando para a grade
    public ArrayList<Cad_Cidade_TO> buscar(Cad_Cidade_TO cod) throws Exception {//listando para fazer a impressao na grade
        Conexao con = new Conexao();
        String sql = "SELECT * FROM dbcidade WHERE id_cod_estado = " + cod.getId_cod_cidade();//selecionando no banco passando o nome da tabela
        PreparedStatement ps = con.getCon().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Cad_Cidade_TO> registros = new ArrayList<Cad_Cidade_TO>();
        Cad_Cidade_TO utilTemp;
        Cad_Estado_DAO tadao = Cad_Estado_DAO.getInstance();
        while (rs.next()) {
            utilTemp = new Cad_Cidade_TO();
            utilTemp.setId_cod_cidade(rs.getLong("id_cod_cidade"));
            utilTemp.setTxt_nome_cidade(rs.getString("txt_nome_cidade"));
            Cad_Estado_TO ta = tadao.achar(rs.getLong("id_cod_estado"));
            utilTemp.setTxt_nome_cidade(sql);
            utilTemp.setCad_estado(ta);
            registros.add(utilTemp);
        }
        return registros;
    }
   
}
