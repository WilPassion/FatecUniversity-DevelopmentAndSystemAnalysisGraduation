/*
 ------------------------------------------------------------------
Lote01 - Exercício 29
Objetivo: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 

import javax.swing.JOptionPane;
public class Lote01_Exercicio_29 {
    public static void main (String args[]){
        int decisao;
        double valor, result;
        
        valor = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do investimento: "));
        decisao = Integer.parseInt(JOptionPane.showInputDialog("Entre com o tipo de investimento [1 = Poupança] [2 = Renda Fixa]: "));
        
        while(decisao != 1 && decisao != 2)
        {
            JOptionPane.showMessageDialog(null, "Opção inválida");
            decisao = Integer.parseInt(JOptionPane.showInputDialog("Entre com o tipo de investimento [1 = Poupança] [2 = Renda Fixa]: "));
        }
        if (decisao == 1)
        {
            result = valor * 1.03;
            JOptionPane.showMessageDialog(null, "Valor corrigido: R$" + String.format("%.2f", result));
        }
        else 
        {
            result = valor * 1.05;
            JOptionPane.showMessageDialog(null, "Valor corrigido: R$" + String.format("%.2f", result));
        }
    }
    
}
