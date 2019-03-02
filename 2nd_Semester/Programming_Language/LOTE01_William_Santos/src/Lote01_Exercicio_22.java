/*
 ------------------------------------------------------------------
Lote01 - Exercício 22
Objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 


import javax.swing.JOptionPane;

public class Lote01_Exercicio_22{
    public static void main (String args[])
    {
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor diferente do primeiro digitado: "));
        
        if (num1>num2)
        {
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + num2 + ">" + num1);            
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + num1 + ">" + num2);
        }
        
    }
}
