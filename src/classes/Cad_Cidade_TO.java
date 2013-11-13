package classes;

public class Cad_Cidade_TO {

    private Long id_cod_cidade;
    private String txt_nome_cidade;
    private Cad_Estado_TO cad_estado;

       public Long getId_cod_cidade() {
        return id_cod_cidade;
    }

    public void setId_cod_cidade(Long id_cod_cidade) {
        this.id_cod_cidade = id_cod_cidade;
    }

    public String getTxt_nome_cidade() {
        return txt_nome_cidade;
    }

    public void setTxt_nome_cidade(String txt_nome_cidade) {
        this.txt_nome_cidade = txt_nome_cidade;
    }

    public Cad_Estado_TO getCad_estado() {
        return cad_estado;
    }

    public void setCad_estado(Cad_Estado_TO cad_estado) {
        this.cad_estado = cad_estado;
    }

    @Override
    public String toString() {
        return txt_nome_cidade;
    }
}
