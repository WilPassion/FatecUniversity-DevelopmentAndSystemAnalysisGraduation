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
public class Lote01_Exercicio_21 {
    public static void main (String args[]){
        double nota, media;
        double soma_nota = 0;
        int i, cont;      
       
        cont = 1;                
        for (i = 0; i <4; i++){
            nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + cont + "º nota: "));
            soma_nota += nota;
            cont++;
        }   
        
        media = soma_nota / i;
        
        if (media >=6){            
            JOptionPane.showMessageDialog(null,"APROVADO");
        }
        else if (media >=3 && media <6){
            JOptionPane.showConfirmDialog(null,"EXAME");
        }
        else {
            JOptionPane.showMessageDialog(null,"REPROVADO");
        }
    } 
       
}
