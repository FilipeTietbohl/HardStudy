package OK.Moradia;

public class Pessoa {
  private String nome;
  private String dataNascimento;
  private String cpf;
  private String sexo;
  private String funcao;
  //
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }
  public String getCPF() {
    return cpf;
  }
  public void setCPF(String cpf) {
    this.cpf = cpf;
  }
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
  public String getFuncao() {
    return funcao;
  }
  public void setFuncao(String funcao) {
    this.funcao = funcao;
  }

  public static String formatarCPF(String cpff){
    String formatar = cpff.substring(0, 3) + "." + cpff.substring(3, 6) + "." + cpff.substring(6,9) + "-" + cpff.substring(9, cpff.length());
    return formatar;
  };


}
