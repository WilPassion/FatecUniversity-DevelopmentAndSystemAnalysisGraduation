algoritmo "Exerc�cio10"
// Fun��o : O valor final de um produto � composto pelo: custo da
//fabrica��o e adicionando o percentual de ICMS.
//Apresentar o pre�o final. (Ex: para o custo de
//fabrica��o de 50.00 e o �ndice de 15% o valor final que
//deve ser apresentado � de 57.50)
// Autor : William Santos
// Data : 9/21/2018
var
   ICMS: inteiro
   valorFab, valorFinal, reajuste: real
   decisao: caracter
   
inicio
      Enquanto (decisao <> "N") faca
      escreva ("Digite o valor de fabrica��o do produto: ")
      leia (valorFab)
      escreva ("Digite o percentual de ICMS: ")
      leia (ICMS)
      
      reajuste <- valorFab * (ICMS / 100)
      valorFinal <- valorFab + reajuste
      
      escreval ("O valor final do produto � R$", valorFinal:5:2)
      escreva ("Deseja continuar? [S] [N]: ")
      leia (decisao)
      FimEnquanto
fimalgoritmo
