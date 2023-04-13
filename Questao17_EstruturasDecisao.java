/*
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica2_Atividade17
 * Descrição: Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto. 
 * Data: 12/04/2023
 */

import java.util.Scanner;

public class Questao17_EstruturasDecisao {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Para saber se é bissexto, informe o ano: ");
    int ano = input.nextInt();
    input.close();

    // é bissexto se:

    if ((ano % 4 == 0) && (ano % 100 != 0)) { // for multiplo de 4, mas não de 100
      System.out.println(ano + " é um ano bissexto.");

    } else if ((ano % 4 != 0) && (ano % 400 == 0)) { // não for multiplo de 4, mas for de 400
      System.out.println(ano + " é um ano bissexto.");

    } else { //
      System.out.println(ano + " não é um ano bissexto.");
    }

  }
}
