/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabelat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import LogIn.Profesor;

public class ProfesorTabel extends AbstractTableModel {

    private String[] columnNames = {"ID", "Name", "Lastname"};
    private ArrayList<Profesor> data;

    public ProfesorTabel() {
        this.data = new ArrayList<>();
    }

    public ProfesorTabel(ArrayList<Profesor> data) {
        this.data = data;
    }

    public void addRow(Profesor p) {
        data.add(p);
        fireTableDataChanged();
    }

    public void removeRow(Profesor p) {

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
        Profesor p = (Profesor) data.get(rowIndex);
        if (columnIndex == 0) {
            return p.getNumriRendor();
        } else if (columnIndex == 1) {
            return p.getEmri();
        } else if (columnIndex == 2) {
            return p.getMbiemri();
        }
        return null;
    }
}

