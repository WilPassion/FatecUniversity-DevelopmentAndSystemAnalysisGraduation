algoritmo "CálculoAumentoSalário"
// Função : Calcular o aumento de salário do usuário com entrada do salário atual mais a porcentagem de aumento
// Autor : William Santos
//Professor Luiz Zanetti
// Data : 8/24/2018 FATEC/ADS 1º Semestre

var
   sa: real
   porcent: real
   aumento: real
   sn: real
inicio
      //Linhas entrada de dados
      escreva ("Digite o salario: ")
      leia (sa)
      escreva ("Digite a porcentagem de aumento: ")
      leia (porcent)
      //Processamento
      aumento <- sa/100 * porcent
      sn <- sa + aumento
      //Saída
      escreval ("Novo salário é R$",sn:5:2)
      escreval ("O aumento foi de R$",aumento:5:2)
fimalgoritmo
