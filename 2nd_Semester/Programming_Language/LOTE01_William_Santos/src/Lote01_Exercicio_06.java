/*
 ------------------------------------------------------------------
Lote01 - Exercício 06
Objetivo: Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 

import javax.swing.JOptionPane;

public class Lote01_Exercicio_06 {
    public static void main (String args[])
    {
        int x, y, aux;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valoe de y" ));   
        
        aux = x;
        x = y;
        y = aux;
        
        JOptionPane.showMessageDialog(null,"Valor de X = " +x + " Valor de Y = " +y );
    }
}