package Map.OrdenacaoNoMap;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

    public class AgendaEventos {

 
//  Atributos.
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

//  ADD MÉTODOS.
//  ADD MÉTODO adicionar evento.
//  Nesse método eu recebemos como parâmetros a data, nome, atração.
//  Instaciamos o evento, passando o nome e atração OU c/ o método .put.
    public void adcionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }


    /*  A regra é exibir agenda em ORDEM crescente de data, faz-se lembrar que a implementação do Map para
        deixarmos os elementos ORDENADOS é o treeMap. */
/*  OBS. apartir do momento que é criado o eventosTreeMap, esses eventos já estão organizados na forma
    crescente, pelo fato de que o LocalDate implementa a interface <ChronoLocalDate>, que por sua vez
    extende da comparable, então automáticamente o LocalDate já sabe como organizar essas datas */
    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }


//  MUITO DIFÍCIL, PREDISO ESTUDAR MAIS ESSES MÉTODOS ?????????????????????????
//  esse método, ele vai nos dar o PRÓXIMO EVENTO que vai acontecer, nem no passado, nem no futuro,
//  é o próximo mais recente
// O mét .now();, me retorna a data atual
    // o

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
            LocalDate dataEvento = entry.getKey();
            if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
                proximaData = dataEvento;
                proximoEvento = entry.getValue();
                break;
            }
        }
            if (proximoEvento != null) {
            System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
            } else {
            System.out.println("Não há eventos futuros na agenda.");
            }
     }



//  CHAMAMOS O MÉTODO main
// instanciamos um Objeto do tipo AgendaEventos, p manipularmos posteriormente.
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();


//  Adiciona eventos à agenda
        agendaEventos.adcionarEvento(LocalDate.of(2022, 7, 15), "Evento A", "Palestrante A");
        agendaEventos.adcionarEvento(LocalDate.of(2022, 7, 9), " Evento B", "Palestrante B");
        agendaEventos.adcionarEvento(LocalDate.of(2000, 1, 10), " Evento C", "Palestrante C");
        agendaEventos.adcionarEvento(LocalDate.of(2023, 8, 28), " Evento D", "Palestrante D");
        agendaEventos.adcionarEvento(LocalDate.of(2024, 9, 20), "Evento E", "Palestrante E");

//  Exibe a agenda completa de eventos
        agendaEventos.exibirAgenda();

//  Obtém e exibe o próximo evento na agenda
        agendaEventos.obterProximoEvento();

    }

}
