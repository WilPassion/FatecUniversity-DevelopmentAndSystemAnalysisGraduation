algoritmo "Exercicio9"
// Função :  Solicitar ao usuário dois números e realizar as quatro
// operações matemáticas.
// Autor : William Santos
// Professor Luiz Zanetti
// Data : 8/22/2018 FATEC/ADS 1º Semestre

var
   num1, num2: real
   soma, subt, mult, divi: real
   decisao: caracter
inicio
      Enquanto (decisao <> "N") faca
      escreval ("Digite dois números: ")
      leia (num1, num2)
      
      soma <- num1 + num2
      subt <- num1 - num2
      mult <- num1 * num2
      divi <- num1 / num2
      
      escreval ("O resultado da soma dos números é: ", soma)
      escreval ("O resultado da subtração dos números é: ", subt)
      escreval ("O resultado da multiplicação dos números é: ", mult:5:2)
      escreval ("O resultado da divisão dos números é: ", divi:5:2)
      escreva ("Deseja continuar os cálculos? [S][N]: ")
      leia (decisao)
      FimEnquanto
fimalgoritmo
