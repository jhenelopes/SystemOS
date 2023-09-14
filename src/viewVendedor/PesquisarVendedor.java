/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewVendedor;


import bean.Vendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jhene
 */
public class PesquisarVendedor extends AbstractTableModel {
private List lista;


public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    
}
public Vendedor getVendedor (int row){
    return (Vendedor) lista.get(row);
}

    @Override
    public int getRowCount() {
         return lista.size();
    }

    @Override
   public int getColumnCount() {
       return 5;
    }

    
    public Object getValueAt(int row, int column) {
     Vendedor vendedor = (Vendedor) lista.get (row);
      
      if(column == 0){
          return vendedor.getMatricula();
      }
      if(column == 1){
          return vendedor.getNome();
      }
      if(column == 2){
          return vendedor.getCpf();
      }
      if(column == 3){
          return vendedor.getRg();
      }
      if(column == 4){
          return vendedor.getTituloEleitor();
      }
      return null;
    }
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Matricula";
            case 1: return "Nome";
            case 2: return "Cpf";
            case 3: return "Rg";
            case 4: return "Titulo de eleitor";
            
        }
     return null;
}

}
