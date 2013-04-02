

package banco;


public class Funcionario {
String nome;
String departamento;
String dataEnt;
String rg;
boolean estaEmpresa;
data dataDeEntrada;

        double salario;
        // seus outros atributos e métodos
        void bonifica(double aumento) {
        salario += aumento;
        }
          void mostrar() {
          System.out.println("Nome: " + this.nome);
          System.out.println("Departamento: " + this.departamento);
          System.out.println("Data de Entrada: " + this.dataEnt);
          System.out.println("RG: " + this.rg);
          System.out.println("Empresa: " + this.estaEmpresa);
          System.out.println("O funcionario foi admitido em: " + this.dataDeEntrada.dia+"/"+this.dataDeEntrada.mes+"/"+this.dataDeEntrada.ano);
          // imprimir aqui os outros atributos...
          }
          
        void demite() {
            if(estaEmpresa == false){
                estaEmpresa = true;
                 System.out.println(" O funcionario esta demitido ");
            }else{
                estaEmpresa=false;
                 System.out.println(" O funcionario nao esta demitido ");

                }
        }
          
          
      
  
            
            
          //  if (f1 == f2) {
          //  System.out.println("iguais");
          //  } else {
          //  System.out.println("diferentes");
          //  }
        
    
}
