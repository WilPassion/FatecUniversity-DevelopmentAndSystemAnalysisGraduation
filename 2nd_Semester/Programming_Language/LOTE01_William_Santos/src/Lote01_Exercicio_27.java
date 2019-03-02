/*
 ------------------------------------------------------------------
Lote01 - Exercício 27
Objetivo:  Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos).
Calcule e mostre a velocidade média em km/h.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 

import javax.swing.JOptionPane;

public class Lote01_Exercicio_27 
{
    public static void main (String args[])
    {
        
        double circuito, voltas, tempo, vel_media, distancia;
        
        circuito = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito em metros: "));
        voltas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de voltas no circuito: "));
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Quanto tempo foi necessário para completar as voltas [minutos]: "))/60;
        
        distancia = (circuito * voltas) / 1000;
        vel_media = distancia / tempo;
        
        JOptionPane.showMessageDialog(null, "A velocidade média foi de: " + vel_media + "Km/h");
    }
}
