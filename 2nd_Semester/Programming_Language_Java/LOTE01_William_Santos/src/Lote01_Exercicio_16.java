/*
 ------------------------------------------------------------------
Lote01 - Exercício 16
Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. 
Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto).
A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 

import javax.swing.JOptionPane;

public class Lote01_Exercicio_16 
{
    public static void main (String args[])
    {
        double valor_hora, desconto;
        int qtdade_horas, descendentes;
        double proventos, descontos, sal_liquido;
        
        qtdade_horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
        valor_hora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora trabalhadas: "));
        proventos = qtdade_horas * valor_hora;
        
        descontos = Double.parseDouble(JOptionPane.showInputDialog("Digite a o percentual de desconto: "));
        descendentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de descendentes que possui: "));
        
        sal_liquido = proventos - descontos + (100*descendentes);
        
        JOptionPane.showMessageDialog(null,"O salário líquido é " + String.format("%.2f", sal_liquido));
    }
}


