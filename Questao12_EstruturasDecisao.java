/*
 * Questão 12 - Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o
 * sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. 
 * O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
 *    Desconto do IR:
 *        Salário Bruto até 900 (inclusive) - isento
 *        Salário Bruto até 1500 (inclusive) - desconto de 5%
 *        Salário Bruto até 2500 (inclusive) - desconto de 10%
 *        Salário Bruto acima de 2500 - desconto de 20% 
 * 
 * Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
        Salário Bruto: (5 * 220)        : R$ 1100,00
        (-) IR (5%)                     : R$   55,00  
        (-) INSS ( 10%)                 : R$  110,00
        FGTS (11%)                      : R$  121,00
        Total de descontos              : R$  165,00
        Salário Liquido                 : R$  935,00

 */

import java.util.Scanner;

public class Questao12_EstruturasDecisao {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double horasTrabalhadas;
    double valorHora;

    System.out.println("Favor informar o valor por hora trabalhada: ");
    valorHora = input.nextDouble();

    System.out.println("E quantas horas foram trabalhadas no mês? ");
    horasTrabalhadas = input.nextDouble();

    input.close();

    double salarioBruto = valorHora * horasTrabalhadas;

    double descontoSindicato = 0.03 * salarioBruto;
    double valorFGTS = 0.11 * salarioBruto;

    double descontoIR, valorDescontoIR;
    double porcentagemDescontoIR;

    // Calculo do desconto do IR
    if (salarioBruto <= 900) {
      descontoIR = 0;
    } else if ((salarioBruto > 900) && (salarioBruto <= 1500)) {
      descontoIR = 0.05;
    } else if ((salarioBruto > 1500) && (salarioBruto <= 2500)) {
      descontoIR = 0.1;
    } else {
      descontoIR = 0.2;
    }

    porcentagemDescontoIR = descontoIR * 100;

    valorDescontoIR = descontoIR * salarioBruto;

    double descontoTotal = valorDescontoIR + descontoSindicato;

    double salarioLiquido = salarioBruto - descontoTotal;

    System.out.printf("Salário Bruto: (%.1f * %.1f)        : R$ %.2f\n", horasTrabalhadas, valorHora, salarioBruto);
    System.out.printf("(-) IR (%.0f%%)                      : R$ %.2f\n", porcentagemDescontoIR, valorDescontoIR);
    System.out.printf("(-) Sindicato (3%%)                  : R$ %.2f\n", descontoSindicato);
    System.out.printf("FGTS (11%%)                          : R$ %.2f\n", valorFGTS);
    System.out.printf("Total de descontos                  : R$ %.2f\n", descontoTotal);
    System.out.printf("Salário Liquido                     : R$ %.2f\n", salarioLiquido);

  }
}
