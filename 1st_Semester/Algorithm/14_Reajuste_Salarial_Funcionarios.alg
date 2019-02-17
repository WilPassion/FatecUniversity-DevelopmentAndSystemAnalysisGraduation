algoritmo "Exercício7"
// Função : Uma empresa deseja conceder um reajuste de
// salário aos seus funcionários. O percentual do
// reajuste é de 12%. A empresa necessita saber
// quanto será o total do reajuste (apenas o aumento)
// e, o total a ser pago com os novos salários.
// Autor : William Santos
// Professor Luiz Zanetti
// Data : 8/22/2018 FATEC/ADS 1º Semestre

var
   numFunc, contador: inteiro
   sal, totalReaj, reajuste, totalPag, somaSal: real
inicio
      escreval ("----------------------------------")
      escreval ("        REAJUSTE SALARIAL         ")
      escreval ("----------------------------------")
      escreva ("Digite o número de funcionários: ")
      leia (numFunc)

      contador <- 1
      Enquanto (numFunc > 0) faca
          escreva ("Digite o salário do ", contador, "º funcionário: ")
          leia (sal)
          reajuste <- sal * 0.12
          totalReaj <- reajuste + totalReaj
          somaSal <- somaSal + sal
          totalPag <- somaSal + totalReaj
          contador <- contador +1
          numFunc <- numFunc -1
      FimEnquanto
      
      escreval ("O valor do reajuste foi de R$", totalReaj:5:2)
      escreva ("O valor total dos salários a ser pago é R$", totalPag:5:2)
fimalgoritmo
