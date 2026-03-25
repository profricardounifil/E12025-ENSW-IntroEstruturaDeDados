public class ListaDuplamenteEncadeada {
    NoDuplamenteEncadeado inicio;
    NoDuplamenteEncadeado ultimo;

    public ListaDuplamenteEncadeada() {
        this.inicio = new NoDuplamenteEncadeado(null);
        this.ultimo = this.inicio;
    }

    public void adicionar(Integer conteudo) {
        if(estaVazio()) {
            this.inicio.setConteudo(conteudo);
        } else {
            NoDuplamenteEncadeado novoNo = new NoDuplamenteEncadeado(conteudo);
            this.ultimo.setProx(novoNo);
            novoNo.setAnt(this.ultimo);
            this.ultimo = novoNo;
        }
    }

    public boolean estaVazio() {
        if(this.inicio.getConteudo() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void exibir() {
        if(!estaVazio()) {
            NoDuplamenteEncadeado aux = this.inicio;
            while(aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
        }
    }

    public void exibirInverso() {
        if(!estaVazio()) {
            NoDuplamenteEncadeado aux = this.ultimo;
            while(aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getAnt();
            }
        }
    }

    public void remover(Integer conteudo) {
        if(!estaVazio()) {
            if(verificarExistencia(conteudo)) {
                if(this.inicio.getConteudo() == conteudo) {
                    if(this.inicio.getProx() == null) {
                        this.inicio.setConteudo(null);
                        return;
                    } else {
                        this.inicio = this.inicio.getProx();
                        this.inicio.setAnt(null);
                        return;
                    }
                } else {
                    NoDuplamenteEncadeado aux = this.inicio;
                    while(aux.getProx() != null) {
                        if(aux.getProx().getConteudo() == conteudo && aux.getProx() != this.ultimo) {
                            aux.setProx(aux.getProx().getProx());
                            aux.getProx().setAnt(aux);
                            return;
                        }
                        else if(this.ultimo.getConteudo() == conteudo) {

                            this.ultimo = this.ultimo.getAnt();
                            this.ultimo.setProx(null);
                            return;
                        }
                    }
                }
            }
        }
    }

    public boolean verificarExistencia(Integer conteudo) {
        NoDuplamenteEncadeado aux = this.inicio;
        while(aux != null) {
            if(aux.getConteudo() == conteudo) {
                return true;
            }
            aux = aux.getProx();
        }
        return false;
    }
}
