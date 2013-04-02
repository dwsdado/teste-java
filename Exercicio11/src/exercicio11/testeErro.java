/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio11;

/**
 *
 * @author aluno
 */
public class testeErro {
    public static void main(String[] args) {
    System.out.println("inicio do main");
    metodo1();
    System.out.println("fim do main");
    }
    
    //inicio do metodo 1
    static void metodo1() {
    System.out.println("inicio do metodo1");
    metodo2();
    System.out.println("fim do metodo1");
    }
    
    //inicio do metodo 2
    static void metodo2() {
    System.out.println("inicio do metodo2");
    int[] array = new int[10];
        try {
    for (int i = 0; i <= 15; i++) {
    array[i] = i;
    System.out.println(i);
    }
    } catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("erro: " + e);
    }
    
    System.out.println("fim do metodo2");
    }
    

}
