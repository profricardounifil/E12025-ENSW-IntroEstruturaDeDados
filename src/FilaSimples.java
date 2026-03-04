public class FilaSimples {
    Integer [] fila;
    int tamanho;

    public FilaSimples(int tamanho) {
        this.tamanho = tamanho;
        this.fila = new Integer[tamanho];
        System.out.println("A Fila foi criada com sucesso! Ela possui " + tamanho + " espaços disponíveis!");
    }

    public void enfileirar(int valor) {
        if(!estaCheia()) {
            for (int i = 0; i < this.tamanho; i++) {
                if(this.fila[i] == null) {
                    this.fila[i] = valor;
                    System.out.println("O valor " + valor + " foi inserido na Fila!");
                    return;
                }
            }
        }
    }

    private boolean estaCheia() {
        for (int i = 0; i < this.tamanho; i++) {
            if(this.fila[i] == null) {
                return false;
            }
        }
        System.out.println("A Fila está cheia!");
        return true;
    }

    public void exibir() {
        if(!estaVazio()) {
            for (int i = 0; i < this.tamanho; i++) {
                System.out.println(this.fila[i]);
            }
        }
    }

    private boolean estaVazio() {
        if(this.fila[0] == null) {
            System.out.println("A Fila está vazia.");
            return true;
        } else {
            return false;
        }
    }

    public void desenfileirar() {
        if(!estaVazio()) {
            System.out.println("O elemento " + this.fila[0] + " foi removido da Fila.");
            for (int i = 0; i < this.tamanho-1; i++) {
                this.fila[i] = this.fila[i+1];
            }
            this.fila[this.tamanho-1] = null;
        }
    }
}
