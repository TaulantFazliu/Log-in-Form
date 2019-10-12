/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabelat;

/**
 *
 * @author taula
 */
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class StudentiTabela extends AbstractTableModel {

    private String[] columnNames = {"ID", "Name", "Lastname"};
    private ArrayList<Studenti> data;

    public StudentiTabela() {
        this.data = new ArrayList<>();
    }

    public StudentiTabela(ArrayList<Studenti> data) {
        this.data = data;
    }

    public void addRow(Studenti p) {
        data.add(p);
        fireTableDataChanged();
    }

    public void removeRow(Studenti p) {

        data.remove(p);
        fireTableDataChanged();
    }

    public void removeRow(int rowIndex) {
        data.remove(rowIndex);
        fireTableDataChanged();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }
    public void clear(){
        data.clear();
        fireTableDataChanged();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Studenti p = (Studenti) data.get(rowIndex);
        if (columnIndex == 0) {
            return p.getId();
        } else if (columnIndex == 1) {
            return p.getName();
        } else if (columnIndex == 2) {
            return p.getLastname();
        }
        return null;
    }
}
