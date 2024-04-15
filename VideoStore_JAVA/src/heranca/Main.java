package heranca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao nosso cinema!");

        System.out.print("Escolha o gênero do filme (Ação ou Drama): ");
        String genero = scanner.nextLine();

        System.out.print("Digite o nome do filme: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o nome do diretor do filme: ");
        String diretor = scanner.nextLine();

        System.out.print("Digite o ano de lançamento do filme: ");
        int anoLancamento = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Filme filme;
        if (genero.equalsIgnoreCase("Ação")) {
            filme = new FilmeAcao(titulo, diretor, anoLancamento);
        } else if (genero.equalsIgnoreCase("Drama")) {
            filme = new FilmeDrama(titulo, diretor, anoLancamento);
        } else {
            System.out.println("Desculpe, esse gênero não é válido.");
            return;
        }

        System.out.println("\nObrigado por fornecer as informações do filme!");
        System.out.println("O filme " + filme.getTitulo() + " foi dirigido por " + filme.getDiretor() + " e lançado em " + filme.getAnoLancamento() + ".");
        System.out.println("\nVocê pode assistir este filme aqui por R$15,50.");
    }
}