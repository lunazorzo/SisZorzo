package grades;

import classes.Cad_Produto_TO;

public class Grade_Busca_Produto extends Modelo_Grade_Base {

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (dados != null && rowIndex < dados.size()) {
            Cad_Produto_TO e = (Cad_Produto_TO) dados.get(rowIndex);
            if (columnIndex == 0) {
                return e.getTxt_produto();
            }
            if (columnIndex == 1) {
                return e.getCad_fornecedor().getId_cod_cliente();
            }
            if (columnIndex == 2) {
                return e.getCad_unidade_medida().getId_cod_unidade_medida();
            }
            if (columnIndex == 3) {
                return e.getValor_compra();
            }
            if (columnIndex == 4) {
                return e.getValor_venda();
            }
            if (columnIndex == 5) {
                return e.getNCM();
            }
            if (columnIndex == 6) {
                return e.getObservacao();
            }
        }
        return null;
    }

    public int getColumnCount() {
        return 7;
    }

    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Descrição Produto";
            case 1:
                return "Fornecedor";
            case 2:
                return "Unidade de Medida";
            case 3:
                return "Valor de Compra R$";
            case 4:
                return "Valor de Venda R$";
            case 5:
                return "NCM";
            case 6:
                return "Observacao";
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
