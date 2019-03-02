/*
 ------------------------------------------------------------------
Lote01 - Exercício 24
Objetivo:  Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 


import javax.swing.JOptionPane;
public class Lote01_Exercicio_24 {
    public static void main (String args[]){
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        if (num%2 == 0 && num%3 == 0)
        {
            JOptionPane.showMessageDialog(null,"O número é divisível por 2 e 3");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, + num + " não é divisível por 2 e 3");
        }       
        
    } 
       
}