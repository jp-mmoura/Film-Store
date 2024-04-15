package heranca;

public class FilmeAcao extends Filme {
    public FilmeAcao(String titulo, String diretor, int anoLancamento) {
        super(titulo, diretor, anoLancamento, Filme.ACAO);
    }
}