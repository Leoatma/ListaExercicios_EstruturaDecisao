/*
 * Questao 03 - Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */

import java.util.Scanner;

public class Questao03_EstruturasDecisao {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String userGender;

    System.out.println("Favor informar o gênero: \nF - Feminino \nM - Masculino");
    userGender = input.next().toUpperCase();

    input.close();

    if (userGender.equals("M")) {
      System.out.println("O gênero é Masculino");
    } else if (userGender.equals("F")) {
      System.out.println("Gênero feminino");
    } else {
      System.out.println("Sexo Inválido");
    }

  }

}
