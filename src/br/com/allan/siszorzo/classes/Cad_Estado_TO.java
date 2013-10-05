package br.com.allan.siszorzo.classes;

public class Cad_Estado_TO {

    private Long id_cod_estado;
    private String txt_nome_estado;

    public Long getId_cod_estado() {
        return id_cod_estado;
    }

    public void setId_cod_estado(Long id_cod_estado) {
        this.id_cod_estado = id_cod_estado;
    }

    public String getTxt_nome_estado() {
        return txt_nome_estado;
    }

    public void setTxt_nome_estado(String txt_nome_estado) {
        this.txt_nome_estado = txt_nome_estado;
    }

    @Override
    public String toString() {
        return txt_nome_estado;
    }
}
