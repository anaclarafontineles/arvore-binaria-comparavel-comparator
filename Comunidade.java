public class Comunidade implements Comparable<Comunidade> {
    private int id;
    private String nome;
    private int populacao;

    public Comunidade(int id, String nome, int populacao) {
        this.id = id;
        this.nome = nome;
        this.populacao = populacao;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public int getPopulacao() { return populacao; }

    // Implementação do Comparable
    @Override
    public int compareTo(Comunidade outra) {
        return Integer.compare(this.id, outra.id); // comparação pelo ID
    }

    @Override
    public String toString() {
        return "Comunidade{" + "id=" + id + ", nome='" + nome + '\'' + ", populacao=" + populacao + '}';
    }
}
