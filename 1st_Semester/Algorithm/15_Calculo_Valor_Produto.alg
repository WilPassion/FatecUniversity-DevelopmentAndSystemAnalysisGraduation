algoritmo "Exerc�cio8"
// Fun��o : Calcular o valor do produto sabendo-se que: o
// pre�o final � composto pelo custo do material mais
// do valor das horas trabalhadas e com uma adi��o
// de 8% de lucro
// Autor : William Santos
// Professor Luiz Zanetti
// Data : 8/22/2018 FATEC/ADS 1� Semestre

var
   material, horasT, valorProd, lucro: real
   decisao: caracter
inicio
      Enquanto (decisao <> "N") faca
      escreva ("Digite o valor gasto em materias: ")
      leia (material)
      escreva ("Digite o valor das horas trabalhadas para fabrica��o do produto: ")
      leia (horasT)
      
      lucro <- (material + horasT) * 0.08
      valorProd <- material + horasT + lucro
      
      escreval ("O pre�o final do produto � R$", valorProd:5:2)
      escreva ("Deseja calcular o valor de outro produto? [S] [N]: ")
      leia (decisao)
      FimEnquanto
fimalgoritmo
