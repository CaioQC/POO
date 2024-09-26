package livros;

import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        ArrayList<Livro> livros = new ArrayList<>();

        livros.add(new Livro(50.00, "Rick Riordan" , "Magnus Chase e a espada do verão"));
        livros.add(new Livro(50.00, "J.K Rolling" , "Harry Potter e o ladrão de raios"));
        livros.add(new Ebook(70, "Rick Riordan", "Percy Jackson e o ladrão de raios", 3500));

        for(Livro livro : livros){
            livro.exibirDetalhes();
            System.out.println();
        }
    }
}
