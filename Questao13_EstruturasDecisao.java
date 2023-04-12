/*
 * Questão 13 - Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
 */

import java.util.Scanner;

public class Questao13_EstruturasDecisao {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String dayOfWeek;

    System.out.println(
        "Digite o número conforme o dia da semana: \n1 - Domingo \n2 - Segunda \n3 - Terça \n4 - Quarta \n5 - Quinta \n6 - Sexta \n7 - Sábado.");
    int inputDay = input.nextInt();
    input.close();

    switch (inputDay) {
      case 1:
        dayOfWeek = "Domingo";
        break;

      case 2:
        dayOfWeek = "Segunda";
        break;

      case 3:
        dayOfWeek = "Terça";
        break;

      case 4:
        dayOfWeek = "Quarta";
        break;

      case 5:
        dayOfWeek = "Quinta";
        break;

      case 6:
        dayOfWeek = "Sexta";
        break;

      case 7:
        dayOfWeek = "Sábado";
        break;

      default:
        dayOfWeek = "Valor Inválido";
    }

    if ((inputDay > 7) || (inputDay < 1)) {
      System.out.println(dayOfWeek + ". Tente Novamente.");
    } else {
      System.out.println("Hoje é " + dayOfWeek + ".");
    }
  }
}
