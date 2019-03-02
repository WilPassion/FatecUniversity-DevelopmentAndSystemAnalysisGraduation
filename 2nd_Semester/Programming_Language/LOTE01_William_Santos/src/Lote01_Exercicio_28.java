/*
 ------------------------------------------------------------------
Lote01 - Exercício 28
Objetivo: Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
Venda Mensal	  Preço Atual	   Preço Novo
< 500	             < 30	     +10%
>= 500 e < 1000	   >= 30 e < 80	     +15%
>= 1000	>= 80	                     +5%
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 

import javax.swing.JOptionPane;

public class Lote01_Exercicio_28 
{
    public static void main (String args[])
    {
        double venda, preco_atual;
        double preco_novo;
       
        venda = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de vendas do produto: "));
        preco_atual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto: "));
        
        if (venda<500 && preco_atual<30)
        {
            preco_novo = preco_atual * 1.10;
            JOptionPane.showMessageDialog(null, "O novo preço do produto é R$" + String.format("%.2f", preco_novo));
        }
        else if (venda >= 500 && venda < 1000 && preco_atual >=30 && preco_atual < 80)
        {
            preco_novo = preco_atual * 1.15;
            JOptionPane.showMessageDialog(null, "O novo preço do produto é R$" + String.format("%.2f", preco_novo));
        }
        else if (venda >= 100 && preco_atual >=80)
        {
            preco_novo = preco_atual * 1.05;
            JOptionPane.showMessageDialog(null, "O novo preço do produto é R$" + String.format("%.2f", preco_novo));
        }
        else 
        {
            preco_novo = preco_atual;
            JOptionPane.showMessageDialog(null, "O preço do produto não sofreu alteração: R$" + String.format("%.2f", preco_novo));
        }
    }
}
