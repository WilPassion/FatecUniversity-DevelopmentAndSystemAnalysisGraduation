/*
 ------------------------------------------------------------------
Lote01 - Exercício 26
Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 

import javax.swing.JOptionPane;

public class Lote01_Exercicio_26
{
    public static void main (String args[])
    {
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        
        if (num1>num2)
        {
            if (num1 % num2 == 0)
            {
                JOptionPane.showMessageDialog(null, "O primeiro valor é múltiplo do segundo");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "O primeiro valor não é múltiplo do segundo");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Primeiro valor inserido deve ser maior que o segundo!");

        }
    }
}
