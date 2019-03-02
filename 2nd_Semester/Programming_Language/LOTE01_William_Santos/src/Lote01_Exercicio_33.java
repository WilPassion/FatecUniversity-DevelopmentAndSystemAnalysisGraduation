/*
 ------------------------------------------------------------------
Lote01 - Exercício 33
Objetivo: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 

//****INCOMPLETO**

import javax.swing.JOptionPane;
public class Lote01_Exercicio_33
{
    public static void main (String args[]){
        int num, i, antecessor;
        String valorFixo = "1 + 1/";
        String valorFixo2 = "1 + ";
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Série 1 + 1/2 + 1/3 + ... + 1/N \n\n Digite um número: "));
        
        if(num != 0)
        {
            for(i = 2; i <= num; i++)
            {
                antecessor = i;
                
            }
        }
    }
    
}
