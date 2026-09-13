package gato;

import java.util.ArrayList;
import java.util.List;

/** Stores cats in memory. */
public final class GatoRepository {
  /** In-memory cat storage. */
  private final List<Gato> bancoDeDados = new ArrayList<>();

  /**
   * Saves a cat.
   *
   * @param gato cat to save
   */
  public void salvar(final Gato gato) {
    bancoDeDados.add(gato);
    // google-java-format off
    String message = "gato.Gato: " + gato.getNome()
      + " cadastrado com sucesso!";
    System.out.println(message);
    // google-java-format on
  }

  /**
   * Returns all saved cats.
   *
   * @return saved cats
   */
  public List<Gato> listar() {
    return bancoDeDados;
  }

  /**
   * Updates matching cat weights.
   *
   * @param nome cat name
   * @param novoPeso new weight
   */
  public void atualizarPeso(final String nome, final double novoPeso) {

    for (Gato gato : bancoDeDados) {
      if (gato.getNome().equals(nome)) {
        gato.setPeso(novoPeso);
        System.out.println("Peso alterado com sucesso!");
      }
    }
  }

  /**
   * Deletes a cat by identifier.
   *
   * @param id cat identifier
   */
  public void deletar(final int id) {
    bancoDeDados.removeIf(gato -> gato.getId() == id);
    System.out.println("Cadastro removido do sistema.");
  }

  /**
   * Deletes cats matching a name.
   *
   * @param nome cat name
   */
  public void deletarPorNome(final String nome) {
    bancoDeDados.removeIf(gato -> gato.getNome().equals(nome));
    System.out.println("Cadastro removido do sistema.");
  }
}
