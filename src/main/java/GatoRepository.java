import java.util.ArrayList;
import java.util.List;

public class GatoRepository {
     private List<Gato> bancoDeDados = new ArrayList<>();

     public void Salvar (Gato gato){
         bancoDeDados.add(gato);
         System.out.println("Gato: " + gato.getNome() + " cadastrado com sucesso!");
     }

    public List<Gato> Listar () {
        return bancoDeDados;
    }
}
