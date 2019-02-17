algoritmo "Exercício6"
// Função : Conversão de graus Farenheit para Celsius
// sabendo-se que a fórmula para conversão é:
// C = 5/9 * (F –32)
// Autor : William Santos
// Professor Luiz Zanetti
// Data : 8/20/2018 FATEC/ADS 1º Semestre

var
   celsius, farenheit: real
   decisao: caracter
inicio
      Repita
      escreva ("Digite a temperatura em Farenheit para a conversão: ")
      leia (farenheit)
      celsius <- 5/9 * (farenheit - 32)
      escreval ("O resultado é",celsius:5,"ºC")
      escreva ("Deseja continuar? [S] [N]: ")
      leia (decisao)
      Ate (decisao = "N")
fimalgoritmo
