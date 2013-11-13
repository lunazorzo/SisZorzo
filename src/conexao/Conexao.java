package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;

public class Conexao {

    public static final int ACAO_EXECUTAR = 0;
    public static final int ACAO_CONFIRMAR = 1;
    public static final int ACAO_FECHAR = 2;
    private final Connection con;
    private PreparedStatement pst;
    private Object linha;

    public Conexao() throws Exception {
        String driver, url, usuario, senha;

        driver = "org.postgresql.Driver";// driver te utilização
        url = "jdbc:postgresql://localhost:5432/Loja_Pai";//aonde que esta no bando e o nome
        usuario = "postgres";//usuario do banco de dados
        senha = "root";//senha do banco de dadoss

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, senha);
            con.setAutoCommit(false);
        } catch (ClassNotFoundException cnf) {
            throw new Exception("Erro de Driver");

        }
    }

    public Connection getCon() {
        return con;
    }

    public void prepararPst(String sql) throws Exception {
        try {
            pst = con.prepareStatement(sql);
        } catch (SQLException se) {
            throw new Exception("Erro de persistência"
                    + "\nMensagem original:  " + se.getMessage());
        }
    }

    public void setParam(int i, int p) throws Exception {
        try {
            pst.setInt(i, p);
        } catch (SQLException se) {
            throw new Exception("Erro de persistência"
                    + "\nMensagem original:  " + se.getMessage());
        }
    }

    public void setParam(int i, double p) throws Exception {
        try {
            pst.setDouble(i, p);
        } catch (SQLException se) {
            throw new Exception("Erro de persistência"
                    + "\nMensagem original: " + se.getMessage());
        }
    }

    public void setParam(int i, String p) throws Exception {
        try {
            pst.setString(i, p);
        } catch (SQLException se) {
            throw new Exception("Erro de persistência"
                    + "\nMensagem original:  " + se.getMessage());
        }
    }

    public void setParam(int i, Date p) throws Exception {
        try {
            pst.setDate(i, (java.sql.Date) p);
        } catch (SQLException se) {
            throw new Exception("Erro de persistência"
                    + "\nMensagem original:  " + se.getMessage());
        }
    }

    public void setParam(int i, Time p) throws Exception {
        try {
            pst.setTime(i, p);
        } catch (SQLException se) {
            throw new Exception("Erro de persistência"
                    + "\nMensagem original:  " + se.getMessage());
        }
    }

    public void executarPst(int acao) throws Exception {
        //verifica no banco se ja existe o dado informado
        try {
            pst.execute();
            if (acao > 0) {
                con.commit();
            }
            if (acao > 1) {
                con.close();
            }
        } catch (SQLException se) {
            throw new Exception("Erro de persistência"
                    + "\nMensagem original:  " + se.getMessage());
        }
    }

    public void confirmar() throws Exception {
        try {
            con.commit();
        } catch (SQLException se) {
            throw new Exception("Erro de persistência"
                    + "\nMensagem original:  " + se.getMessage());
        }
    }
}
