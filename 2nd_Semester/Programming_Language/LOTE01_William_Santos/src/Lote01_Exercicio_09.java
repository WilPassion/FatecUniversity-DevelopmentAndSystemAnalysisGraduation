/*
 ------------------------------------------------------------------
Lote01 - Exercício 09
Objetivo: Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 
import javax.swing.JOptionPane;

public class Lote01_Exercicio_09 {
    public static void main (String args[])
    {
        Integer a, b;
        Integer soma_quadrados;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("SOMA QUADRADOS\n\nDigite um número: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        
        soma_quadrados = (a * a) + (b * b);
        
        JOptionPane.showMessageDialog(null, "A soma dos quadrados dos números é: " + soma_quadrados);
    }
    
}
