/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import javax.swing.JComponent;

/**
 *
 * @author jhene
 */
public class Operacoes {
    public int soma(int ... numeros){
        int somatoria = 0;
        for (int i = 0; i < numeros.length; i++) {
            somatoria = somatoria + numeros[i];
            
        }
        return somatoria;
    }
    
   public int subtracao(int base,int...numeros){
        int subtracao = base;
        for (int i = 0; i < numeros.length; i++) {
            subtracao = subtracao - numeros[i];
            
        }
                return subtracao;
    }
   
  
   
   
   
    public static void main(String[] args) {
    Operacoes operacoes = new Operacoes();
     //   System.out.println("soma"+ operacoes.soma(42,68));
        System.out.println("subtração : "+ operacoes.subtracao(82,68,2));
    }
}

