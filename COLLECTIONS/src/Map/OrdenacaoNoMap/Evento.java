package Map.OrdenacaoNoMap;
    public class Evento {

//  ATRIBUTO
    private String nome;
    private String atracao;

//  CRIAR O MÉTODO CONSTRUCTOR

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }


//  CRIAR O MÉTODO get

    public String getNome() {
        return nome;
    }
    public String getAtracao() {
        return atracao;
    }  


    //  CRIAR O MÉTODO toString

    @Override
    public String toString() {
        return "Evento{" +
                "nomeEvento='" + nome + '\'' +
                ", nomeAtracao='" + atracao + '\'' +
                '}';
    }

}
