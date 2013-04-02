/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicios;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Exercicio9 {
    
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);

int n = 5; // tamanho do vetor
int v1[] = new int[n]; // declaração do vetor "v"
int v2[] = new int[n];
int i; // índice ou posição


// Entrada de Dados
for (i=0; i<n; i++) {
v1[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
}

for (i=0; i<n; i++) {
if(v1[i]==0){
v2[i]= 1;
} else {

v2[i] = v1[i];

}
}
for (i=0; i<n; i++) {
System.out.println(v1[i]);
}

for (i=0; i<n; i++) {
System.out.println(v2[i]);
}

}
}