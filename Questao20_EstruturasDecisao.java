/*
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica2_Atividade20  
 * Descrição: Faça um Programa para leitura de três notas parciais de um aluno. 
 * O programa deve calcular a média alcançada por aluno e presentar:
 *    - A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
 *    - A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
 *    - A mensagem "Aprovado com Distinção", se a média for igual a 10.
 * 
 * Data: 13/04/2023
 */

import java.util.Scanner;

public class Questao20_EstruturasDecisao {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Favor informe a nota 1: ");
    double nota1 = input.nextDouble();

    System.out.println("Favor informe a nota 1: ");
    double nota2 = input.nextDouble();

    System.out.println("Favor informe a nota 1: ");
    double nota3 = input.nextDouble();

    double mediaAluno = (nota1 + nota2 + nota3) / 3;

    if (mediaAluno == 10) {
      System.out.println("Média = 10. Aprovado com distinção");
    } else if (mediaAluno >= 7) {
      System.out.printf("Média = %.1f. Aprovado.%n", mediaAluno);
    } else {
      System.out.printf("Média = %.1f. Reprovado.%n", mediaAluno);
    }
  }
}
