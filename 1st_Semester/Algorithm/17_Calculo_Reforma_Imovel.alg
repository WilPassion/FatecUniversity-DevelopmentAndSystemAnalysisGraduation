algoritmo "Exerc�cio11"
// Fun��o : Calcular o custo total da m�o de obra de uma reforma
// que ser� realizada no seu apartamento. O pedreiro
// cobra R$ 10,00 a hora e o pintor R$ 8,00. Dados: total
// de horas que ser�o utilizados pelo pedreiro e o total de
// horas que ser�o utilizados pelo pintor
// Autor : William Santos
// Professor Luiz Zanetti
// Data : 8/23/2018 FATEC/ADS 1� Semestre

var
   horasPedreiro, horasPintor: inteiro
   totalReforma: real
   decisao: caracter
inicio
      Enquanto (decisao <> "N") faca
      escreva ("Qual o total de horas que ser� utilizado pelo pedreiro para a reforma? ")
      leia (horasPedreiro)
      escreva ("Qual o total de horas que ser� utilizado pelo pintor para a reforma? ")
      leia(horasPintor)
      
      totalReforma <- (horasPedreiro * 10) + (horasPintor * 8)
      
      escreval ("O total da reforma � R$" , totalReforma:5:2)
      escreva ("Desejar efetuar mais um c�lculo? [S] [N]: ")
      leia (decisao)
      FimEnquanto
fimalgoritmo
