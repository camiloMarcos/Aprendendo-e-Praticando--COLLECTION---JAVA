
package Set.Pesquisa;

import java.util.Objects;

public class Contato {

    private String nome;
    private int numeroDeTelefone;

//  Método Construtor    
    public Contato(String nome, int numeroDeTelefone) {
        this.nome = nome;
        this.numeroDeTelefone = numeroDeTelefone;
    }


//  Método Get    
    public String getNome() {
        return nome;
    }
    public int getNumeroDeTelefone() {
        return numeroDeTelefone;
    }
    public void setNumeroDeTelefone(int numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }


//  nessa regra de negócio, para afirmarmos que o contato é igual ao outro, teremos como base apenas o NOME DO CONTATO.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }


//  Método toString
    @Override
    public String toString() {
        return "{ "+ nome + ", "+ numeroDeTelefone + " }";
    }

}
