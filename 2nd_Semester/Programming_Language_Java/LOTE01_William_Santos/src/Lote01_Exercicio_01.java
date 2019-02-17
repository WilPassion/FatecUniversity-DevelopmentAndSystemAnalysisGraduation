/*
 ------------------------------------------------------------------
Lote01 - Exercicio 01
Objetivo: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------
 */ 

import javax.swing.JOptionPane;

public class Lote01_Exercicio_01 {
    public static void main (String args[])
    {
        double lado, area;
        
        lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado do quadrado: "));
        
        area =  lado * lado;
        
        JOptionPane.showMessageDialog(null, "A area do quadrado é: " +area);
    }          
    
    
}
