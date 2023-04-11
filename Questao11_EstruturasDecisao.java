/*
 * Questão 11 - As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.
 */

import java.util.Scanner;

public class Questao11_EstruturasDecisao {

  public static void main(String[] args) {

    Scanner inputSalario = new Scanner(System.in);

    double salarioSemReajuste;
    double reajusteTotal;
    double salarioReajustado;

    System.out.println("Informe o salário para o reajuste: ");
    salarioSemReajuste = inputSalario.nextDouble();
    inputSalario.close();

    double aumentoReal;
    double aumento1 = 0.2;
    double aumento2 = 0.15;
    double aumento3 = 0.1;
    double aumento4 = 0.05;

    double reajuste1 = salarioSemReajuste * aumento1;
    double reajuste2 = salarioSemReajuste * aumento2;
    double reajuste3 = salarioSemReajuste * aumento3;
    double reajuste4 = salarioSemReajuste * aumento4;

    if (salarioSemReajuste <= 280) {
      reajusteTotal = reajuste1;
      aumentoReal = aumento1 * 100;
    } else if ((salarioSemReajuste > 280) && (salarioSemReajuste <= 700)) {
      reajusteTotal = reajuste2;
      aumentoReal = aumento2 * 100;
    } else if ((salarioSemReajuste > 700) && (salarioSemReajuste <= 1500)) {
      reajusteTotal = reajuste3;
      aumentoReal = aumento3 * 100;
    } else {
      reajusteTotal = reajuste4;
      aumentoReal = aumento4 * 100;
    }

    salarioReajustado = salarioSemReajuste + reajusteTotal;

    System.out.printf(
        "\nO salario de %.2f recebeu um aumento de %.0f%%, o que equivale a R$%.2f. Assim o seu salário passará a ser R$%.2f.\n\n",
        salarioSemReajuste, aumentoReal, reajusteTotal, salarioReajustado);

  }
}
