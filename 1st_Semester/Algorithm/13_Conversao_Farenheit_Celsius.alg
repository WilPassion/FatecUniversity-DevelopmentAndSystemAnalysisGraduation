algoritmo "Exerc�cio6"
// Fun��o : Convers�o de graus Farenheit para Celsius
// sabendo-se que a f�rmula para convers�o �:
// C = 5/9 * (F �32)
// Autor : William Santos
// Professor Luiz Zanetti
// Data : 8/20/2018 FATEC/ADS 1� Semestre

var
   celsius, farenheit: real
   decisao: caracter
inicio
      Repita
      escreva ("Digite a temperatura em Farenheit para a convers�o: ")
      leia (farenheit)
      celsius <- 5/9 * (farenheit - 32)
      escreval ("O resultado �",celsius:5,"�C")
      escreva ("Deseja continuar? [S] [N]: ")
      leia (decisao)
      Ate (decisao = "N")
fimalgoritmo
