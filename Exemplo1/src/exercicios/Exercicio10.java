
package exercicios;

import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main (String [] args) {
    int n1, n2, media, media10;
    
     n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro numero"));
     n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo numero"));
      
     media = (n1+n2)/2;
     JOptionPane.showMessageDialog(null, "A media dos numeros é: "+media );
     media10 = media*10;
     JOptionPane.showMessageDialog(null,  "A media vezes 10 é: "+media10);
   
     
     
    }
}
