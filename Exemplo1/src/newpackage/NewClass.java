
package newpackage;

import javax.swing.JOptionPane;


public class NewClass {
    
    public static void main(String[] args) {
        
        double n1,n2,soma,ress;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número"));
        soma = n1+n2;
        ress = 10 *(soma / 2);
        JOptionPane.showMessageDialog(null, ress);
        
    }         
}