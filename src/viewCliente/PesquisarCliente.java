/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewCliente;


import bean.Clientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jhene
 */
public class PesquisarCliente extends AbstractTableModel {
private List lista;

public void setList(List lista){
    this.lista = lista;
        this.fireTableDataChanged();
    
}
public Clientes getClientes (int row){
    return (Clientes) lista.get(row);
}


    @Override
    public int getRowCount() {
 return lista.size();
    }

    @Override
    public int getColumnCount() {
      return 5;
    }

    @Override
    public Object getValueAt(int row, int column) {
      Clientes clientes = (Clientes) lista.get (row);
      
      if(column == 0){
          return clientes.getIdcliente();
      }
      if(column == 1){
          return clientes.getNome();
      }
      if(column == 2){
          return clientes.getCpf();
      }
      if(column == 3){
          return clientes.getRg();
      }
      if(column == 4){
          return clientes.getEmail();
      }
      return null;
    }
    
@Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "ID";
            case 1: return "Nome";
            case 2: return "CPF";
            case 3: return "RG";
            case 4: return "Email";
            
        }
     return null;
}
}
