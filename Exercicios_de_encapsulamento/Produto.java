public class Produto {
    public String nome;
    public String codigo;
    public double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirProduto(String nome){
        System.out.println("O nome do produto é: " + nome);
    }

    public void exibirProduto(String nome, String codigo){
        System.out.println("O nome do produto é: " + nome);
        System.out.println("O codigo do produto é: " + codigo);
    }

    public void exibirProduto(String nome, String codigo, double preco){
        System.out.println("O nome do produto é: " + nome);
        System.out.println("O codigo do produto é: " + codigo);
        System.out.println("O preço do produto é: " + preco);
    }
}
