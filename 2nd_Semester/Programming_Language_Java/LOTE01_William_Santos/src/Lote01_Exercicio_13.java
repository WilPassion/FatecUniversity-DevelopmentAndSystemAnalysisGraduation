
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laboratorio101
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
