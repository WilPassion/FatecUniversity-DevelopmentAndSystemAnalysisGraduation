/*
Objetivo: Somar N números digitados pelo usuário e apresentar a quantidade de números digitados e a soma dos números digitados.
Professor: Paulo Zanetti/ Referência: Exercicios ALP | FATEC ADS/1ºSemestre; 
Programador: William Santos
*/

import javax.swing.JOptionPane;
public class SomarNnumerosSaida_QtdadeNumDigitados {
    public static void main (String args []){
        int num1, num2;
        int decisao, num_decisao;
                
        num1 = Integer.parseInt(JOptionPane.showInputDialog("SOMA\n\n Digite o primeiro número para a soma: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("SOMA\n\n Digite o segundo número para a soma: "));
                
        int soma = num1 + num2;
        int vezes = 2;
        
        decisao = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar somando? [1-Sim] [2-Não]"));
        
        if(decisao != 1 && decisao != 2 )
        {
            JOptionPane.showMessageDialog(null, "Opção inválida");
        }
        else if (decisao == 2)
        {
            JOptionPane.showMessageDialog(null, "Total da soma = " + soma + "\n\n Foram digitados " + vezes + " números para o cálculo da somatória");
        }
        else 
        {
            while(decisao == 1)
            {
                num_decisao = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número para a soma: "));
                soma = soma + num_decisao;
                vezes += 1;
                decisao = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar somando? [1-Sim] [2-Não]")); 
                JOptionPane.showMessageDialog(null, "Soma = " + soma);
            }
            JOptionPane.showMessageDialog(null, "Total da soma = " + soma + "\n\n Foram digitados " + vezes + " números para o cálculo da somatória");

        }
                           
    }    
    
}
