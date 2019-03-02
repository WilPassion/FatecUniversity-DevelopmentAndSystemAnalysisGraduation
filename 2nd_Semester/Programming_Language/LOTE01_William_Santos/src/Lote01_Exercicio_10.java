/*
 ------------------------------------------------------------------
Lote01 - Exercício 10
Objetivo: Receba 2 números reais. Calcule e mostre a diferença desses valores.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 

import javax.swing.JOptionPane;

public class Lote01_Exercicio_10 {
    public static void main (String args[])
    {
        double num1, num2;
        double dif;
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
        
        
        if (num1 > num2)
        {
            dif = num1 - num2;
            JOptionPane.showMessageDialog(null, "A diferença entre os números é: " + dif);
        }
        if (num1 == num2)
        {
            JOptionPane.showMessageDialog(null, "Números iguais! ");            
        }
        else 
        {
            dif = num2 - num1;
            JOptionPane.showMessageDialog(null, "A diferença entre os números é: " + dif);
        }      
        
    }
    
}