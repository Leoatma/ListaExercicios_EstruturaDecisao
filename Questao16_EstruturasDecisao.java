/*
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica2_Atividade16
 * Descrição: Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. 
 * O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
 *    - Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
 *    - Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
 *    - Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
 *    - Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
 * 
 * Data: 12/04/2023
 */

import java.util.Scanner;

public class Questao16_EstruturasDecisao {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double valor_a, valor_b, valor_c;
    double delta, raiz1, raiz2;

    System.out.println("Informe o valor A: ");
    valor_a = input.nextDouble();

    if (valor_a == 0) {

      System.out.println("Como não existe valor A, não é um equação do segundo grau. ");

    } else {

      System.out.println("Informe o valor B: ");
      valor_b = input.nextDouble();

      System.out.println("Informe o valor C: ");
      valor_c = input.nextDouble();
      input.close();

      delta = (valor_b * valor_b) - (4 * valor_a * valor_c);

      if (delta < 0) {
        System.out.println("A equação não possui raízes reais. ");
      } else if (delta == 0) {
        double raizUnica = -valor_b / (2 * valor_a);
        System.out.printf("A equação só possui uma raiz, sendo raiz = %.1f. \n", raizUnica);
      } else {
        raiz1 = (-valor_b) + Math.sqrt(delta) / (2 * valor_a); // sqrt = 'Squase root' == raiz quadrada
        raiz2 = (-valor_b) - Math.sqrt(delta) / (2 * valor_a);
        System.out.printf("Raiz 1 = %.1f, Raiz2 = %.1f.%n", raiz1, raiz2);
      }
    }

  }
}
