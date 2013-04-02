/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class notas {
      public static void main (String [] args) {
          
          int total50, total10, total5, total1;
          double totalDin, td50, td10, td5, td1, saque=1;
          int n50=0, n10=0, n5=0, n1=0, novo=0;
          
          JOptionPane.showMessageDialog(null, "Carregar dinheiro na máquina: ");
          
          total50 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de notas de 50: "));
          total10 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de notas de 10: "));
          total5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de notas de 5: "));
          total1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de notas de 1: "));
          
          td50 = total50*50;
          td10 = total10*10;
          td5 = total5*5;
          td1=total1*1;
          totalDin=td50 + td10 + td5 + td1;
          
          JOptionPane.showMessageDialog(null, "Maquina carregada com sucesso");
          JOptionPane.showMessageDialog(null, "Valor total em dinheiro: "+totalDin+"\nTotal em notas de 50: "+td50+"\nTotal em notas de 10: "+td10+"\nTotal em notas de 5: "+td5+"\nTotal em notas de 1: "+td1);
           
         
          while(novo==0 && totalDin > 0){
              saque =Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do saque?"));
              
              if(saque <= totalDin){
                  while(saque>=50 && td50!=0){
                      n50++;
                      total50--;
                      td50 -= 50;
                      saque -= 50;
                      totalDin -= 50;
                  }
                  while(saque>=10 && td10!=0){
                      n10++;
                      total10--;
                      td10 -= 10;
                      saque -= 10;
                      totalDin -= 10; 
                  }
                  while(saque>=5 && td5!=0){
                      n5++;
                      total5--;
                      td5 -= 5;
                      saque -= 5;
                      totalDin -= 5; 
                  }
                  while(saque>=1 && td1!=0){
                      n1++;
                      total1--;
                      td1 -= 1;
                      saque -= 1;
                      totalDin -= 1; 
                  }
                  if (saque == 0){
                      
                      JOptionPane.showMessageDialog(null, "Valor total em dinheiro: "+totalDin+"\nTotal em notas de 50: "+td50+"\nTotal em notas de 10: "+td10+"\nTotal em notas de 5: "+td5+"\nTotal em notas de 1: "+td1);
                      JOptionPane.showMessageDialog(null, "Foi necessario \n notas de 50: "+n50+"\n  notas de 10: "+n10+"\n notas de 5: "+n5+"\n notas de 1: "+n1);
                  }else{
                      JOptionPane.showMessageDialog(null,"Notas insuficientes, digite outro valor");
                  }
                  }else {
                  JOptionPane.showMessageDialog(null,"Valor nao disponivel para saque, tente um valor menor");
                  }
              n50=0;
              n10=0;
              n5=0;
              n1=0;
              if(totalDin >0){
              novo = JOptionPane.showConfirmDialog(null,"Deseja realizar um novo saque: ");
              } else{
                  novo = 1;
              }
              }
              
          }
      }
