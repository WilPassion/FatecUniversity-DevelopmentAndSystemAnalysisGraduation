algoritmo "ConsumoEnergiaElétrica"
// Função : Calcular consumo de energia elétrica
// Autor : William Santos
//Professor Luiz Zanetti
// Data : 8/28/2018 FATEC/ADS 1º Semestre

var
   totalquilowatts: real
   valorquilowatts: real
   ICMS: real
   valorTotal: real

inicio
      escreva ("Digite o consumo de quilowatts do mês: ")
      leia (totalquilowatts)
      
      valorquilowatts <- totalquilowatts * 0.12
      ICMS <- valorquilowatts * 0.18
      valorTotal <- ICMS + valorquilowatts
      escreva ("O valor a ser pago da energia elétrica é R$",valorTotal:5:2)
fimalgoritmo
