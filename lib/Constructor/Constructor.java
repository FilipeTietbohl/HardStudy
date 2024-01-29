package Constructor;
public class Constructor {
  public static void main(String[] args) {
    Mesa gamer = new Mesa("MesaGamer", 4, "Ferro", 5);

    System.out.println(gamer);
    //Beleza, mas como eu acesso eles sem alterar tanto?
    //Crio Getter e Setter pra cada um? Isso elimina a necessidade do construtor po
    //Pra que eu uso o construtor? Pra setar algo estatico? Mas isso eu posso setar depois
    //Get e set eu vou usar pra dar oportunidade pro usuário inserir e depois puxar a info.
  }
}
