
import javax.swing.JOptionPane;

/*
 ------------------------------------------------------------------
Lote01 - Exercício 14
Objetivo: Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 

import javax.swing.JOptionPane;

public class Lote01_Exercicio_14 {
    
    public static void main (String args[]){
        
        double ang1, ang2, ang3;
        
        ang1 = Double.parseDouble(JOptionPane.showInputDialog("     CÁLCULO ÂNGULO TRIÂGULO \n\nEntre com o valor do primeiro ângulo: "));        
        ang2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do segundo ângulo: "));
        
        ang3 = 180 - ang1 - ang2;
        
        JOptionPane.showMessageDialog(null, "O valor do terceiro ângulo é " + ang3);
    }
}

