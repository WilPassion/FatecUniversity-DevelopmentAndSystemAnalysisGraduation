/*
Objetivo: Calcular o custo total da mão de obra de uma reforma que será realizada no seu apartamento.
O pedreiro cobra R$ 10,00 a hora e o pintor R$ 8,00. Dados: total de horas que serão utilizados pelo 
pedreiro e o total de horas que serão utilizados pelo pintor.
Professor: Paulo Zanetti/ Referência: Exercicios ALP | FATEC ADS/1ºSemestre; 
Programador: William Santos
*/


import javax.swing.JOptionPane;
public class CustoMaodeObraReforma_PintorPedreiro {
    public static void main(String args[]){
        int horaPintor, horaPedreiro ;
        double total;
        
        horaPintor = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas serão necessárias para finalizar a pintura? ")) *8;
        horaPedreiro = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas serão necessárias para finalizar a reforma? ")) *10;
        total = horaPintor + horaPedreiro;
        
        JOptionPane.showMessageDialog(null, "Valor pintura: " + horaPintor + "\n Valor reforma pedreiro: " + horaPedreiro  + "\n Valor total da mão de obra: " + String.format("%.2f", total));
        
    }
}
