/*
 ------------------------------------------------------------------
Lote01 - Exercício 18
Objetivo:  Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 

import javax.swing.JOptionPane;

public class Lote01_Exercicio_18
{
    public static void main (String args[])
    {
        int num1, num2;
        int dif;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
        if (num1 >= num2)
        {
            dif = num1 - num2;
        }
        else 
        {
            dif = num2 - num1;
        }
        JOptionPane.showMessageDialog(null, "A diferença do maior valor pelo menor é " + dif);
    }
}
