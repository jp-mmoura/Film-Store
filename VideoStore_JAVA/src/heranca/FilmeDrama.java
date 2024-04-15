package heranca;

public class FilmeDrama extends Filme {
    public FilmeDrama(String titulo, String diretor, int anoLancamento) {
        super(titulo, diretor, anoLancamento, Filme.DRAMA);
    }
}