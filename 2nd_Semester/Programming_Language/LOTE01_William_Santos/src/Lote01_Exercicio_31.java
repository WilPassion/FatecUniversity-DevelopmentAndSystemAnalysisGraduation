/*
 ------------------------------------------------------------------
Lote01 - Exercício 31
Objetivo: Calcule e mostre o quadrado dos números entre 10 e 150.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 

import javax.swing.JOptionPane;
public class Lote01_Exercicio_31 
{
    public static void main (String args[])
    {
        int i = 11, quadrado;
        
        while(i < 151)
        {
            quadrado = i * i;
            System.out.println("Quadrado de " + i + " = " + quadrado);
            i++;
        }        
    }    
}
