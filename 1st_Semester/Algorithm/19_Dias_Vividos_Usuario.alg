algoritmo "Exercício12"
// Função Calcular a quantidade de dias vividos por uma pessoa,
//a partir da quantidade de anos que ela forneça
// Autor : William Santos
// Professor Luiz Zanetti
// Data : 8/23/2018 FATEC/ADS 1º Semestre

var
   years, days: inteiro
   decision: caracter
inicio
      Enquanto (decision <> "N") faca
      escreva ("How old are you: ")
      leia (years)
      days <- years * 365
      
      escreval ("You have lived for", days, " days")
      escreva ("Do you want to calcule once more? [Y] [N]: ")
      leia (decision)
      FimEnquanto
fimalgoritmo
