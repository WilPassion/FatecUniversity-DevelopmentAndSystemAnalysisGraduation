algoritmo "Convers�oHorasem Minutos"
// Fun��o : Converter a quantidade de horas de entrada digitadas pelo usu�rio para minuutos
// Autor : William Santos
// Professor Luiz Zanetti
// Data : 8/24/2018 FATEC/ADS 1� Semestre

var
   horas: inteiro
   conversao: real
inicio
      //Linhas entrada de dados
      escreva ("Digite a o n�mero de horas: ")
      leia (horas)
      //Processamento
      conversao <- horas * 60
      //Sa�da
      escreval ("Os minutos s�o:", conversao)
fimalgoritmo
