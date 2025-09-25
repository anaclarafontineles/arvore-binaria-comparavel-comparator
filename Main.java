package arvore_nome.app;

import arvore_nome.model.Comunidade;
import arvore_nome.tree.ArvoreBinaria;
import arvore_nome.tree.ArvoreBinariaAlternativa;
import arvore_nome.comparator.ComunidadeNomeComparator;

public class Main {
    public static void main(String[] args) {
        Comunidade c1 = new Comunidade(3, "Alpha", 500);
        Comunidade c2 = new Comunidade(1, "Zeta", 200);
        Comunidade c3 = new Comunidade(2, "Beta", 300);

        // Árvore padrão (Comparable -> ID)
        ArvoreBinaria<Comunidade> arvoreId = new ArvoreBinaria<>();
        arvoreId.inserir(c1);
        arvoreId.inserir(c2);
        arvoreId.inserir(c3);

        System.out.println("Árvore por ID (Em ordem):");
        arvoreId.imprimeEmOrdem();

        System.out.println("\nÁrvore por ID (PreFixado):");
        arvoreId.imprimePreFixado();

        // Árvore alternativa (Comparator -> Nome)
        ArvoreBinariaAlternativa<Comunidade> arvoreNome =
                new ArvoreBinariaAlternativa<>(new ComunidadeNomeComparator());
        arvoreNome.inserir(c1);
        arvoreNome.inserir(c2);
        arvoreNome.inserir(c3);

        System.out.println("\nÁrvore por Nome (Em ordem):");
        arvoreNome.imprimeEmOrdem();

        System.out.println("\nÁrvore por Nome (PreFixado):");
        arvoreNome.imprimePreFixado();
    }
}
