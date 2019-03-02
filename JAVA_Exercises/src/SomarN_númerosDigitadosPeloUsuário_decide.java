/*
Objetivo: Somar dois números digitados pelo usuário, tendo como condição de saída uma pergunta do tipo Deseja continuar (s/n)?
Professor: Ricardo Satoshi
*/

import javax.swing.JOptionPane;
public class SomarN_númerosDigitadosPeloUsuário_decide {
    public static void main(String args[]){
        int num1, num2;
        int decisao, num_decisao;
                
        num1 = Integer.parseInt(JOptionPane.showInputDialog("SOMA\n\n Digite o primeiro número para a soma: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("SOMA\n\n Digite o segundo número para a soma: "));
                
        int soma = num1 + num2;
        
        decisao = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar somando? [1-Sim] [2-Não]"));
        
        switch(decisao)
        {
            case 1: while (decisao == 1)
                    {
                        num_decisao = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número para a soma: ")); 
                        soma += num_decisao;
                        JOptionPane.showMessageDialog(null, "Resultado da soma = " + soma);
                        decisao = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar somando? [1-Sim] [2-Não]"));    
                    }
                    break;                
            case 2: JOptionPane.showMessageDialog(null, "Total = " + soma);            
                     break;
                
            default: JOptionPane.showMessageDialog(null, "Opção inválida!");
                       break;    
                
        }                    
    }
}
