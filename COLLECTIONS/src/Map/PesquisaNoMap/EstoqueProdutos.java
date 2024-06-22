package Map.PesquisaNoMap;

import java.util.HashMap;
import java.util.Map;


//  Crie uma classe chamada "EstoqueProdutos" OK
    public class EstoqueProdutos {

//  CRIAR ATRIBUTO.
/*  que utilize um Map para armazenar os produtos, suas quantidades em estoque e seus
    respectivos     preços.
    Cada produto possui um código como chave e um objeto Produto como valor, contendo nome, quantidade e preço. Implemente os seguintes métodos:*/

    private Map<Long, Produto> estoqueProdutosMap;


//  CRIAR UM CONSTRUCTOR."apagamos pois não queremos receber como parâmetros,
//  Iniciamos o obijeto com o HashMap vazio, para receber elementos
    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

//  CRIAR OS MÉTODOS.


//  CRIAR O MÉTODO ADICIONAR PRODUTO AO Map.
//  Pegamos o Map (estoqueProdutosMap),
//  Acrescentamos o método para inserir elemento dentro d um Map é o  (put);
//  O put espera um (Long key, Produto value),
//  Onde key = Long = cod e valeu = Produto = objeto que vamos INSTÂNCICAR.
    public void adicionarProduto(long cod, String nome, int quantidade, int preco){
    estoqueProdutosMap.put(cod,new Produto(nome, quantidade, preco));
    }
//  ???? DÚVIDA, PQ NO ATRIBUTO PREÇO NÃO FOI POSSIVÉL COLOCAR COMO double, só no int.????
//  Criar o metodo exibir Produtos.
//  De forma simples, iremos apenas imprimir o Map
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }


//  Criar o método calcular valor total do Estoque.
/*  Como iremos multiplicar todos os preços, por toda quantidade de produtos
    do estoque , precisaremos usar o laço de repetição.*/
//  preço total estoque = preço * quantidade < volta p Produto>.
//  Precisamos criar uma variável Valor Total Estoque, para receber o produto desse laço de repetição.
//  Criar variável  valorEstoqueTotal.
    /*  Antes de iniciar o laço repetição, é bom verificar se o Map contém elementos ou se está vazio.
    para isso usamos o .isEmpty().*/
//  .isEmpty(). = verificar se o Map está vazio.
    public double calcularValorTotalEstoque(){
        double valorEstoqueTotal = 0;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p: estoqueProdutosMap.values()){
                valorEstoqueTotal += p.getQuantidade() * p.getPreco();
            }
        }
            return valorEstoqueTotal;
    }


//  CRIAR O MÉTODO OBTER PRODUTO MAIS CARO.
//  irá ser um método do tipo Produto, pois retornará um produto.
//  pq null?
//  Criar uma variável p armazenar esse maior valor qdo estiver percorrendo esse laço de repatiçao.
//  Double c D MAIÚSCULO???? PQ?
/*  .MIN_VALUE??? PQ?? Pesquisar mais. prof: pq qdo o laço rept. começar o primeiro valor,
    independente
    do valor dele, já será o maior preço, e depois ele vai fazendo as comparações a medida que ele vai
    navegando no Map*/
    public Produto obterProdutoMaisCaro(){
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p: estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }

        }
            return produtoMaisCaro;
    }




    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

//  Exibe o estoque vazio
        estoque.exibirProdutos();

//  Adiciona produtos ao estoque
        estoque.adicionarProduto(01, "Iphone", 1, 4000);
        estoque.adicionarProduto(02, "Sansung", 2 , 2000);
        estoque.adicionarProduto(03, "Tablet", 3, 1800);
        estoque.adicionarProduto(04, "Notebook", 4, 5000);
        estoque.adicionarProduto(06, "TV 70 '",5, 6000);


//  Exibe os produtos no estoque
        estoque.exibirProdutos();

//  Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

//  Obtém e exibe o produto mais caro
//        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
//        System.out.println("Produto mais caro: " + produtoMaisCaro);

//  Obtém e exibe o produto mais barato - AINDA NÃO FIZ
//        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
//        System.out.println("Produto mais barato: " + produtoMaisBarato);

//  Obtém e exibe o produto com a maior quantidade em valor no estoque - AINDA NÃO FIZ.
//        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
//        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }



}
