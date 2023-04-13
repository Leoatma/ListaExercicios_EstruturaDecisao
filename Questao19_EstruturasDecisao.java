/*
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica2_Atividade19  
 * Descrição: Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
 * Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
 * 326 = 3 centenas, 2 dezenas e 6 unidades
 * 12 = 1 dezena e 2 unidades 
 * Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
 * 
 * Data: 13/04/2023
 */

import java.util.Scanner;

public class Questao19_EstruturasDecisao {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Favor, digite um número inteiro menor que 1000: ");
    int userNumber = input.nextInt();
    input.close();

    if ((userNumber < 1000) && (userNumber > 0)) {
      int centenas, dezenas, unidades;

      centenas = userNumber / 100;
      dezenas = (userNumber % 100) / 10;
      unidades = (userNumber % 100) % 10;

      if (centenas > 0) {
        System.out.printf("%d = %d centenas, %d dezenas e %d unidades.\n", userNumber, centenas, dezenas, unidades);
      } else if (dezenas > 0) {
        System.out.printf("%d = %d dezenas e %d unidades.\n", userNumber, dezenas, unidades);
      } else {
        System.out.printf("%d = %d unidades.\n", userNumber, unidades);
      }

    } else {
      System.out.println("Número inválido. Tente novamente.");
    }
  }
}
