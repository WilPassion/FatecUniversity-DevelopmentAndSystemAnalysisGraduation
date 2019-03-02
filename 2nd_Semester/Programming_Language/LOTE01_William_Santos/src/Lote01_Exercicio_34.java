/*
 ------------------------------------------------------------------
Lote01 - Exercício 34
Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 

import javax.swing.JOptionPane;
public class Lote01_Exercicio_34 
{
    public static void main (String args[])
    {
        int num;
        int i, result;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("TABUADA\n\n Digite o número na qua você deseja a tabuada: "));
        
        for (i = 0; i < 11; i++)
            
        {
            result = num * i;
            System.out.println(num + "x" + i + " = " + result);
        }
    }
    
}
