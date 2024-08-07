public class Main {
    public static void main(String[] args) {
        GerenciadorCarros gerenciador = new GerenciadorCarros();

        Carro carro1 = new Carro("ABC-1234", "Toyota", "Corolla", "Prata");
        Carro carro2 = new Carro("DEF-5678", "Honda", "Civic", "Preto");

        gerenciador.adicionarCarro(carro1);
        gerenciador.adicionarCarro(carro2);

        gerenciador.listarCarros();
    }
}
