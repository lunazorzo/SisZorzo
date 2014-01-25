/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Cad_Unidade_Medida_TO;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Allan
 */
public class Cad_Unidade_Medida_DAO {

    private static Object instance;

    public static Cad_Unidade_Medida_DAO getInstance() {//instanciando a classe
        return (Cad_Unidade_Medida_DAO) (instance == null ? instance = new Cad_Unidade_Medida_DAO() : instance);
    }

    public ArrayList<Cad_Unidade_Medida_TO> buscarUnidadeNumerica() throws Exception {//listando para fazer a impressao na grade
        Conexao con = new Conexao();
        String sql = "SELECT * FROM dbunidadenumerica";//selecionando no banco passando o nome da tabela
        PreparedStatement ps = con.getCon().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        ArrayList<Cad_Unidade_Medida_TO> registros = new ArrayList<Cad_Unidade_Medida_TO>();
        Cad_Unidade_Medida_TO utilTemp;
        while (rs.next()) {
            utilTemp = new Cad_Unidade_Medida_TO();
            utilTemp.setId_cod_unidade_medida(rs.getLong("id_cod_unidadenumerica"));//pasando a id
            utilTemp.setTxt_unidade_medida(rs.getString("txt_unidadenumerica"));
            registros.add(utilTemp);
        }
        return registros;
    }
}
