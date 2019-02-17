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
public class Lote01_Exercicio_19 {
    public static void main (String args[]){
        double num1, num2;
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        
        if (num1 > num2){
            JOptionPane.showConfirmDialog(null,"O maior número digitado é: " + num1);
        }
        else{
            JOptionPane.showConfirmDialog(null,"O maior número digitado é: " + num2);
        }
    }    
}
