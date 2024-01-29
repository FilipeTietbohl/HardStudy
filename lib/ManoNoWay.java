public class ManoNoWay {
  public static void main(String[] args) {
    
    String cpff = "123456789abcdefg";
    System.out.println("O tamanho da string é " + cpff.length());
    formatarCPF(cpff);
    System.out.println(formatarCPF(cpff));
    
  }

  public static String formatarCPF(String cpff){
    String formatar = cpff.substring(0, 3) + "." + cpff.substring(3, 6) + "." + cpff.substring(6,9) + "-" + cpff.substring(9, cpff.length());
    return formatar;
  };
  
}
