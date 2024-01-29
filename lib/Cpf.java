import java.util.Scanner;

public class Cpf {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Por gentileza, digite seu CPF: ");
    String resposta = sc.nextLine();
    sc.close();
    String cpfFormatado = formatarCPF(resposta);
    long cpfLong = cpfLong(resposta);
    System.out.println(cpfFormatado); // Informação que será exibida para cliente
    System.out.println(cpfLong); // Informação usada no servidor
  }

  public static String formatarCPF(String resposta){
    String cpfFormatado = resposta.substring(0, 3) + "." + resposta.substring(3,6) + "." + resposta.substring(6, 9) + "-" + resposta.substring(9, resposta.length());
    return cpfFormatado;
  }
  
  public static Long cpfLong(String resposta){
    long  longCpf = Long.parseLong(resposta);
    return longCpf;
  }
  
}