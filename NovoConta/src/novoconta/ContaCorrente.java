/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package novoconta;

/**
 *
 * @author aluno
 */
public class ContaCorrente extends Conta{
    void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    void deposita(double valor) {
        this.saldo += valor - 0.10;
    }
}
    

