
package banco;


public class Banco {

  
       public static void main(String[] args) {
            Funcionario f1 = new Funcionario();

            f1.nome = "Fiodor t";
            f1.salario = 100;
            f1.bonifica(50);

            System.out.println("Nome:" + f1.nome);
            System.out.println("salario atual:" + f1.salario);
            
            
            data data = new data(); // ligação!
          
            f1.dataDeEntrada = data;          
            f1.dataDeEntrada.dia=12;
            f1.dataDeEntrada.mes=02;
            f1.dataDeEntrada.ano=2000;
            
            
            Funcionario f2 = new Funcionario();{
                f2.nome = "Fiodorindononicorossor";
                f2.salario = 100;
                
                System.out.println("Nome:" + f2.nome);
                System.out.println("salario atual:" + f2.salario);
            }
            
     f1.mostrar();

            }
    }

