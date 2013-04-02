package programa;


public class Programa {

  
    public static void main(String[] args) {
        
        //Cria a conta
        Conta minhaConta;
        minhaConta = new Conta();
       // Conta minhaConta = new Conta();
        
        Conta outraConta = new Conta();
        
        Cliente c = new Cliente();
        minhaConta.titular = c;
        outraConta.titular = c;
        minhaConta.titular.cpf = "000.999.777.000";
        
        //alterar valores da conta por atribuição
        minhaConta.titular.dono = "Duke";
        minhaConta.saldo = 1000.0;
        System.out.println("Cliente: "+minhaConta.titular.dono+
                " \n\tSaldo atual: " + minhaConta.saldo);
        
        outraConta.titular.dono = "Ana";
        outraConta.saldo = 100000.0;
        System.out.println("Cliente: "+outraConta.titular.dono+
                " \n\tSaldo atual: " + outraConta.saldo);
        //sacar um valor x
        minhaConta.sacar(200);
        System.out.println(minhaConta.saldo);
        outraConta.sacar(12000);
        System.out.println(outraConta.saldo);
        //depositar
        minhaConta.depositar(500);
        System.out.println(minhaConta.saldo);
        
        //sacar verificando o saldo
        
        if (minhaConta.verificarSaldo(1400)){
            System.out.println("Consegui sacar");
        } else{
            System.out.println("Não consegui sacar");
        }
        System.out.println("Novo Saldo: "+minhaConta.saldo);
    
      /*  minhaConta = outraConta;
        if (minhaConta == outraConta){
            System.out.println("SAO IGUAIS");
        }else
            System.out.println("NAO SAO IGUAIS");
    }*/
        
    
    minhaConta.transferir(outraConta, 200);
    
    System.out.println("Minha Conta: "+minhaConta.saldo
            +"Outra Conta: "+outraConta.saldo);
    }  
}
