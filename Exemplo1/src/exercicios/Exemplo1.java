
package exercicios;

import javax.swing.JOptionPane;


public class Exemplo1 {
   
    
    public static void main (String [] args) {
        
        int n1, n2, resultado1;
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo numero"));
        
        resultado1 = n1+n2;
        
        JOptionPane.showMessageDialog(null, resultado1);
       
        
        
        
        
        
        
           
         int resultado2, num, impares;    
         num = 7;
            for (int i = 0; i<=10; i++){
                resultado2 = i * num;
                System.out.println(resultado2);
            }
            
            impares = 1;            
            while(impares<50){
                System.out.println(impares);
                impares +=2;
    }                   
  }    
}
