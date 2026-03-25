public class MainDuplamenteEncadeada {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.adicionar(5);
        lista.adicionar(4);
        lista.adicionar(5);
        lista.remover(5);
        lista.exibirInverso();
        System.out.println("===");
        lista.exibir();
    }
}
