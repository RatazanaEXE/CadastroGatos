package gato;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GatoController {

    GatoRepository repository = new GatoRepository();

    @PostMapping
    public void criar (@RequestBody GatoDTO gatoDTO){
        Gato gato = new Gato(gatoDTO.id, gatoDTO.nome, gatoDTO.peso, gatoDTO.idade);
        repository.salvar(gato);
    }

    @PatchMapping
    public void alterarPeso(String nome, double novoPeso){
        repository.atualizarPeso(nome, novoPeso);
    }

    @DeleteMapping
    public void deletar(String nome){
        repository.deletarPorNome(nome);
    }

    @GetMapping
    public List<GatoDTO> listar(){

        List<GatoDTO> dtos = new ArrayList<>();
        List<Gato> gatos = repository.listar();

        for (Gato gato : gatos) {

            GatoDTO gatoDTO = new GatoDTO();
            gatoDTO.id = gato.getId();
            gatoDTO.nome = gato.getNome();
            gatoDTO.idade = gato.getIdade();
            gatoDTO.peso = gato.getPeso();

            dtos.add(gatoDTO);

        }

        return dtos;
    }

}
