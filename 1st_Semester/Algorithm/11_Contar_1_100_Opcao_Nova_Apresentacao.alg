algoritmo "Exercício4"
// Função :  Apresentar os números de 1 até 100, com a opção de uma nova apresentação.
// Autor : William Santos
// Professor Luiz Zanetti

// Data : 8/20/2018 FATEC/ADS 1º Semestre
var
   contador: inteiro
   decisao: caracter
inicio
      Enquanto (decisao <> "N") faca
         contador <- 1
         contador <- contador + 1
         escreval (contador)
      Enquanto (contador < 100) faca
         contador <- contador + 1
         escreval (contador)
      FimEnquanto
         escreval ("Deseja apresentar os números novamente? [S] [N] ")
         leia (decisao)
      FimEnquanto
      fimalgoritmo
