package Set.Ordenacao;
 

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

//Atributo.
    private Set<Produto> produtoSet;


//Método construtor.
    public CadastroProduto(){
        this.produtoSet = new HashSet<>();
    }

//Após o Método Constr. iniciamos os métodos da regra do negócio.

// criamos o método adicionarProduto.
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }


// criamos o método exibir produtos por nome, por isso chamamos o TreeSet
// pois o TreeSet consegue organizar, nesse caso produtoSet

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }


// Estudar mais Ordenação.

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }


// Criando uma instância do CadastroProdutos / TESTAR.

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();

// Adicionando produtos ao cadastro

        cadastroProduto.adicionarProduto(1L, "Iphone", 1000d, 10);
        cadastroProduto.adicionarProduto(2L, "Sansung", 1500d, 20);
        cadastroProduto.adicionarProduto(3L, "Ipod", 500d, 15);
        cadastroProduto.adicionarProduto(4L, "Fones Ouvido", 50d, 15);

// Exibindo todos os produtos no cadastro
        System.out.println(cadastroProduto.produtoSet);

// Exibindo produtos ordenados por nome
        System.out.println(cadastroProduto.exibirProdutosPorNome());

// Exibindo produtos ordenados por preço
        System.out.println(cadastroProduto.exibirProdutosPorPreco());
    }
}
