public class NoGenerico <T>{
    T conteudo;
    No prox;
    No ant;

    public NoGenerico(T conteudo) {
        this.conteudo = conteudo;
        this.prox = null;
        this.ant = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }
}
