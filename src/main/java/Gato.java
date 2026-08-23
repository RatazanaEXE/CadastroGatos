public class Gato {
    int id;
    String nome;
    Double peso;
    int idade;


    //Construtor
    public Gato(int id, String nome, Double peso, int idade) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
    }

    //Get
    public int getId() {
        return id;
    }
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
    public void setId(int id) {
        this.id = id;
    }
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
        return "Id: " +
                "Nome: '" + nome + '\'' +
                " Peso: " + peso +
                " Idade: " + idade ;
    }
}
