package classes;


public class Cad_Unidade_Medida_TO {

    private Long id_cod_unidade_medida;
    private String txt_unidade_medida;

    public Long getId_cod_unidade_medida() {
        return id_cod_unidade_medida;
    }

    public void setId_cod_unidade_medida(Long id_cod_unidade_medida) {
        this.id_cod_unidade_medida = id_cod_unidade_medida;
    }

    public String getTxt_unidade_medida() {
        return txt_unidade_medida;
    }

    public void setTxt_unidade_medida(String txt_unidade_medida) {
        this.txt_unidade_medida = txt_unidade_medida;
    }

    @Override
    public String toString() {
        return txt_unidade_medida;
    }
}
