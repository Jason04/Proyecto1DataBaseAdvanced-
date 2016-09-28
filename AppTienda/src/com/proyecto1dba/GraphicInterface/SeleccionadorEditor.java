/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dba.GraphicInterface;

//import com.jidesoft.hints.ListDataIntelliHints;
import com.jidesoft.hints.ListDataIntelliHints;
import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.DefaultCellEditor;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Jason
 */
public class SeleccionadorEditor extends DefaultCellEditor {
     JTextField ftf;
     String[] informacion;
     JTable table;
     
         
         
         
     public SeleccionadorEditor(String[] informacion,JTable table) {
        super(new JTextField());
        this.table=table;
        this.informacion=informacion;
        ftf = (JTextField)getComponent();
       ListDataIntelliHints intellihints=new ListDataIntelliHints(ftf,informacion);
        ftf.setBorder(null);
        this.clickCountToStart=1;
        
        
    }
      
    
    
    @Override
    public boolean stopCellEditing() {
        MyTableModel_FACT model= (MyTableModel_FACT)table.getModel();
        model.addRow(1);
        table.revalidate();
        table.repaint();
        table.changeSelection( table.getSelectedRow()+1, table.getSelectedColumn(), false, false );  
        return super.stopCellEditing();
    }
       

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
    boolean isSelected, int row, int column) {
        /**MyTableModel_FACT model= (MyTableModel_FACT)table.getModel();
        model.addRow(1);
        table.revalidate();
        table.repaint();**/
        Component c = super.getTableCellEditorComponent(table,
                value, isSelected, row, column);
        ((JComponent) c).setBorder(new LineBorder(Color.black));
        if (isSelected) {
            ((JTextField) c).setText(null);
            
        }
        return c;
    }
          
}


