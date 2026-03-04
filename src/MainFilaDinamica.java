public class MainFilaDinamica {
    public static void main(String[] args) {
        FilaDinamica filaDinamica = new FilaDinamica();
        filaDinamica.exibir();
        filaDinamica.enfileirar("Arroz");
        filaDinamica.enfileirar("Feijão");
        filaDinamica.enfileirar("Batata");
        filaDinamica.enfileirar("Carne");
        filaDinamica.desenfileirar();
        filaDinamica.desenfileirar();
        filaDinamica.desenfileirar();
        filaDinamica.desenfileirar();
        filaDinamica.desenfileirar();
        filaDinamica.exibir();
    }
}
