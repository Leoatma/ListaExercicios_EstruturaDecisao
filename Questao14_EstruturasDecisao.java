
/*
 * Questão 14 - Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
 *   Média de Aproveitamento  Conceito
 *      Entre 9.0 e 10.0        A
 *      Entre 7.5 e 9.0         B
 *      Entre 6.0 e 7.5         C
 *      Entre 4.0 e 6.0         D
 *      Entre 4.0 e zero        E
 * 
 * O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
 */

import java.util.Scanner;

public class Questao14_EstruturasDecisao {

  public static void main(String[] args) {

    Scanner keyInput = new Scanner(System.in);

    double nota1, nota2;
    String conceitoNota;

    System.out.println("Favor informar a primeira nota: ");
    nota1 = keyInput.nextDouble();

    System.out.println("Favor informar a segunda nota: ");
    nota2 = keyInput.nextDouble();

    keyInput.close();

    double mediaNotas = (nota1 + nota2) / 2;

    if ((mediaNotas >= 9) && (mediaNotas <= 10)) {
      conceitoNota = "A";
      System.out.printf(
          "A nota1 foi %.1f e a nota2 = %.1f. Assim a média obtida foi %.2f. Nota conceito %s! APROVADO.\n", nota1,
          nota2, mediaNotas, conceitoNota);
    } else if ((mediaNotas < 9) && (mediaNotas >= 7.5)) {
      conceitoNota = "B";
      System.out.printf(
          "A nota1 foi %.1f e a nota2 = %.1f. Assim a média obtida foi %.2f. Nota conceito %s! APROVADO.\n", nota1,
          nota2, mediaNotas, conceitoNota);
    } else if ((mediaNotas < 7.5) && (mediaNotas >= 6)) {
      conceitoNota = "C";
      System.out.printf(
          "A nota1 foi %.1f e a nota2 = %.1f. Assim a média obtida foi %.2f. Nota conceito %s! APROVADO.\n", nota1,
          nota2, mediaNotas, conceitoNota);
    } else if ((mediaNotas < 6) && (mediaNotas >= 4)) {
      conceitoNota = "D";
      System.out.printf(
          "A nota1 foi %.1f e a nota2 = %.1f. Assim a média obtida foi %.2f. Nota conceito %s! REPROVADO.\n", nota1,
          nota2, mediaNotas, conceitoNota);
    } else if ((mediaNotas < 4) && (mediaNotas >= 0)) {
      conceitoNota = "E";
      System.out.printf(
          "A nota1 foi %.1f e a nota2 = %.1f. Assim a média obtida foi %.2f. Nota conceito %s! REPROVADO.\n", nota1,
          nota2, mediaNotas, conceitoNota);
    }

  }

}
