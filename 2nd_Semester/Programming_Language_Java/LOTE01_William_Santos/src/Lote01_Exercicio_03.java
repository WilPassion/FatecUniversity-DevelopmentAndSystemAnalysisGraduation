/*
 ------------------------------------------------------------------
Lote01 - Exercício 03
Objetivo: Receba a base e a altura de um triangulo. Calcule e mostr sua area.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 

import javax.swing.JOptionPane;

public class Lote01_Exercicio_03 {
    public static void main (String args[])
    {
        double base, altura;
        double area;

        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triangulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triangulo: "));
        
        area = base * altura;
        
        JOptionPane.showMessageDialog(null, "A area do triangulo e: " +area);
    }
}