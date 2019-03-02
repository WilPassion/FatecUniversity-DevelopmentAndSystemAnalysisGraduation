/*
Objetivo: Receber N números digitados pelo usuário e quando o usuário não quiser mais continuar dando entrada nos números apresentar a soma total dos números digitados e a média.
Professor: Paulo Zanetti/ Referência: Exercicios ALP | FATEC ADS/1ºSemestre; 
Programador: William Santos
*/


import javax.swing.JOptionPane;
public class SomarNnumerosSaida_QtdadeNumDigitados_Media {
    public static void main (String args []){
        int num1, num2;
        int decisao, num_decisao;
                
        num1 = Integer.parseInt(JOptionPane.showInputDialog("SOMA\n\n Digite o primeiro número para a soma: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("SOMA\n\n Digite o segundo número para a soma: "));
                
        int soma = num1 + num2;
        int vezes = 2;
        int media = 0;
        
        decisao = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar somando? [1-Sim] [2-Não]"));
        
        if(decisao != 1 && decisao != 2 )
        {
            JOptionPane.showMessageDialog(null, "Opção inválida");
        }
        else if (decisao == 2)
        {   
            
            media = soma / vezes;
            JOptionPane.showMessageDialog(null, "Total da soma = " + soma + "\n\n Foram digitados " + vezes + " números para o cálculo da somatória \n Média valores digitados: " + media);
        }
        else 
        {
            while(decisao == 1)
            {
                num_decisao = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número para a soma: "));
                soma = soma + num_decisao;
                vezes += 1;
                media = soma / vezes;
                decisao = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar somando? [1-Sim] [2-Não]")); 
                JOptionPane.showMessageDialog(null, "Soma = " + soma);
            }
            JOptionPane.showMessageDialog(null, "Total da soma = " + soma + "\n\n Foram digitados " + vezes + " números para o cálculo da somatória \n Média valores digitados: " + media);

        }
                           
    }    
    
}