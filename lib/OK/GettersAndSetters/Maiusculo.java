package OK.GettersAndSetters;

import java.util.Scanner;

public class Maiusculo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Pessoa pessoa1 = new Pessoa();

    System.out.println("Qual seu nome?");
    String inputScanner = input.nextLine();

    pessoa1.setNome(inputScanner);
    System.out.println(pessoa1.Maiusculo(inputScanner));

    input.close();

  }
}
