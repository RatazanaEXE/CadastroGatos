public class Gato {
    String nome;
    Double peso;
    int idade;


    //Construtor
    public Gato(Double peso, int idade, String nome) {
        this.peso = peso;
        this.idade = idade;
        this.nome = nome;
    }


    //Get
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public Double getPeso() {
        return peso;
    }

    //Set
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: '" + nome + '\'' +
                " Peso: " + peso +
                " Idade: " + idade ;
    }
}
