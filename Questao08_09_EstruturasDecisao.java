/*
 * Questão 08 - Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
 * Questão 09 - Faça um Programa que leia três números e mostre-os em ordem decrescente.

 */

import java.util.Scanner;

public class Questao08_09_EstruturasDecisao {
  public static void main(String[] args) {

    Scanner inputPreco = new Scanner(System.in);

    float precoProduto01, precoProduto02, precoProduto03;

    System.out.println("Favor informe o preço do produto 01: ");
    precoProduto01 = inputPreco.nextFloat();

    System.out.println("Favor informe o preço do produto 02: ");
    precoProduto02 = inputPreco.nextFloat();

    System.out.println("Favor informe o preço do produto 03: ");
    precoProduto03 = inputPreco.nextFloat();

    inputPreco.close();

    if ((precoProduto01 > precoProduto02) && (precoProduto01 > precoProduto03)) {
      if (precoProduto02 > precoProduto03) {
        System.out.printf("Compre o produto 03. Ele está mais barato: R$%f. \n", precoProduto03);
        System.out.printf("%f > %f > %f \n", precoProduto01, precoProduto02, precoProduto03);
      } else if (precoProduto02 < precoProduto03) {
        System.out.printf("Compre o produto 02. Ele está mais barato: R$%f. \n", precoProduto02);
        System.out.printf("%f > %f > %f \n", precoProduto01, precoProduto03, precoProduto02);

      }
    } else if ((precoProduto02 > precoProduto01) && (precoProduto02 > precoProduto03)) {
      if (precoProduto01 < precoProduto03) {
        System.out.printf("Compre o produto 01. Ele está mais barato: R$%f. \n", precoProduto01);
        System.out.printf("%f > %f > %f \n", precoProduto02, precoProduto03, precoProduto01);
      } else if (precoProduto03 < precoProduto01) {
        System.out.printf("Compre o produto 03. Ele está mais barato: R$%f. \n", precoProduto03);
        System.out.printf("%f > %f > %f \n", precoProduto02, precoProduto01, precoProduto03);
      }
    } else {
      if (precoProduto01 < precoProduto02) {
        System.out.printf("Compre o produto 01. Ele está mais barato: R$%f. \n", precoProduto01);
        System.out.printf("%f > %f > %f \n", precoProduto03, precoProduto02, precoProduto01);
      } else if (precoProduto02 < precoProduto01) {
        System.out.printf("Compre o produto 02. Ele está mais barato: R$%f. \n", precoProduto02);
        System.out.printf("%f > %f > %f \n", precoProduto03, precoProduto01, precoProduto02);

      }
    }

  }

}
