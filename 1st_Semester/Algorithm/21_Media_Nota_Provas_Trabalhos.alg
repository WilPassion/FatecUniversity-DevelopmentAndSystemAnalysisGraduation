algoritmo "Execício14"
// Função :
// Autor :
// Data : 9/24/2018
// Seção de Declarações 
var
   somaNota_Prova, notaProva: real
   somaNota_Trab, notaTrab, mediaFinal: real
   contador, provas, trabalhos: inteiro
inicio
      escreval ("      MEDIA FINAL      ")
      escreval ("")
      escreval ("******Provas******")
      provas <- 4
      contador <- 1
      somaNota_Prova <- 0
      Enquanto (provas > 0) faca
         escreva ("Digite a nota da", contador, "º prova: ")
         leia (notaProva)
         somaNota_Prova <- somaNota_Prova + notaProva
         provas <- provas -1
         contador <- contador +1
      FimEnquanto
      escreval ("")
      escreval ("******Trabalhos******")
      trabalhos <- 2
      contador <- 1
      somaNota_Trab <- 0
        Enquanto (trabalhos > 0) faca
         escreva ("Digite a nota do", contador, "º trabalho: ")
         leia (notaTrab)
         somaNota_Trab <- somaNota_Trab + notaTrab
         trabalhos <- trabalhos -1
         contador <- contador +1
      FimEnquanto

      mediaFinal <- ((somaNota_Prova / 4) * 0.65) + ((somaNota_Trab / 2) * 0.35)
      escreval ("")
      escreva ("A media e: ", mediaFinal:5:2)
fimalgoritmo
