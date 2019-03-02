/*
Lote01 - Exercício 13
Objetivo: Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
*/

import javax.swing.JOptionPane;
public class Lote01_Exercicio_13 {
    public static void main (String args[]){
        
        double qtdade_alimento, alimento_gramas;
        double dias;
        
        qtdade_alimento = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alimentos em Kg: "));
        alimento_gramas = qtdade_alimento * 1000; 
        dias = alimento_gramas/50;
        
        JOptionPane.showConfirmDialog(null,"O alimento vai durar " + dias + "dias");
    }    
}
