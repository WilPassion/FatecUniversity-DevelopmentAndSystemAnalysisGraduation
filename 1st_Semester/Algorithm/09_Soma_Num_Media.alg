algoritmo "Exerc�cio3"
// Fun��o : Receber N n�meros digitados pelo usu�rio e
// quando o usu�rio n�o quiser mais continuar
// dando entrada nos n�meros apresentar a soma
// total dos n�meros digitados e a m�dia
// Autor : William Santos
// Professor Luiz Zanetti
// Data : 8/20/2018 FATEC/ADS 1� Semestre

var
   num, soma, media: real
   contador: inteiro
   decisao: caracter
inicio
      contador <- 0
      soma <- 0
      Enquanto (decisao <> "N") faca
      escreva ("Digite o n�mero um n�mero: ")
      leia (num)
      soma <- soma + num
      contador <- contador + 1
      escreva ("Deseja continuar digitando? [S] [N]: ")
      leia (decisao)
      FimEnquanto
      
      media <- soma / contador
      escreval ("A soma dos n�meros digitados � ", soma)

      escreval ("A media dos n�meros digitados � ", media:5:2)
fimalgoritmo
