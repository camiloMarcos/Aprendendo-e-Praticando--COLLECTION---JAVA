package Map.PesquisaNoMap;

// criar classe Produto, como objeto ele tem seus atributos.    
    public class Produto {

//  Criar Atributos
    private String nome;
    private int quantidade;
    private int preco;

//  Método Constructor.
    public Produto( String nome, int quantidade, int preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

//  Método Get.
    public String getNome() {
        return nome;
    }
        public int getQuantidade() {
        return quantidade;
    }
    public double getPreco() {
        return preco;
    }

// Método toString.
    @Override
    public String toString() {
        return "{ " +  nome  +  ", Qtde=" + quantidade +  ", Valor= " +  preco + " }";
    }

}
