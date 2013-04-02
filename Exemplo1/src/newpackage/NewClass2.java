/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class NewClass2 {
        public static void main(String[] args) {
        
        double n1,n2,n3,ress;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um segundo número diferente dos demais"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um terceiro número diferente dos demais"));

       if (n1 != n2 && n1 != n3 && n2 != n3) {
                JOptionPane.showMessageDialog(null, "--mostrar resultado descrescente--");
        } else {
                JOptionPane.showMessageDialog(null, "Informe numeros diferentes");
            }
}
}
