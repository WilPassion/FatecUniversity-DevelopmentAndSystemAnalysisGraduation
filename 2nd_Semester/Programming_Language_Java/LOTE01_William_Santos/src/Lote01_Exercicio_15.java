/*
 ------------------------------------------------------------------
Lote01 - Exercício 15
Objetivo: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 

import javax.swing.JOptionPane;

public class Lote01_Exercicio_15 {
    public static void main (String args[])
    {
        double cateto1, cateto2, hipotenusa;
        
        cateto1 = Double.parseDouble(JOptionPane.showInputDialog("  CÁLCULO HIPOTENUSA\n TRIÂNGULO RETÂNGULO\n\n Digite o primeiro cateto: "));
        cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo cateto: "));
        
        hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
        
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é " + String.format("%.2f", hipotenusa));
        
    }
}

