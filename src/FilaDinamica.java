public class FilaDinamica {
    No inicio;

    public FilaDinamica() {
        System.out.println("Fila dinâmica criada com sucesso!");
        this.inicio = new No(null);
    }

    public void enfileirar(String elemento) {
        if(estaVazio()) {
            this.inicio.setConteudo(elemento);
            System.out.println("Elemento " + elemento + " adicionado na Fila!");
        } else {
            No novoNo = new No(elemento);
            No aux = this.inicio;
            while(aux != null) {
                if(aux.getProx() == null) {
                    aux.setProx(novoNo);
                    System.out.println("Elemento " + elemento + " adicionado na Fila!");
                    return;
                }
                aux = aux.getProx();
            }
        }

    }

    private boolean estaVazio() {
        if (this.inicio.getConteudo() == null) {
            System.out.println("A Fila está vazia!");
            return true;
        } else {
            return false;
        }
    }

    public void exibir() {
        if(!estaVazio()) {
            No aux = this.inicio;
            while(aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
        }
    }

    public void desenfileirar() {
        if(!estaVazio()) {
            if(this.inicio.getProx() == null) {
                System.out.println("Elemento " + this.inicio.getConteudo() + " removido da fila.");
                this.inicio.setConteudo(null);
                return;
            } else {
                System.out.println("Elemento " + this.inicio.getConteudo() + " removido da fila.");
                this.inicio = this.inicio.getProx();
            }
        }
    }
}
