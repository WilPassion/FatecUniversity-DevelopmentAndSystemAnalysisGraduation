algoritmo "Exerc�cio7"
// Fun��o : Uma empresa deseja conceder um reajuste de
// sal�rio aos seus funcion�rios. O percentual do
// reajuste � de 12%. A empresa necessita saber
// quanto ser� o total do reajuste (apenas o aumento)
// e, o total a ser pago com os novos sal�rios.
// Autor : William Santos
// Professor Luiz Zanetti
// Data : 8/22/2018 FATEC/ADS 1� Semestre

var
   numFunc, contador: inteiro
   sal, totalReaj, reajuste, totalPag, somaSal: real
inicio
      escreval ("----------------------------------")
      escreval ("        REAJUSTE SALARIAL         ")
      escreval ("----------------------------------")
      escreva ("Digite o n�mero de funcion�rios: ")
      leia (numFunc)

      contador <- 1
      Enquanto (numFunc > 0) faca
          escreva ("Digite o sal�rio do ", contador, "� funcion�rio: ")
          leia (sal)
          reajuste <- sal * 0.12
          totalReaj <- reajuste + totalReaj
          somaSal <- somaSal + sal
          totalPag <- somaSal + totalReaj
          contador <- contador +1
          numFunc <- numFunc -1
      FimEnquanto
      
      escreval ("O valor do reajuste foi de R$", totalReaj:5:2)
      escreva ("O valor total dos sal�rios a ser pago � R$", totalPag:5:2)
fimalgoritmo
