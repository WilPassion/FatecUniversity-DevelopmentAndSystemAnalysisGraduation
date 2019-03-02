/*
Lote01 - Exercício 21
Objetivo: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
a.Se a média for >= 6,0 exibir “APROVADO”;
b.Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c.Se a média for < 3,0 exibir “RETIDO”.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
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
            JOptionPane.showMessageDialog(null,"RETIDO");
        }
    } 
       
}
