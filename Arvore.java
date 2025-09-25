package arvore_nome.tree;

public interface Arvore<T> {
    void inserir(T valor);
    void imprimeEmOrdem();
    void imprimePreFixado();
}
