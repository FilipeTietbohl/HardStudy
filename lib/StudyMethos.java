import java.util.Scanner;

public class StudyMethos {
  public static void main(String[] args) {
    Scanner numeros = new Scanner(System.in);

    System.out.println("Insira o primeiro número");
    int numero1 = numeros.nextInt();

    System.out.println("Insira o segundo número");
    int numero2 = numeros.nextInt();

    System.out.println("\nDigite o número da operação que deseja realizar:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n");
    int resposta = numeros.nextInt();

    switch (resposta) {
      case 1:
        soma(numero1, numero2);    
      break;
      case 2:
        subtração(numero1, numero2);
      break;
      case 3:
        multiplicação(numero1, numero2);
       break;
      case 4:
        divisão(numero1, numero2);
      break;
      default:
          System.out.println("Opção inválida. O programa será encerrado");
      break;
    }
    numeros.close(); //Fechar o Scanner
  }
  public static void soma(int numero1, int numero2){
    System.out.println("\nOpção selecionada foi: Soma");
    System.out.println("O resultado é " + (numero1 + numero2) + "\n");
  }
  public static void subtração(int numero1,int numero2){
    System.out.println("\nOpção selecionada foi: Subtração");
    System.out.println("O resultado é " + (numero1 - numero2) + "\n");
  }
  public static void multiplicação(int numero1, int numero2){
    System.out.println("\nOpção selecionada foi: Multiplicação");
    System.out.println("O resultado é " + (numero1 * numero2) + "\n");
  }
  public static void divisão(int numero1, int numero2){
    System.out.println("\nOpção selecionada foi: Divisão");
    System.out.println("O resultado é " + (numero1 / numero2) + "\n");
  }
}
