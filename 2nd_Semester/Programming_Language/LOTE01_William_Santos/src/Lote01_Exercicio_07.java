/*
 ------------------------------------------------------------------
Lote01 - Exercício 07
Objetivo: Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 

import javax.swing.JOptionPane;

public class Lote01_Exercicio_07 {
    public static void main (String args[])
    {
        double comprimento, largura, altura;
        double volume;
        
        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento em centímetros: "));
        largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura em centímetros: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite altura: "));
        
        volume = comprimento * largura * altura;
        
        JOptionPane.showMessageDialog(null, "Volume do paralelepípedo = " +volume + "cm³") ;        
    }
}
