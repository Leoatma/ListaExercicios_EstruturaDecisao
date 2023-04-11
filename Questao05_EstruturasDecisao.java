/*
 * Questão 05 - Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
 *     A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
 *     A mensagem "Reprovado", se a média for menor do que sete;
 *     A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */

import java.util.Scanner;

public class Questao05_EstruturasDecisao {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    float primeiraNota, segundaNota;

    System.out.println("Qual foi a primeira nota? ");
    primeiraNota = input.nextFloat();

    System.out.println("Informe a segunda nota: ");
    segundaNota = input.nextFloat();

    input.close();

    float mediaNotas = (primeiraNota + segundaNota) / 2;

    if (mediaNotas < 7.0) {
      System.out.printf("A média foi %f. Reprovado! \n", mediaNotas);
    } else if (mediaNotas == 10.0) {
      System.out.printf("A média foi %f. Aprovado com Distinção! \n", mediaNotas);
    } else {
      System.out.printf("A média foi %f. Aprovado! \n", mediaNotas);
    }
  }

}
