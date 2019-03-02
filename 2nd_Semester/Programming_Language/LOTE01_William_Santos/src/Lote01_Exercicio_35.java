    /*
 ------------------------------------------------------------------
Lote01 - Exercício 35
Objetivo: Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e 
mostre o resultado da somatória dos números ímpares entre esses valores.
Programador: William Santos
Professor: Ricardo Satoshi
FATEC Zona Leste/ 2º Semestre ADS - Linguagem de Programação
 ------------------------------------------------------------------ 
*/ 
import javax.swing.JOptionPane;
public class Lote01_Exercicio_35 
{
    
    public static void main (String args[]){
        

        int num1, num2, aux;
        int somaImpar = 0;
        String result = "";
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro: "));    
             
        if(num1 == num2)
        {            
            result += "Os valores digitados são iguais. \n\n"; 
        }
        else if(num2 > num1)
        {
            result += "O maior valor digitado foi " + num2 + ".\n\n";
        }
        else
        {
            result += "O maior valor digitado foi " + num1 + ".\n\n";
            
            aux = num1;
            num1 = num2;
            num2 = aux;                       
        }
        
        for (aux = num1; aux < num2; aux++)
        {    
           
            if(aux % 2 == 1)
            {
                somaImpar = somaImpar + aux;
            }                      
        }
        
        result += "A soma dos números ímpares entre o intervalo de " + num1 + " e " + num2 + " = " + somaImpar;
        JOptionPane.showMessageDialog(null, result);
    }    
}
