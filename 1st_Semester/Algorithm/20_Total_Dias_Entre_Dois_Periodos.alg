algoritmo "Exercício13"
// Função : Calcular a quantidade de dias existentes entre dois
// anos digitados pelo usuário. Exemplo de dado de
// entrada: 2002 (AAAA)
// Autor : William Santos
// Professor Luiz Zanetti
// Data : 8/23/2018 FATEC/ADS 1º Semestre

var
   ano1, ano2, result: real
   decisao: caracter
inicio
      Enquanto (decisao <> "N") faca
      escreval ("Digite os anos (AAAA) para o cálculo de dias: ")
      leia (ano1, ano2)
      
      Se (ano1 > ano2) entao
         result <- (ano1 - ano2) * 365
      SeNao
         result <- (ano1 - ano2) * -(365)
      FimSe
      
      escreval ("A quantidade de dias entre o ano ", ano1, " e ", ano2, " é", result, " dias")
      escreva ("Deseja calcular novamente? [N] [S]: ")
      leia (decisao)
      FimEnquanto
fimalgoritmo
