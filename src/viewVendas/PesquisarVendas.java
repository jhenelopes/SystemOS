/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewVendas;


import bean.Vendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jhene
 */
public class PesquisarVendas extends AbstractTableModel {
private List lista;


public void setList(List lista){
    this.lista = lista;
    
}
public Vendas getVendas (int row){
    return (Vendas) lista.get(row);
}

    @Override
    public int getRowCount() {
         return lista.size();
    }

    @Override
   public int getColumnCount() {
       return 3;
    }

    
    public Object getValueAt(int row, int column) {
     Vendas vendas = (Vendas) lista.get (row);
      
      if(column == 0){
          return vendas.getIdvendas();
      }
      if(column == 1){
          return vendas.getData();
      }
      if(column == 2){
          return vendas.getClientes();
      }

      return null;
    }
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "ID";
            case 1: return "Data";
            case 2: return "Clientes";

            
        }
     return null;
}

}
