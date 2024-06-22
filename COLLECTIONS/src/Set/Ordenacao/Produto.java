package Set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;


public class Produto implements Comparable <Produto> {

    // criamos os atributos da classe.
        private String nome;
        private long cod;
        private double preco;
        private int quantidade;

        
    // criamos o método construtor, para podermos criar objetos futuros com esses mesmos atributos.
        public Produto(String nome, long cod, double preco, int quantidade) {
            this.nome = nome;
            this.cod = cod;
            this.preco = preco;
            this.quantidade = quantidade;
        }
    
    // criamos o compateTo da implementação Comparable, para quando formos exibirProdutosPorNome.
    // estudar mais sobre compareToIgnoreCase.
        @Override
        public int compareTo(Produto p) {
            return nome.compareToIgnoreCase(p.getNome());
        }
    

    // criamos o método Getter
        public String getNome() {
            return nome;
        }
        public long getCod() {
            return cod;
        }
        public double getPreco() {
            return preco;
        }
        public int getQuantidade() {
            return quantidade;
        }
    

    // criamos método equals() and hashCod()
    // esse método distingue o objeto, nesse caso o parâmetro cod, o produto será igual apartir do cod, apenas se o cod for igual o obj é igual, se os cods forem != os objs também serão !=.
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Produto produto = (Produto) o;
            return cod == produto.cod;
        }
    
        @Override
        public int hashCode() {
            return Objects.hashCode(cod);
        }
    
    // criamos o método toString para facilitar a impressão.
        @Override
        public String toString() {
            return "{"  + nome + ' ' + "Cod :" +  cod + ", preco=" + preco + ", Qtde= " + quantidade + "}";
        }
    }

    
    //para que possamos exibir os produtos por preço, precisaremos comparar os produtos por
    //preço, para isso criamos uma nova classe e implementando um comparator <Produto>.
    
    class ComparatorPorPreco implements Comparator<Produto>{
        
    // métod compare.
        @Override
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
    }
    