public class ArvoreBinariaAlternativa<T> {
    private NodoArvore<T> raiz;
    private Comparator<T> comparator;

    public ArvoreBinariaAlternativa(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public void inserir(T valor) {
        raiz = inserirRec(raiz, valor);
    }

    private NodoArvore<T> inserirRec(NodoArvore<T> atual, T valor) {
        if (atual == null) return new NodoArvore<>(valor);

        if (comparator.compare(valor, atual.valor) < 0) {
            atual.esquerda = inserirRec(atual.esquerda, valor);
        } else {
            atual.direita = inserirRec(atual.direita, valor);
        }
        return atual;
    }

    public void imprimeEmOrdem() {
        imprimeEmOrdemRec(raiz);
    }

    private void imprimeEmOrdemRec(NodoArvore<T> atual) {
        if (atual != null) {
            imprimeEmOrdemRec(atual.esquerda);
            System.out.println(atual.valor);
            imprimeEmOrdemRec(atual.direita);
        }
    }

    public void imprimePreFixado() {
        imprimePreFixadoRec(raiz);
    }

    private void imprimePreFixadoRec(NodoArvore<T> atual) {
        if (atual != null) {
            System.out.println(atual.valor);
            imprimePreFixadoRec(atual.esquerda);
            imprimePreFixadoRec(atual.direita);
        }
    }
}
