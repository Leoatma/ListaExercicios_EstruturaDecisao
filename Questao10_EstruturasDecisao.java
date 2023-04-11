/*
 * Questã 10 - Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou 
 * Valor Inválido!", conforme o caso.
 */

import java.util.Scanner;

public class Questao10_EstruturasDecisao {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String turnoDeEstudo;

    System.out.println("Favor, informe o turno em que estuda: \nM-Matutino; \nV-Vespertino; \nN-Noturno.");
    turnoDeEstudo = input.next().toUpperCase();

    input.close();

    switch (turnoDeEstudo) {
      case "M":
        System.out.println("Bom dia!");
        break;

      case "V":
        System.out.println("Boa Tarde!");
        break;

      case "N":
        System.out.println("Boa noite!");
        break;

      default:
        System.out.println("Valor Inválido");
    }

  }
}
