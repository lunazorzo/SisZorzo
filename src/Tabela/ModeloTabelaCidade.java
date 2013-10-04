package Tabela;

import Classes.Cad_Cidade_TO;

public class ModeloTabelaCidade extends ModeloTabelaBase {

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (dados != null && rowIndex < dados.size()) {
            Cad_Cidade_TO e = (Cad_Cidade_TO) dados.get(rowIndex);
            if (columnIndex == 0) {
                return e.getTxt_nome_cidade();
            }
            if (columnIndex == 1) {
                return e.getCad_estado();
            }

        }
        return null;
    }

    public int getColumnCount() {
        return 2;
    }

    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Cidade";
            case 1:
                return "Estado";
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
