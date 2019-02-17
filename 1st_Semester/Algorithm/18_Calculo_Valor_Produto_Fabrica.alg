algoritmo "Exercício10"
// Função : O valor final de um produto é composto pelo: custo da
//fabricação e adicionando o percentual de ICMS.
//Apresentar o preço final. (Ex: para o custo de
//fabricação de 50.00 e o índice de 15% o valor final que
//deve ser apresentado é de 57.50)
// Autor : William Santos
// Data : 9/21/2018
var
   ICMS: inteiro
   valorFab, valorFinal, reajuste: real
   decisao: caracter
   
inicio
      Enquanto (decisao <> "N") faca
      escreva ("Digite o valor de fabricação do produto: ")
      leia (valorFab)
      escreva ("Digite o percentual de ICMS: ")
      leia (ICMS)
      
      reajuste <- valorFab * (ICMS / 100)
      valorFinal <- valorFab + reajuste
      
      escreval ("O valor final do produto é R$", valorFinal:5:2)
      escreva ("Deseja continuar? [S] [N]: ")
      leia (decisao)
      FimEnquanto
fimalgoritmo
