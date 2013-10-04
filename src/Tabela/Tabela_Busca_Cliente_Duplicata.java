/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabela;

import Classes.Cad_Cliente_TO;

/**
 *
 * @author Allan
 */
public class Tabela_Busca_Cliente_Duplicata extends ModeloTabelaBase {

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (dados != null && rowIndex < dados.size()) {
            Cad_Cliente_TO e = (Cad_Cliente_TO) dados.get(rowIndex);
            if (columnIndex == 0) {
                return e.getTxt_nomerazaosocial();
            }
            if (columnIndex == 1) {
                return e.getNum_cpfcnpj();
            }
            if (columnIndex == 2) {
                return e.getNum_inscricaoestatudal();
            }
            if (columnIndex == 3) {
                return e.getNum_celular1();
            }
            if (columnIndex == 4) {
                return e.getTxt_endereco();
            }
            if (columnIndex == 5) {
                return e.getTxt_bairrodistrito();
            }
            if (columnIndex == 6) {
                return e.getNum_numero();
            }
            if (columnIndex == 7) {
                return e.getNum_cep();
            }
            if (columnIndex == 8) {
                return e.getCad_estado().getTxt_nome_estado();
            }
            if (columnIndex == 9) {
                return e.getTxt_cidade();
            }           
            
        }
        return null;
    }

    public int getColumnCount() {
        return 10;
    }

    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Nome/Razão:";
            case 1:
                return "CPF/CNPJ:";
            case 2:
                return "InscricaoEstadual";
            case 3:
                return "CADPRO";
            case 4:
                return "Celular";
            case 5:
                return "Endereco";
            case 6:
                return "BairroDistrito";
            case 7:
                return "Numero";
            case 8:
                return "CEP";
            case 9:
                return "Estado";
            case 10:
                return "Cidade";
            default:
                return "";
        }
    }

    public Class<?> getColumnClass(int columnIndex) {
        return new String().getClass();
    }

    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }
}
