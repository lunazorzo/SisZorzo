package classes;

public class Cad_Produto_TO {

    private Long id_cod_produto;
    private String txt_produto;
    private Cad_Unidade_Medida_TO cad_unidade_medida;
    private Cad_Fornecedor_TO cad_fornecedor;
    private String NCM;
    private String valor_compra;
    private String valor_venda;
    private String Observacao;

    public Long getId_cod_produto() {
        return id_cod_produto;
    }

    public void setId_cod_produto(Long id_cod_produto) {
        this.id_cod_produto = id_cod_produto;
    }

    public String getTxt_produto() {
        return txt_produto;
    }

    public void setTxt_produto(String txt_produto) {
        this.txt_produto = txt_produto;
    }

    public Cad_Unidade_Medida_TO getCad_unidade_medida() {
        return cad_unidade_medida;
    }

    public void setCad_unidade_medida(Cad_Unidade_Medida_TO cad_unidade_medida) {
        this.cad_unidade_medida = cad_unidade_medida;
    }

    public Cad_Fornecedor_TO getCad_fornecedor() {
        return cad_fornecedor;
    }

    public void setCad_fornecedor(Cad_Fornecedor_TO cad_fornecedor) {
        this.cad_fornecedor = cad_fornecedor;
    }

    public String getNCM() {
        return NCM;
    }

    public void setNCM(String NCM) {
        this.NCM = NCM;
    }

    public String getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(String valor_compra) {
        this.valor_compra = valor_compra;
    }

    public String getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(String valor_venda) {
        this.valor_venda = valor_venda;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }

       @Override
    public String toString() {
        return txt_produto;
    }

    public void setCad_unidade_medida(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCad_fornecedor(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

