/*
 ------------------------------------------------------------------
Lote01 - Exercício 17
Objetivo:  Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 


import javax.swing.JOptionPane;

public class Lote01_Exercicio_17 
{
    
    public static void main (String args[])
    {
        double vel_media, tempo;
        double litros_gasolina, litros_gastos;
        int decisao;        
        
        vel_media = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média [Km/h]: "));
        decisao = Integer.parseInt(JOptionPane.showInputDialog("A viagem levou minutos ou horas para ser concluída [Minutos = 1] [Horas = 2]: "));       
       
        switch(decisao){
            case 1: tempo = (Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de percurso em minutos: "))/60);
                litros_gasolina = vel_media / tempo;
                litros_gastos = litros_gasolina/12;
                JOptionPane.showMessageDialog(null, "Será consumido " + litros_gastos + "litros de gasolina");   
                break;    
            case 2 : tempo = (Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de percurso em minutos: ")));
                litros_gasolina = vel_media / tempo;
                litros_gastos = litros_gasolina/12;
                JOptionPane.showMessageDialog(null, "Será consumido " + litros_gastos + "litros de gasolina");
                break;
            default: JOptionPane.showMessageDialog(null,"Opção inválida");
                break;
        }
    }
}
