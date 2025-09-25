import java.util.Comparator;

public class ComunidadeNomeComparator implements Comparator<Comunidade> {
    @Override
    public int compare(Comunidade c1, Comunidade c2) {
        return c1.getNome().compareToIgnoreCase(c2.getNome()); // ordem alfabética
    }
}
