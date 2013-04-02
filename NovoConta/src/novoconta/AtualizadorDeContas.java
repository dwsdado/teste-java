/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package novoconta;

/**
 *
 * @author aluno
 */
public class AtualizadorDeContas extends Conta{
    private double saldoTotal = 0;
    private double selic;
 
   
    
    AtualizadorDeContas(double selic) {
    this.selic = selic;
    }
    void roda(Conta c) {
       
    System.out.println("Saldo inicial: "+saldoInicial);       // aqui voce imprime o saldo anterior, atualiza a conta,   
    System.out.println("Novo saldo: "+super.getSaldo());
    
   saldoTotal+= super.limite + super.getSaldo();                               // e depois imprime o saldo final
    System.out.println("Saldo Total: "+saldoTotal);  // lembrando de somar o saldo final ao atributo saldoTotal
    }
    // outros métodos, colocar o getter para saldoTotal!
}
