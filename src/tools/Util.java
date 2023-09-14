/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author jhene
 */
public class Util {
    
 //var b = mycar instanceof Object;
 //jtextField = instanceof JTextField;
   
   public static void habilitar(boolean valor, JComponent ... componentes){
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);
            
        }
        
   }
   public static void limpar(JComponent ... componentes){
        for (int i = 0; i < componentes.length; i++) {
            
            if(componentes [i] instanceof JTextField){
            JTextField comp = (JTextField) componentes[i];
            comp.setText("");
        }
            
            if(componentes [i] instanceof JComboBox){
                JComboBox comp = (JComboBox) componentes[i];
            comp.setSelectedIndex(-1);
            }
            
            if(componentes [i] instanceof JCheckBox){
            JCheckBox comp = (JCheckBox) componentes[i];
            comp.setSelected(false);
            }
           if ( componentes [i] instanceof JFormattedTextField){
               JFormattedTextField comp = (JFormattedTextField) componentes [i];
               comp.setText("");
                        
        }
            if ( componentes [i] instanceof JPasswordField){
                JPasswordField comp = (JPasswordField) componentes [i];
                comp.setText("");
            }
        }
   }
   
   
   public static void mensagem(String msg){
       JOptionPane.showMessageDialog(null, msg);
   }
   public static boolean perguntar(String msg){
       return JOptionPane.showConfirmDialog(null,msg, "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
   }
   
   
   public static int strInt(String cad){
       return Integer.valueOf(cad);
    }
   public static String intStr(int num){
       return String.valueOf(num);
   }
   
   
   public static double strDouble(String cad){
     return Double.parseDouble(cad);
   }
    public static String doubleString(double num){
    return String.valueOf(num);
    }
    
    
    public static Date strDate(String cad){
      try{
      SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
      return (Date) formato.parse(cad);
  } catch(ParseException ex){
      System.out.println("erro na data:" + ex.getMessage());
  }
    return null;
    }
     public static String dateStri(Date data){
     SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
    return formato.format(data);
    }


}
