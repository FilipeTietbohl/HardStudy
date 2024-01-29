package OK.Constructor;

public class Mesa {
  private String nome;
  private int quantidadePernas;
  private String material;
  private int idade;

  public Mesa(String nome, int quantidadePernas, String material, int idade){
    this.nome = nome;
    this.quantidadePernas = quantidadePernas;
    this.material = material;
    this.idade = idade;
  }

  @Override 
  public String toString(){
    return this.nome + " " + this.quantidadePernas + " " + this.material + " " + this.idade;
  }
};

//To usando o @Override pra conseguir imprimir o conteúdo do objeto.
//To fazendo basicamente um getter ...