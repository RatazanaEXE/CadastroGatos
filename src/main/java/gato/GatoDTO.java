package gato;

/** Data transfer object used by the cat API. */
public final class GatoDTO {
  /** Cat identifier. */
  private int id;

  /** Cat name. */
  private String nome;

  /** Cat weight. */
  private Double peso;

  /** Cat age. */
  private int idade;

  /** Creates an empty DTO for JSON deserialization. */
  // google-java-format off
  public GatoDTO() {
  }
  // google-java-format on


  /**
   * Returns the identifier.
   *
   * @return the identifier
   */
  public int getId() {
    return id;
  }

  /**
   * Updates the identifier.
   *
   * @param catId cat identifier
   */
  public void setId(final int catId) {
    this.id = catId;
  }

  /**
   * Returns the name.
   *
   * @return the name
   */
  public String getNome() {
    return nome;
  }

  /**
   * Updates the name.
   *
   * @param catName cat name
   */
  public void setNome(final String catName) {
    this.nome = catName;
  }

  /**
   * Returns the weight.
   *
   * @return the weight
   */
  public Double getPeso() {
    return peso;
  }

  /**
   * Updates the weight.
   *
   * @param catWeight cat weight
   */
  public void setPeso(final Double catWeight) {
    this.peso = catWeight;
  }

  /**
   * Returns the age.
   *
   * @return the age
   */
  public int getIdade() {
    return idade;
  }

  /**
   * Updates the age.
   *
   * @param catAge cat age
   */
  public void setIdade(final int catAge) {
    this.idade = catAge;
  }
}
