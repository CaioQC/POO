package livros;

public class Ebook extends Livro{
    private double tamanho;
    public Ebook(double preco, String autor, String titulo, double tamanho) {
        super(preco, autor, titulo);
        this.tamanho = tamanho;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.printf("O tamanho do ebook é: %f", tamanho);
    }
}
