/*
 ------------------------------------------------------------------
Lote01 - Exercício 23
Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente
em ordem. Mostre os 4 números em ordem crescente.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 


import javax.swing.JOptionPane;

public class Lote01_Exercicio_23
{
    public static void main (String args[])
    {
        int num1, num2, num3, num4;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro maior que o anterior: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro maior que o anterior: "));
        num4 = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro de sua escolha: "));
        
        if (num4<num1)
        {
            JOptionPane.showMessageDialog(null, num4 + " > " + num1 + " > " + num2 + " > " + num3);
        }
        else if (num4<num2)
        {
            JOptionPane.showMessageDialog(null, num1 + " > " + num4 + " > " + num2 + " > " + num3);
        }
        else if (num4<num3)
        {
            JOptionPane.showMessageDialog(null, num1 + " > " + num2 + " > " + num4 + " > " + num3);
        }
        else
        {
            JOptionPane.showMessageDialog(null, num1 + " > " + num2 + " > " + num3 + " > " + num4);
        }
    }
}
