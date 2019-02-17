algoritmo "Exercício11"
// Função : Calcular o custo total da mão de obra de uma reforma
// que será realizada no seu apartamento. O pedreiro
// cobra R$ 10,00 a hora e o pintor R$ 8,00. Dados: total
// de horas que serão utilizados pelo pedreiro e o total de
// horas que serão utilizados pelo pintor
// Autor : William Santos
// Professor Luiz Zanetti
// Data : 8/23/2018 FATEC/ADS 1º Semestre

var
   horasPedreiro, horasPintor: inteiro
   totalReforma: real
   decisao: caracter
inicio
      Enquanto (decisao <> "N") faca
      escreva ("Qual o total de horas que será utilizado pelo pedreiro para a reforma? ")
      leia (horasPedreiro)
      escreva ("Qual o total de horas que será utilizado pelo pintor para a reforma? ")
      leia(horasPintor)
      
      totalReforma <- (horasPedreiro * 10) + (horasPintor * 8)
      
      escreval ("O total da reforma é R$" , totalReforma:5:2)
      escreva ("Desejar efetuar mais um cálculo? [S] [N]: ")
      leia (decisao)
      FimEnquanto
fimalgoritmo
