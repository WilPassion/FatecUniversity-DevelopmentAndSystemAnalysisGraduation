algoritmo "Contagem500a100"
// Fun��o : Apresentar os n�meros entre 500 e 100 com
// intervalo de 5 n�meros.
// Autor : William Santos
// Data : 9/20/2018
var
   contador: inteiro
   decisao: caracter
inicio
      Repita
      contador <- 500
      Repita
          escreval (contador)
          contador <- contador - 5
      Ate (contador < 105)
      escreval (contador)
      escreva ("Deseja continuar contando? [S] [N]: ")
      leia (decisao)
      Ate (decisao <> "S")
fimalgoritmo
