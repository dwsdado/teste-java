
package novoconta;


public class Conta {
    protected double saldo;
    protected double saldoInicial;
    protected double limite;
    void deposita(double valor) {
        this.saldoInicial = this.saldo;
        this.saldo += valor;
     }
        void saca(double valor) {
        this.saldo -= valor;
        }
        double getSaldo() {
        
        return this.saldo;
        }
        
        void atualiza(double taxa) {
            this.saldo += this.saldo * taxa;
        }
}

