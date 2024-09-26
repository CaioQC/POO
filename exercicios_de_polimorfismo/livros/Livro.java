package livros;

public class Livro {
    private double preco;
    private String autor;
    private String titulo;

    public Livro(double preco, String autor, String titulo) {
        this.preco = preco;
        this.autor = autor;
        this.titulo = titulo;
    }

    public void exibirDetalhes(){
        System.out.printf("Titulo: %S, Autor %S, Preco %.2f", titulo, autor, preco);
    }
}
