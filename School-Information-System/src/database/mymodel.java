package database;

import javax.swing.table.AbstractTableModel;



  public class mymodel extends AbstractTableModel implements java.io.Serializable{

          Object rows[][];
          String titles[];

          public mymodel(Object r[][], String t[]){
              super();
              this.rows = r;
              this.titles = t;

          }

      public int getRowCount() {
          return rows.length;
      }

      public int getColumnCount() {
          return titles.length;
      }

      public Object getValueAt(int rowIndex, int columnIndex) {
          return rows[rowIndex][columnIndex];
      }
      public String getColumnName(int col) {
          return this.titles[col];
  }

   }

