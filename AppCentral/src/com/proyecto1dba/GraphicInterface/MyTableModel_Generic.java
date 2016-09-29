/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dba.GraphicInterface;


import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Jason
 */
public class MyTableModel_Generic extends AbstractTableModel {
    private String[] columnNames;
    public ArrayList<ArrayList<String>> data;
    public MyTableModel_Generic(String[] columnNames,ArrayList<ArrayList<String>> data){
        this.columnNames=columnNames;
        this.data=data;
        
    }
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    @Override
    public String getColumnName(int col) {
            return columnNames[col];
        }

    @Override
    public Object getValueAt(int row, int col) {
        return data.get(row).get(col);
    }
    /**
     *
     * @param row
     * @param col
     * @return
     */
    @Override
    /*
     * Les agrega el tipo de clase a cada columna
     */
    public Class getColumnClass(int c) {
        
            return String.class;
        }
//    @Override
//     public void setValueAt(Object value, int row, int col) {
//        data.set[row][col] = value;
//        fireTableCellUpdated(row, col);
//    }
    @Override
    public boolean isCellEditable(int row, int col) {
      
       
            return false;
        
        
    
    
   
   
   
    
}
}
