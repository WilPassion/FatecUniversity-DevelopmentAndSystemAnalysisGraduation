algoritmo "SomaNumeros"
// Fun��o : Somar N n�meros digitados pelo usu�rio e
//apresentar a quantidade de n�meros digitados e
//a soma dos n�meros digitados.
// Autor : William Santos
// Professor Luiz Zanetti
// Data : 8/20/2018 FATEC/ADS 1� Semestre

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
      
      escreval ("A soma dos n�meros �: ", soma)
      escreval ("Total de n�meros digitados: ", qtdadeNum)
fimalgoritmo
