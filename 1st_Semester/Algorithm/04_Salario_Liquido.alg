algoritmo "Sal�rioL�quido"
// Fun��o : Calcular o sal�rio l�quido do funcion�rio sabendo que o sal�rio
// l�quido � constitu�do pela soma do sal�rio mensal mais o valor das
// horas adicionais e, subtraindo 8% de INSS. No final, apresentar o
// sal�rio l�quido.
// Autor : William Santos
// Professor Luiz Zanetti
// Data : 8/27/2018 FATEC/ADS 1� Semestre

var
   salBruto: real
   horas: inteiro
   quantiaHorasExtras: real
   horasExtras: real
   totalExtras: real
   salLiquido: real
   INSS: real
inicio
      //Linhas entrada de dados
      escreva ("Salario bruto: ")
      leia (salBruto)
      escreva ("Horas trabalhadas/mes: ")
      leia (horas)
      escreva ("Horas extras trabalhadas: ")
      leia (quantiaHorasExtras)
      //Processamento
      horasExtras<- salBruto/100 * 0.50
      INSS <- salBruto/100 * 8
      totalExtras <- horasExtras * quantiaHorasExtras
      salLiquido <- salBruto - INSS + totalExtras
      //Sa�da
      escreval ("Salario l�quido = R$",salLiquido:5:2)
fimalgoritmo
