/*
 ------------------------------------------------------------------
Lote01 - Exercício 19
Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 
import javax.swing.JOptionPane;
public class Lote01_Exercicio_19 {
    public static void main (String args[]){
        double num1, num2;
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        
        if (num1 > num2)
        {
            JOptionPane.showMessageDialog(null,"O maior número digitado é: " + num1);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"O maior número digitado é: " + num2);
        }
    }    
}
