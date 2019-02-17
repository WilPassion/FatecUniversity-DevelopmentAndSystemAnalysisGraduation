    /*
     ------------------------------------------------------------------
    Lote01 - Exercício 12
    Objetivo: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.Programador: William Santos
    Professor: Ricardo Satoshi
    FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
     ------------------------------------------------------------------ 
    */ 
import javax.swing.JOptionPane;

public class Lote01_Exercicio_12 {
    public static void main (String args[]){
        int ano_nascimento, ano_atual; 
        int resultado;
        
        ano_nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento: "));
        ano_atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
        
        resultado = (ano_atual - ano_nascimento) + 17;
        
        JOptionPane.showMessageDialog(null, "Você terá " + resultado + " daqui a 17 anos =)");
        
    }
    
}
