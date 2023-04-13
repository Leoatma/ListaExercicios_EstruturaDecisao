/*
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica2_Atividade18
 * Descrição: Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida. 
 * Data: 13/04/2023
 */

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Questao18_EstruturasDecisao {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Informe a data: (dd/mm/aaaa) ");
    String dataInput = input.next();
    input.close();

    // criando formatador para transformar String para Date
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    formatador.setLenient(false); // verificando se é válida

    try {

      Date dataFormatada = formatador.parse(dataInput);
      System.out.println("Data válida: " + dataFormatada);

    } catch (ParseException ex) {
      System.out.println("Data inválida.");
    }

  }
}