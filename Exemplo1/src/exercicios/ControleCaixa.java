

package exercicios;

import javax.swing.JOptionPane;


public class ControleCaixa {
    public static void main (String [] args) {
        String data, tipo=null;
        double caixaInicial, entrada, saida, totalEntradas=0, totalSaidas=0, caixaFinal=0;
       
        data = JOptionPane.showInputDialog(null, "Informe a data ");
        caixaInicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o caixa inicial"));
        
        do{
            tipo = JOptionPane.showInputDialog(null, "Informe o tipo de movimentação, entrada ou saida");
                if (tipo.equals("entrada")) {
                    entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor da entrada"));
                totalEntradas+=entrada;
                }else if(tipo.equals("entrada")){
                   saida = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor da saida")); 
                   totalSaidas+=saida;
                }}while (!"fim".equals(tipo));
    
        
        caixaFinal = caixaInicial+(totalEntradas-totalSaidas);
        
        JOptionPane.showMessageDialog(null, data, "Data atual",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, totalEntradas,"Total de Entrada",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, totalSaidas, "Total de Saida",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, caixaFinal, "Caixa Atual",JOptionPane.INFORMATION_MESSAGE);

    
    
    }
   }

