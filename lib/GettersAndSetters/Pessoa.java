package GettersAndSetters;
public class Pessoa{
  private String nome;
  private int idade;
  private String sexo;

  public String getNome(){
    return nome;
  }
  public void setNome(String newNome) {
		nome = newNome;
	}

  public int getIdade(){
    return idade;
  }
  public void setIdade(int newIdade) {
    if (newIdade < 18){
      System.out.println("Idade insifuciente");
    }
    
		this.idade = newIdade;
	} 

  public String getSexo(){
    return sexo;
  }

  public void setSexo(String newSexo){
    sexo = newSexo;
  }
}