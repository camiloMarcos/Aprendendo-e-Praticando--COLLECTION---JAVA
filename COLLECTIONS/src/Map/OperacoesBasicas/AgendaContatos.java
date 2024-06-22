package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;


    public class AgendaContatos {

//Atributo.
    private Map<String, Integer> agendaContatoMap;


/* criamos um contrutor. RELEMBRAR PQ APAGAMOS O CONTEUDO DENTRO DOS ()
* e PQ APAGAMOS = XXXXXX E INSTACIAMOS O HashMap?
* Obs. o Hashmap é a implemtentação mais usada na interface Map */

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }


// Iniciamos os metodos "de funcionamento".

// Criamos o Método add contato.
/* Diferentemente do List e Set, para adicionarmos um elemento dentro de um Map
* ñ utilizamos o add, UTILIZAMOS O put. com a respectiva chave e valor, nesse caso
* (chave, valor) = (nome, telefone).*/

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome,telefone);
    }

// CRIAMOS O MÉTODO REMOVER CONTATO (pelo nome).
/*  Antes de tentarmos remover de dentro do Map, precisamos ter certeza de que esse
    Map contém elementos para poder remover. É UAM BOA PRÁTICA VERIFICAR SE A COLEÇÃO
    CONTEM ELEMENTOS. E p isso temos o recurso .isEmpty()
    obs..isEmpty()  verificar se o Map está vazio.

    Após verivicar com .isEmpty(), utilizamos o .remove() e acrescentamos (chave)
    nesse caso (chave)= (nome), excluir pelo nome.

    OBS. como sabemos que a chave é um valor único,então não precisamos percorrer
    usar laços de repetição, pois a chave, nesse caso o nome é unico. */


    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
//  O MÉTODO EXIBIR CONTATO.

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }


//  O MÉTODO PESQUISAR POR NOME.
/*  como pesquisamos por nome, mas retorna o número do telefone, o tipo do método
    deverá ser Integer.
    OBS. Usamos novamente o .isEmpty(), p verificar se existe elemento na coleção Map.
    OBS. Usamos .get, qdo queremos obter um elemento de dentro do Map, nesse caso get,
    passaremos a chave para obter o valor, chave = nome, valor = Telefone.
    OBS. integer numeroPorNone = null?    ?????????????????
    */

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

//  CRIAMOS AGENGACONTATOS E OBJETO.

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // ADICIONAR CONTATOS
        agendaContatos.adicionarContato("Cam", 123456);
        agendaContatos.adicionarContato("Cam", 654321);
        agendaContatos.adicionarContato("Tete", 1111111);
        agendaContatos.adicionarContato("Tia", 222222);
        agendaContatos.adicionarContato("Maga", 333333);
        agendaContatos.adicionarContato("Ju", 444444);
        agendaContatos.adicionarContato("Tito", 555555);
        agendaContatos.adicionarContato("My", 666666);
        agendaContatos.adicionarContato("Fumo", 777777);


        // EXIBIR CONTATOS.
      //  agendaContatos.exibirContatos();


        // REMOVER UM CONTATO
      //  agendaContatos.removerContato("Fumo");
      //  agendaContatos.exibirContatos();


        // PESQUISAR NÚMERO POR NOME.
        String nomePesquisa = "Tete";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("Tete");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        }



}
