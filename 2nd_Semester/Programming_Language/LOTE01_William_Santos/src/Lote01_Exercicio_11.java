/*
 ------------------------------------------------------------------
Lote01 - Exercício 11
Objetivo: Receba o raio de uma circunferência. Calceule e mostre o comprimento
da circunferência.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 
import javax.swing.JOptionPane;

public class Lote01_Exercicio_11 {
    public static void main (String args[])
    {
        double raio;
        double comp;
        
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da circunferência: "));
        
        comp = 2 * Math.PI * raio;
        
        JOptionPane.showMessageDialog(null, "O comprimento da cincunferência é: " + String.format("%.2f", comp));
        
    }    
    
}
