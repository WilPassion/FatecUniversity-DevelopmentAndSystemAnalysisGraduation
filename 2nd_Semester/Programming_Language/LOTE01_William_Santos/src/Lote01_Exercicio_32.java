/*
 ------------------------------------------------------------------
Lote01 - Exercício 32
Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial..
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 

import javax.swing.JOptionPane;

public class Lote01_Exercicio_32 
{
    public static void main (String args[])
    {
        int num, fat, i;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("FATORIAL\n\n Entre com um número:"));            
        
        fat = 1;
        i = 1;
        
        while(i <= num)
        {
            fat = fat * i;
            i++;
        }
        JOptionPane.showMessageDialog(null, "O Fatorial de " + num + "! = " + fat);
    }
}
