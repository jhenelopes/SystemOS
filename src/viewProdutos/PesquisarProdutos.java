/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewProdutos;

import bean.Produto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jhene
 */
public class PesquisarProdutos extends AbstractTableModel{
private List lista;

public void setList(List lista){
    this.lista = lista;
        this.fireTableDataChanged();
    
}
public Produto getProduto (int row){
    return (Produto) lista.get(row);
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
       Produto produto = (Produto) lista.get (row);
      
      if(column == 0){
          return produto.getCodigo();
      }
      if(column == 1){
          return produto.getNome();
      }
      if(column == 2){
          return produto.getValor();
      }
      if(column == 3){
          return produto.getOrigem();
      }
      if(column == 4){
          return produto.getMarca();
      }
      return null;
    }
    
@Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "codigo";
            case 1: return "nome";
            case 2: return "Valor";
            case 3: return "Origem";
            case 4: return "Marca";
            
        }
     return null;
}
}

   
    

