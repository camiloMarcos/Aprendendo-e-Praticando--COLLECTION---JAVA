package Set.OperacoesBasicas;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite()== codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoConvidados
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        // Exibindo o número de convidados no conjunto (brincar com a qtd, cod. repetido)
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

              // Adicionando convidados ao conjunto
       conjuntoConvidados.adicionarConvidado("Camilo", 1234);
       conjuntoConvidados.adicionarConvidado("Teresa", 1235);
       conjuntoConvidados.adicionarConvidado("Jô", 1235);
       conjuntoConvidados.adicionarConvidado("Rafa", 1236);
       conjuntoConvidados.adicionarConvidado("Juliane", 1237);
       conjuntoConvidados.adicionarConvidado("Tito", 1238);
       conjuntoConvidados.adicionarConvidado("Emyli", 1239);
       conjuntoConvidados.adicionarConvidado("Vinicius", 12310);
       conjuntoConvidados.adicionarConvidado("Diego", 12311);
       conjuntoConvidados.adicionarConvidado("Pedro", 12312);
       conjuntoConvidados.adicionarConvidado("Elisa", 12313);
       conjuntoConvidados.adicionarConvidado("Gueguel", 12314);
       conjuntoConvidados.adicionarConvidado("Juju", 12315);

        // Exibindo os convidados no conjunto
        System.out.println("Convidados no conjunto:");
        conjuntoConvidados.exibirConvidados();

        // Exibindo o número atualizado de convidados no conjunto
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        // Removendo um convidado do conjunto por código de convite
        conjuntoConvidados.removerConvidadoPorCodigoConvite(12310);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

        // Exibindo os convidados atualizados no conjunto
        System.out.println("Convidados no conjunto após a remoção:");
        conjuntoConvidados.exibirConvidados();
    }

}
