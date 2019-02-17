algoritmo "Exercício8"
// Função : Calcular o valor do produto sabendo-se que: o
// preço final é composto pelo custo do material mais
// do valor das horas trabalhadas e com uma adição
// de 8% de lucro
// Autor : William Santos
// Professor Luiz Zanetti
// Data : 8/22/2018 FATEC/ADS 1º Semestre

var
   material, horasT, valorProd, lucro: real
   decisao: caracter
inicio
      Enquanto (decisao <> "N") faca
      escreva ("Digite o valor gasto em materias: ")
      leia (material)
      escreva ("Digite o valor das horas trabalhadas para fabricação do produto: ")
      leia (horasT)
      
      lucro <- (material + horasT) * 0.08
      valorProd <- material + horasT + lucro
      
      escreval ("O preço final do produto é R$", valorProd:5:2)
      escreva ("Deseja calcular o valor de outro produto? [S] [N]: ")
      leia (decisao)
      FimEnquanto
fimalgoritmo
