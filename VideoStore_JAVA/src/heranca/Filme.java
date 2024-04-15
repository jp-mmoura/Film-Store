package heranca;

public class Filme {
    public static final String ACAO = "Ação";
    public static final String DRAMA = "Drama";

    private String titulo;
    private String diretor;
    private int anoLancamento;
    private String genero;

    public Filme(String titulo, String diretor, int anoLancamento, String genero) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        setGenero(genero);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    private void setGenero(String genero) {
        if (ACAO.equalsIgnoreCase(genero)) {
            this.genero = Filme.ACAO;
            return;
        }
        if (DRAMA.equalsIgnoreCase(genero)) {
            this.genero = Filme.DRAMA;
            return;
        }
        throw new IllegalArgumentException("Genero invalido: " + genero);
    }
}