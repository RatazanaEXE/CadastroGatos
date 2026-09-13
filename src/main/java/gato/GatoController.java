package gato;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** Exposes HTTP endpoints for cat registration. */
@RestController
public final class GatoController {

  /** Repository used by the endpoints. */
  private final GatoRepository repository = new GatoRepository();

  /**
   * Creates a cat.
   *
   * @param gatoDTO data of the cat to create
   */
  @PostMapping
  // google-java-format off
  public void criar(@RequestBody final GatoDTO gatoDTO) {
    Gato gato = new Gato(
      gatoDTO.getId(), gatoDTO.getNome(), gatoDTO.getPeso(),
      gatoDTO.getIdade());
    repository.salvar(gato);
  }
  // google-java-format on

  /**
   * Updates a cat weight.
   *
   * @param nome cat name
   * @param novoPeso new weight
   */
  @PatchMapping
  public void alterarPeso(final String nome, final double novoPeso) {
    repository.atualizarPeso(nome, novoPeso);
  }

  /**
   * Deletes a cat by name.
   *
   * @param nome cat name
   */
  @DeleteMapping
  public void deletar(final String nome) {
    repository.deletarPorNome(nome);
  }

  /**
   * Lists all registered cats.
   *
   * @return registered cats
   */
  @GetMapping
  public List<GatoDTO> listar() {

    List<GatoDTO> dtos = new ArrayList<>();
    List<Gato> gatos = repository.listar();

    for (Gato gato : gatos) {

      GatoDTO gatoDTO = new GatoDTO();
      gatoDTO.setId(gato.getId());
      gatoDTO.setNome(gato.getNome());
      gatoDTO.setIdade(gato.getIdade());
      gatoDTO.setPeso(gato.getPeso());

      dtos.add(gatoDTO);
    }

    return dtos;
  }
}
