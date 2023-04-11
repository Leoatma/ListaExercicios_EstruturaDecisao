/*
 * Questao 04 - Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
 */

import java.util.Scanner;

public class Questao04_EstruturasDecisao {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String letra;

    System.out.println("Favor digite uma letra: ");
    letra = input.next().toLowerCase();

    input.close();

    switch (letra) {

      case "a", "e", "i", "o", "u":
        System.out.printf("A letra %s é uma vogal.\n", letra);
        break;
      default:
        System.out.printf("A letra %s é uma consoante. \n", letra);

    }

  }
}
