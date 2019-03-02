/*
 ------------------------------------------------------------------
Lote01 - Exercício 04
Objetivo:  Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 

import javax.swing.JOptionPane;

public class Lote01_Exercicio_04 {
    public static void main (String args[])
    {
        double celsius, farenheit; 

        celsius = Double.parseDouble(JOptionPane.showInputDialog("Entre com a temperatura em graus Celsius: "));
        
        farenheit = (9*celsius + 160) /5;
        
        JOptionPane.showMessageDialog(null, "Resultado conversão: " +farenheit + " °F");
    }
}