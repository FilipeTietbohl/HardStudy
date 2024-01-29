package OK.Moradia;
import java.util.Scanner;

public class Portaria {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa();
    Scanner sc = new Scanner(System.in);

    System.out.println("Qual seu CPF?");
    String resposta = sc.nextLine();
    pessoa1.setCPF(resposta);
    sc.close();
    System.out.println(pessoa1.getCPF());

  }  
}
