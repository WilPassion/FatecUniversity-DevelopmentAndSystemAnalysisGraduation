algoritmo "Exerc�cio4"
// Fun��o :  Apresentar os n�meros de 1 at� 100, com a op��o de uma nova apresenta��o.
// Autor : William Santos
// Professor Luiz Zanetti

// Data : 8/20/2018 FATEC/ADS 1� Semestre
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
         escreval ("Deseja apresentar os n�meros novamente? [S] [N] ")
         leia (decisao)
      FimEnquanto
      fimalgoritmo
