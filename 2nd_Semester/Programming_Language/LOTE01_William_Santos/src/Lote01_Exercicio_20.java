/*
Lote01 - Exercício 20
Objetivo: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
*/
import javax.swing.JOptionPane;
public class Lote01_Exercicio_20 {
    public static void main (String args[]){
        double A, B, C;
        double delta, X1, X2;
        
        A = Double.parseDouble(JOptionPane.showInputDialog("EQUAÇÃO SEGUNDO GRAU \n\n Ax²+Bx+C=0\n Entre com o valor de A: "));
        B = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de B: "));
        C = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de C: "));
        
        delta = (B * B) - 4 * A * C;
        
        X1 = -B + Math.sqrt(delta);
        X2 = -B - Math.sqrt(delta);
        
        if (delta==0)
        {
            JOptionPane.showMessageDialog(null, "A equação contém apenas uma raiz real");
        }
        else if (delta>0)
        {   
            JOptionPane.showMessageDialog(null, "A equação contém duas raízes reais.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "A equação não contém raízes reais");
        }
    } 
       
}