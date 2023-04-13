/*
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica2_Atividade15
 * Descrição: Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. 
 * Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno. 
 * Dicas:
 *    - Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
 *    - Triângulo Equilátero: três lados iguais;
 *    - Triângulo Isósceles: quaisquer dois lados iguais;
 *    - Triângulo Escaleno: três lados diferentes;
 * 
 * Data: 12/04/2023
 */

import java.util.Scanner;

public class Questao15_EstruturasDecisao {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int ladoA, ladoB, ladoC;

    System.out.println("Informe o tamanho do ladoA: ");
    ladoA = input.nextInt();
    System.out.println("Agora digite o do ladoB: ");
    ladoB = input.nextInt();
    System.out.println("Informe o tamanho do ladoC: ");
    ladoC = input.nextInt();

    input.close();

    // Definindo condição para ser triângulo:
    // Se o lado maior é menor que a soma dos outros dois será triângulo
    boolean ladoA_Maior = (ladoA >= ladoB) && (ladoA >= ladoC) && (ladoA <= ladoB + ladoC);
    boolean ladoB_Maior = (ladoB >= ladoA) && (ladoB >= ladoC) && (ladoB <= ladoA + ladoC);
    boolean ladoC_Maior = (ladoC >= ladoA) && (ladoC >= ladoB) && (ladoC <= ladoB + ladoA);
    boolean triangulo = (ladoA_Maior || ladoB_Maior || ladoC_Maior); // acontecendo essa condiçao triangulo = true

    // Sendo triangulo, qual o tipo?
    if (triangulo == true) {

      if ((ladoA == ladoB) && (ladoB == ladoC)) {
        System.out.println("É um triângulo Equilátero");
      } else if ((ladoA != ladoB) && (ladoB != ladoC) && (ladoA != ladoC)) {
        System.out.println("É um triângulo Escaleno.");
      } else {
        System.out.println("É um triângulo Isósceles");
      }

    } else {
      System.out.println("Não é um triângulo.");
    }

  }
}
