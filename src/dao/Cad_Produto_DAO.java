package dao;

import classes.Cad_Fornecedor_TO;
import classes.Cad_Produto_TO;
import classes.Cad_Unidade_Medida_TO;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Allan
 */
public class Cad_Produto_DAO {

    private static Object instance;
    public Connection con;

    public static Cad_Produto_DAO getInstance() {//instanciando a classe
        return (Cad_Produto_DAO) (instance == null ? instance = new Cad_Produto_DAO() : instance);
    }

    public static void incluir(Cad_Produto_TO to) throws Exception {
        Conexao con = new Conexao();
        String sql = "INSERT INTO dbproduto (txt_NCM, id_cod_unidadenumerica, id_cod_fornecedor, txt_nomeproduto, num_valorcompra, num_valorvenda, txt_observacao)"
                + "VALUES (?,?,?,?,?,?,?)";//quando nao for passar tds atributos do banco colocar entre parentes o nome da chave no banco
        //se passar dentro dos () nao importa a ordem
        con.prepararPst(sql);
        con.setParam(1, to.getNCM());
        con.setParam(2, to.getCad_unidade_medida().getId_cod_unidade_medida());
        con.setParam(3, to.getCad_fornecedor().getId_cod_cliente());
        con.setParam(4, to.getTxt_produto());
        con.setParam(5, to.getValor_compra());
        con.setParam(6, to.getValor_venda());
        con.setParam(7, to.getObservacao());
        con.executarPst(Conexao.ACAO_FECHAR);//confirma a intrução recebida, grava no banco e fechando a conexao
    }

    public ArrayList<Cad_Produto_TO> buscar(String nome) throws Exception {//listando para fazer a impressao na grade
        Conexao con = new Conexao();
        String sql = "SELECT * FROM dbproduto where txt_nomeproduto ILIKE ?";//selecionando no banco passando o nome da tabela
        PreparedStatement ps = con.getCon().prepareStatement(sql);
        ps.setString(1, "%" + nome + "%");
        ResultSet rs = ps.executeQuery();
        ArrayList<Cad_Produto_TO> registros = new ArrayList<>();
        Cad_Produto_TO UserTemp;
        Cad_Produto_DAO tadao = Cad_Produto_DAO.getInstance();
        while (rs.next()) {
            UserTemp = new Cad_Produto_TO();
            UserTemp.setId_cod_produto(rs.getLong("id_cod_produto"));
            UserTemp.setTxt_produto(rs.getString("txt_nomeproduto"));
            UserTemp.setValor_compra(rs.getString("num_valorcompra"));
            UserTemp.setValor_venda(rs.getString("num_valorvenda"));
            UserTemp.setNCM(rs.getString("txt_ncm"));
            UserTemp.setObservacao(rs.getString("txt_observacao"));
            Cad_Unidade_Medida_TO ta = tadao.acharUnidadeMedida(rs.getLong("id_cod_unidadenumerica"));
            UserTemp.setCad_unidade_medida(ta);
            Cad_Fornecedor_TO to = tadao.acharFornecedor(rs.getLong("id_cod_fornecedor"));
            UserTemp.setCad_fornecedor(to);
            registros.add(UserTemp);
            return registros;
        }
        return null;

    }

    private Cad_Unidade_Medida_TO acharUnidadeMedida(long id) throws Exception {
        Conexao con = new Conexao();
        String sql = "SELECT * FROM dbunidadenumerica WHERE id_cod_unidadenumerica = " + id;//selecionando no banco passando o nome da tabela
        PreparedStatement ps = con.getCon().prepareStatement(sql);
        Cad_Unidade_Medida_TO TempUnidadeMedida;
        try (ResultSet rs = ps.executeQuery()) {
            TempUnidadeMedida = null;
            if (rs.next()) {
                TempUnidadeMedida = new Cad_Unidade_Medida_TO();
                TempUnidadeMedida.setId_cod_unidade_medida(rs.getLong("id_cod_unidadenumerica"));//pasando a id
                TempUnidadeMedida.setTxt_unidade_medida(rs.getString("txt_unidadenumerica"));//passa o nome do campo no banco
            }
        }
        ps.close();
        return TempUnidadeMedida;

    }

    private Cad_Fornecedor_TO acharFornecedor(long id) throws Exception {
        Conexao con = new Conexao();
        String sql = "SELECT * FROM dbfornecedor WHERE id_cod_fornecedor = " + id;//selecionando no banco passando o nome da tabela
        PreparedStatement ps = con.getCon().prepareStatement(sql);
        Cad_Fornecedor_TO Temp;
        try (ResultSet rs = ps.executeQuery()) {
            Temp = null;
            if (rs.next()) {
                Temp = new Cad_Fornecedor_TO();
                Temp.setId_cod_cliente(rs.getLong("id_cod_fornecedor"));//pasando a id
                Temp.setTxt_nomerazaosocial(rs.getString("txt_nomerazaosocial"));//passa o nome do campo no banco
            }
        }
        ps.close();
        return Temp;
    }
}
