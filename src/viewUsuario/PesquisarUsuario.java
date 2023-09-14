/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewUsuario;

//import bean.Usuario;
import bean.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jhene
 */
public class PesquisarUsuario extends AbstractTableModel{
    private List lista;

public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    
}
public Usuario getUsuario (int row){
    return (Usuario) lista.get(row);
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
       Usuario usuario = (Usuario) lista.get (row);
      
      if(column == 0){
          return usuario.getIdusuario();
      }
      if(column == 1){
          return usuario.getNome();
      }
      if(column == 2){
          return usuario.getCpf();
      }
      if(column == 3){
          return usuario.getNivel();
      }
      if(column == 4){
          return usuario.getAtivo();
      }
      return null;
    }
    
@Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "ID";
            case 1: return "Nome";
            case 2: return "CPF";
            case 3: return "Nivel";
            case 4: return "Ativo";
            
        }
     return null;
}
    
}
