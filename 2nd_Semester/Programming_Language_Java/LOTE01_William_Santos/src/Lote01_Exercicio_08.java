/*
 ------------------------------------------------------------------
Lote01 - Exercício 08
Objetivo: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 

import javax.swing.JOptionPane;

public class Lote01_Exercicio_08 {    
    public static void main(String args[])
    {
        
        double deposito, montante;      
        
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Conta Poupança \n\nEntre com o valor de depósito: "));
        montante = deposito + (deposito * 0.013);
        
        JOptionPane.showMessageDialog(null, "Saldo total após 1 mês com rendimento de 1,3/mês: R$" + String.format("%.2f", montante));
    }        
    
}
