algoritmo "ConsumoEnergiaEl�trica"
// Fun��o : Calcular consumo de energia el�trica
// Autor : William Santos
//Professor Luiz Zanetti
// Data : 8/28/2018 FATEC/ADS 1� Semestre

var
   totalquilowatts: real
   valorquilowatts: real
   ICMS: real
   valorTotal: real

inicio
      escreva ("Digite o consumo de quilowatts do m�s: ")
      leia (totalquilowatts)
      
      valorquilowatts <- totalquilowatts * 0.12
      ICMS <- valorquilowatts * 0.18
      valorTotal <- ICMS + valorquilowatts
      escreva ("O valor a ser pago da energia el�trica � R$",valorTotal:5:2)
fimalgoritmo
