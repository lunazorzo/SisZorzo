package Tabela;

import Classes.Cad_Estado_TO;

public class ModeloTabelaEstado extends ModeloTabelaBase {

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (dados != null && rowIndex < dados.size()) {
            Cad_Estado_TO e = (Cad_Estado_TO) dados.get(rowIndex);
            if (columnIndex == 0) {
                return e.getTxt_nome_estado();
            }

        }
        return null;
    }

    public int getColumnCount() {
        return 1;
    }

    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
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

