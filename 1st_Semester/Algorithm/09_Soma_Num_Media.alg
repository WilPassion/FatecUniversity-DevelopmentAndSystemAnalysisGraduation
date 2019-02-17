algoritmo "Exercício3"
// Função : Receber N números digitados pelo usuário e
// quando o usuário não quiser mais continuar
// dando entrada nos números apresentar a soma
// total dos números digitados e a média
// Autor : William Santos
// Professor Luiz Zanetti
// Data : 8/20/2018 FATEC/ADS 1º Semestre

var
   num, soma, media: real
   contador: inteiro
   decisao: caracter
inicio
      contador <- 0
      soma <- 0
      Enquanto (decisao <> "N") faca
      escreva ("Digite o número um número: ")
      leia (num)
      soma <- soma + num
      contador <- contador + 1
      escreva ("Deseja continuar digitando? [S] [N]: ")
      leia (decisao)
      FimEnquanto
      
      media <- soma / contador
      escreval ("A soma dos números digitados é ", soma)

      escreval ("A media dos números digitados é ", media:5:2)
fimalgoritmo
