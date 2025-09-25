package arvore_nome.tree;

public class NodoArvore<T> {
    public T valor;
    public NodoArvore<T> esquerda, direita;

    public NodoArvore(T valor) {
        this.valor = valor;
        esquerda = direita = null;
    }
}
