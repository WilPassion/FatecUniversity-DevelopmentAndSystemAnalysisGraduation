algoritmo "C�lculoAumentoSal�rio"
// Fun��o : Calcular o aumento de sal�rio do usu�rio com entrada do sal�rio atual mais a porcentagem de aumento
// Autor : William Santos
//Professor Luiz Zanetti
// Data : 8/24/2018 FATEC/ADS 1� Semestre

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
      //Sa�da
      escreval ("Novo sal�rio � R$",sn:5:2)
      escreval ("O aumento foi de R$",aumento:5:2)
fimalgoritmo
