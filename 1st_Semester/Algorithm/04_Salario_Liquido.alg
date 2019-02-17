algoritmo "SalárioLíquido"
// Função : Calcular o salário líquido do funcionário sabendo que o salário
// líquido é constituído pela soma do salário mensal mais o valor das
// horas adicionais e, subtraindo 8% de INSS. No final, apresentar o
// salário líquido.
// Autor : William Santos
// Professor Luiz Zanetti
// Data : 8/27/2018 FATEC/ADS 1º Semestre

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
      //Saída
      escreval ("Salario líquido = R$",salLiquido:5:2)
fimalgoritmo
