/*
 *  Questao 01. Faça um Programa que peça dois números e imprima o maior deles.
    Questao 02. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
 */

import java.util.Scanner;

public class Questao01_02_EstruturasDecisao {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int numero01, numero02;
    float valor;

    // Solicitando os numeros e valor
    System.out.println("Por favor informe um número inteiro: ");
    numero01 = input.nextInt();

    System.out.println("Digite o segundo inteiro: ");
    numero02 = input.nextInt();

    System.out.println("Agora, informe um valor positivo ou negativo: ");
    valor = input.nextFloat();

    input.close();

    // Imprimindo o maior número
    if (numero01 > numero02) {
      System.out.println("O maior número é " + numero01 + ".");
    } else if (numero02 > numero01) {
      System.out.println("O maior número é " + numero02 + ".");
    } else {
      System.out.printf("Os números são iguais: (%d = %d).\n", numero01, numero02);
    }

    // imprimindo se o valor é positivo ou negativo
    if (valor > 0) {
      System.out.printf("O valor %f é positivo. \n", valor);
    } else if (valor < 0) {
      System.out.printf("O valor %f é negativo. \n", valor);
    } else {
      System.out.printf("Por favor, informe um valor diferente de zero. \n");
    }

  }

}
