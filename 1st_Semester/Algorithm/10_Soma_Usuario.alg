algoritmo "SomaNumeros"
// Função : Somar N números digitados pelo usuário e
//apresentar a quantidade de números digitados e
//a soma dos números digitados.
// Autor : William Santos
// Professor Luiz Zanetti
// Data : 8/20/2018 FATEC/ADS 1º Semestre

var
   num, soma, contador: real
   vezes, qtdadeNum: inteiro
  inicio
          escreva ("Digite quantos numeros deseja somar: ")
          leia (vezes)
      Enquanto (vezes > 0) faca
          escreva ("Digite o valor para a soma: ")
          leia (num)
          soma <- soma + num
          vezes <- vezes - 1
          qtdadeNum <- qtdadeNum + 1
      FimEnquanto
      
      escreval ("A soma dos números é: ", soma)
      escreval ("Total de números digitados: ", qtdadeNum)
fimalgoritmo
