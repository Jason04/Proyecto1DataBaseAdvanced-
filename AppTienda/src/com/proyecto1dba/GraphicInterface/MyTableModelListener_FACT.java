/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dba.GraphicInterface;


import com.proyecto1dba.AccessData.AcessData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Jason
 * Esta clase crea un Listener Personalizado para la Tabla de Factura
 */
public class MyTableModelListener_FACT implements TableModelListener {


    JTable table;
    // Contiene el valor antiguo que tiene un celda antes de ser cambiado
    private String oldValue; 
   // private Direct_Control_BD BDmanagment;
    //Es el TextField que va a guardar los datos segun lo que pase en la tabla
   private JFormattedTextField total;
   AcessData AD;

  MyTableModelListener_FACT(JTable table,String oldValue,JFormattedTextField total) {
    this.table = table;
    this.oldValue =oldValue;
    this.total=total;
    AD = new AcessData();
    
  }

  @Override
  /**
   * Este metodo detecta un cambio en la tabla y ejecuta varias condiciones.
   */
  public void tableChanged(TableModelEvent e) {
      
      int row = e.getFirstRow();//row
      
      int column = e.getColumn();//column
      
      MyTableModel_FACT model = (MyTableModel_FACT) e.getSource();
      
      String columnName = model.getColumnName(column);
      Object data = model.getValueAt(row, 0);
      if(data==null){
          return;
      }
      String info = data.toString();
      String oldValue=this.getOldValue();
    
      
      if (columnName.equals("Cod. Articulo")) {
          String idProd = data.toString(); 
          
         
          
           //si ingresa un codigo el usuario
          if (!info.equals("")) {
              String descripcion = AD.getNombreProd(idProd);
              String precio =   AD.getPrecioProd(idProd);
              model.setValueAt(descripcion, row,  1);
              model.setValueAt(precio, row, 2);///IMPORTANTE ESTE ORDEN
              
          }
              // Por si el usuario no deja nada en la celda y ya tenia un cod
          // de un articulo entonces hace que se mantega el que ya estaba
          if (info.equals("") & !oldValue.equals("")) {
              model.setValueAt(oldValue, row, 0);
              return;
          }
      }
      
  }

    /**
     * @return the oldValue
     */
    public String getOldValue() {
        return oldValue;
    }

    /**
     * @param oldValue the oldValue to set
     */
    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }
    /**
     * Este metodo permite corregir el dato que tiene el signo de C y ademas
     * que puede tener comas ya que el tipo Decimal en la base solo
     * puede tener puntos y no comas.
     * @param Dato
     * @return 
     */
     private BigDecimal corregirDato(String Dato){
            String datoAcorregir = Dato.replace("C", "");
            DecimalFormat decimalformat = (DecimalFormat) NumberFormat.getInstance();
            decimalformat.setParseBigDecimal(true);
            BigDecimal DatoCorregido = null;
            try {
                DatoCorregido = (BigDecimal) decimalformat.parseObject(datoAcorregir);
            } catch (ParseException ex) {
                Logger.getLogger(MyTableModelListener_FACT.class.getName()).log(Level.SEVERE, null, ex);
            }
            return DatoCorregido;
    
    }
}
