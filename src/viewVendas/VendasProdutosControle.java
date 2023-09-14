/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewVendas;

import bean.VendasProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jhene
 */
public class VendasProdutosControle extends AbstractTableModel{
    List lstVendasProd;
    
    public void setList (List lstVendasProd){
        this.lstVendasProd = lstVendasProd;
        this.fireTableDataChanged();
    }
    
    public void addList (VendasProdutos vendasProdutos){
    this.lstVendasProd.add(vendasProdutos);
    this.fireTableDataChanged();
    }
    
    public void deleteList (int linha){
    lstVendasProd.remove(linha);
    this.fireTableDataChanged();
    }
    public VendasProdutos getList (int linha){
        return (VendasProdutos) lstVendasProd.get(linha);
    }
    


    @Override
    public int getRowCount() {
        return lstVendasProd.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int row, int column) {
    VendasProdutos vendasProdutos = (VendasProdutos) lstVendasProd.get (row);
      
       if(column == 0){
      return vendasProdutos.getIdvendasProdutos();
          
      }
      if(column == 1){
          return vendasProdutos.getProduto();
      }
      if(column == 2){
          return vendasProdutos.getQuantidade();
      }
       if(column == 3){
          return vendasProdutos.getValorunitario();
      }
        if(column == 4){
             //multiplicar  total = quantidade X valor 
        return vendasProdutos.getQuantidade()* vendasProdutos.getValorunitario();
      }
       
        return null;
    }
     

    public String getColumnName(int column) {
        switch (column) {
            case 0: return "ID Vendas";
            case 1: return "Produto";
            case 2: return "Quantidade";
            case 3: return "Valor unitário";
            case 4: return "Vendas";
            
        }
     return null;
}
    
}
