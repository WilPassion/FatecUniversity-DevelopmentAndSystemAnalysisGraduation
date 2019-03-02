/*
 ------------------------------------------------------------------
Lote01 - Exercício 02
Objetivo: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%. 
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------
 */ 

import javax.swing.JOptionPane;

public class Lote01_Exercicio_02 {
    public static void main (String args[])
    {            
        double salario, totalSal;
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario: "));     
        totalSal = salario + (salario * 0.15);
        
        JOptionPane.showMessageDialog(null, "O valor total do salário após reajuste: " +totalSal);        
    }
}
