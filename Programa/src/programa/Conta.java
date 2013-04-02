package programa;


public class Conta {
    private int numero;
    private double saldo;
    private double limite;
    private Cliente titular;
    
    void sacar(double quantidade){
        this.saldo -= quantidade;
    }
    
    void depositar(double quantidade){
        this.saldo += quantidade;
    }
    
    boolean verificarSaldo(double quantidade){
        if(this.saldo < quantidade){
            return false;
        }else {
            this.saldo -= quantidade;
            return true;
        }
    }
    
    boolean transferir(Conta destino, double valor){
       boolean retirou = this.verificarSaldo(valor);
       if (retirou == false){
           System.out.println("Nao foi possivel sacar");
           return false;
       } else {
           destino.depositar(valor);
           return(true);
       }
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
     public void setSaldo(double saldo){
        this.saldo = saldo;
    }
     
      public double getLimite(){
        return this.limite;
    }
      
       public void setLimite(double limite){
        this.limite = limite;
    }
       
        public Cliente getTitular(){
        return this.titular;
    }
        
         public void setTitular(Cliente titular){
        this.titular = titular;
    }
         
   
    
}