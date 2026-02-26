public class trabalhador {
  private String nome;
  private float salario;
  private int  idade;
  private char sexo;


    public trabalhador(int idade, String nome, float salario, char sexo) {
        this.idade = idade;
        this.nome = nome;
        this.salario = salario;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString(){
        return nome + "," + idade + "," + sexo + "," + salario; 
    }
}
