algoritmo "ConversãoHorasem Minutos"
// Função : Converter a quantidade de horas de entrada digitadas pelo usuário para minuutos
// Autor : William Santos
// Professor Luiz Zanetti
// Data : 8/24/2018 FATEC/ADS 1º Semestre

var
   horas: inteiro
   conversao: real
inicio
      //Linhas entrada de dados
      escreva ("Digite a o número de horas: ")
      leia (horas)
      //Processamento
      conversao <- horas * 60
      //Saída
      escreval ("Os minutos são:", conversao)
fimalgoritmo
