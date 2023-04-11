/*
 * Questão 06 - Faça um Programa que leia três números e mostre o maior deles.
 * Questão 07 - Faça um Programa que leia três números e mostre o maior e o menor deles.
 */

import java.util.Scanner;

public class Questao06_07_EstruturasDecisao {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    float numero1, numero2, numero3;

    System.out.println("Favor informe o número 01: ");
    numero1 = input.nextFloat();

    System.out.println("Favor informe o número 02: ");
    numero2 = input.nextFloat();

    System.out.println("Favor informe o número 03: ");
    numero3 = input.nextFloat();

    input.close();

    if ((numero1 > numero2) && (numero1 > numero3)) {
      if (numero2 > numero3) {
        System.out.printf("O maior número é %f, e o menor %f.%n", numero1, numero3);
      } else {
        System.out.printf("O maior número é %f, e o menor %f.%n", numero1, numero2);
      }
    } else if ((numero1 < numero2) && (numero2 > numero3)) {
      if (numero1 > numero3) {
        System.out.printf("O maior número é %f, e o menor %f.%n", numero2, numero3);
      } else {
        System.out.printf("O maior número é %f, e o menor %f.%n", numero2, numero1);
      }
    } else {
      if (numero2 > numero1) {
        System.out.printf("O maior número é %f, e o menor %f.%n", numero3, numero1);
      } else {
        System.out.printf("O maior número é %f, e o menor %f.%n", numero3, numero2);
      }
    }

  }
}
