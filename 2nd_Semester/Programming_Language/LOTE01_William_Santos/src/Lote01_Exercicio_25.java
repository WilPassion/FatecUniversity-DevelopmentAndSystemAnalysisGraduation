/*
 ------------------------------------------------------------------
Lote01 - Exercício 25
Objetivo:  Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos, 
sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 

//****INCOMPLETO**

import javax.swing.JOptionPane;

public class Lote01_Exercicio_25
{
    public static void main (String args[])
    {
        int hora_inicial, min_inicial;
        int hora_final, min_final;
        int TotalInicio, TotalFim, TotalJogo;
        int result_hora, result_min;
        
        hora_inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o hora inicial da partida: "));
        min_inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite minutos em que a partida iniciou: "));
        hora_final = Integer.parseInt(JOptionPane.showInputDialog("Digite o hora inicial da partida: "));
        min_final = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos em que a partida terminou: "));
        
        TotalInicio = (hora_inicial * 60) + min_inicial;
        TotalFim = (hora_final * 60) + min_final;
        
        if (TotalInicio > TotalFim)
        {
            TotalJogo = (1140 - TotalInicio) + TotalFim;
            result_hora = TotalJogo/60;
            result_min =  min_final%60;
            JOptionPane.showMessageDialog(null, "A duração do jogo foi de " + result_hora + " hora(s) e " + result_min + " minuto(s).");
        }        
        
    }
}
