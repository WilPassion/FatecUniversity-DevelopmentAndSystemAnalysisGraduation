algoritmo "Exercicio9"
// Fun��o :  Solicitar ao usu�rio dois n�meros e realizar as quatro
// opera��es matem�ticas.
// Autor : William Santos
// Professor Luiz Zanetti
// Data : 8/22/2018 FATEC/ADS 1� Semestre

var
   num1, num2: real
   soma, subt, mult, divi: real
   decisao: caracter
inicio
      Enquanto (decisao <> "N") faca
      escreval ("Digite dois n�meros: ")
      leia (num1, num2)
      
      soma <- num1 + num2
      subt <- num1 - num2
      mult <- num1 * num2
      divi <- num1 / num2
      
      escreval ("O resultado da soma dos n�meros �: ", soma)
      escreval ("O resultado da subtra��o dos n�meros �: ", subt)
      escreval ("O resultado da multiplica��o dos n�meros �: ", mult:5:2)
      escreval ("O resultado da divis�o dos n�meros �: ", divi:5:2)
      escreva ("Deseja continuar os c�lculos? [S][N]: ")
      leia (decisao)
      FimEnquanto
fimalgoritmo
