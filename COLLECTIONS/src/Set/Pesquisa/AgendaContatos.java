package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
//  Atributo.
    private Set<Contato> ContatoSet;


//  Método HashSet.
    public AgendaContatos() {
        ContatoSet = new HashSet<>();
    }


//  Métodos Regra de négocio.    
    public void adicionarContato(String nome, int numero){
        ContatoSet.add(new Contato(nome,numero));
    }


    public void exibirContatos(){
        System.out.println(ContatoSet);
    }


//  startsWith é um método que ganhamos, quando utilizamos String, possibilita que td contato que inicie com o nome pesquisado, apareca.

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c:ContatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }


//  PESQUISAR. equalsIgnoreCase, pq agora queremos o contato com o nome iguazinho, nome que iremos passar como parâmetro.
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : ContatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumeroDeTelefone(novoNumero);
                contatoAtualizado = c;
                break;

            }
        }
        return contatoAtualizado;
    }



    public static void main(String[] args) {
        // Foi criado uma instância da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // queremos Exibir os contatos no conjunto (o numero pode variar de acordo c a qtde de contator adicionados, se ã tiver add ainde  deverá estar vazio).
        agendaContatos.exibirContatos();

        // Lista de Contatos para add à Agenda. (podemos brincar com a qtde para praticar)
        agendaContatos.adicionarContato("Cam", 123456789);
        agendaContatos.adicionarContato("Tê", 987654321);
        agendaContatos.adicionarContato("Tia Jô", 55555555);
//        agendaContatos.adicionarContato("maga", 88889999);
//        agendaContatos.adicionarContato("Lipe", 77775453);
//       agendaContatos.adicionarContato("Ju", 77778888);
//        agendaContatos.adicionarContato("Piranga", 000000000);
//        agendaContatos.adicionarContato("157Man", 157157157);
//        agendaContatos.adicionarContato("Tito", 55555555);
//        agendaContatos.adicionarContato("157Encostada", 0102030405);
//        agendaContatos.adicionarContato("Myloca", 77778888);
//        agendaContatos.adicionarContato("Jon", 999999999);
//        agendaContatos.adicionarContato("157Fumaça", 55555555);
//        agendaContatos.adicionarContato("Didi", 55555555);
//        agendaContatos.adicionarContato("Eli", 77778888);
//        agendaContatos.adicionarContato("Jujuba", 1304057);


//  Exibindo os contatos na agenda
        agendaContatos.exibirContatos();

//  Método para Pesquisar contatos pelo nome.
        System.out.println(agendaContatos.pesquisarPorNome("157Fumaça"));

//  Atualizando o número de um contato
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Cam", 12345678);
        System.out.println("Contato atualizado: " + contatoAtualizado);

//  Exibindo os contatos atualizados na agenda
       System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();
    }

}
