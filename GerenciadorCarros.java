import java.util.ArrayList;
import java.util.List;

public class GerenciadorCarros {
    private List<Carro> carros;

    public GerenciadorCarros() {
        this.carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
        System.out.println("Carro adicionado: " + carro.getPlaca());
    }

    public void removerCarro(String placa) {
        carros.removeIf(carro -> carro.getPlaca().equals(placa));
        System.out.println("Carro removido: " + placa);
    }

    public void listarCarros() {
        if (carros.isEmpty()) {
            System.out.println("Nenhum carro cadastrado.");
            return;
        }
        for (Carro carro : carros) {
            carro.listar();
            System.out.println("-----");
        }
    }
}
