package gato;

/** Represents a cat registered in the system. */
public final class Gato {

  /** Cat identifier. */
  private int id;

  /** Cat name. */
  private String nome;

  /** Cat weight. */
  private Double peso;

  /** Cat age. */
  private int idade;

  /**
   * Creates a cat with the supplied data.
   *
   * @param catId cat identifier
   * @param catName cat name
   * @param catWeight cat weight
   * @param catAge cat age
   */
  // google-java-format off
  public Gato(
      final int catId,
      final String catName,
      final Double catWeight,
      final int catAge) {
    this.id = catId;
    this.nome = catName;
    this.peso = catWeight;
    this.idade = catAge;
  }
  // google-java-format on

  /**
   * Returns the cat identifier.
   *
   * @return the identifier
   */
  public int getId() {
    return id;
  }

  /**
   * Returns the cat name.
   *
   * @return the name
   */
  public String getNome() {
    return nome;
  }

  /**
   * Returns the cat age.
   *
   * @return the age
   */
  public int getIdade() {
    return idade;
  }

  /**
   * Returns the cat weight.
   *
   * @return the weight
   */
  public Double getPeso() {
    return peso;
  }

  /**
   * Updates the cat identifier.
   *
   * @param catId cat identifier
   */
  public void setId(final int catId) {
    this.id = catId;
  }

  /**
   * Updates the cat weight.
   *
   * @param catWeight cat weight
   */
  public void setPeso(final Double catWeight) {
    this.peso = catWeight;
  }

  /**
   * Updates the cat name.
   *
   * @param catName cat name
   */
  public void setNome(final String catName) {
    this.nome = catName;
  }

  /**
   * Updates the cat age.
   *
   * @param catAge cat age
   */
  public void setIdade(final int catAge) {
    this.idade = catAge;
  }

  /** Returns a readable representation of the cat. */
  @Override
  // google-java-format off
  public String toString() {
    return "Id: " + id + " Nome: '" + nome + '\''
        + " Peso: " + peso + " Idade: " + idade;
  }
  // google-java-format on
}
