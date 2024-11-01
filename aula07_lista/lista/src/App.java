import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) throws Exception {
        // lista_simples();
        // lista_encadeada();
        ListaCircular playlist = new ListaCircular();
        playlist.adicionar("Dani Callifornia - Red Hot Chilli Peppers");
        playlist.adicionar("Can't Stop - Red Hot Chilli Peppers");
        playlist.adicionar("By the way - Red Hot Chilli Peppers");
        playlist.adicionar("Callifornication - Red Hot Chilli Peppers");
        playlist.adicionar("Thriller - Michael Jackson");
        playlist.adicionar("Matue - Kenny G");

        playlist.percorrer(4);
    }

    public static void lista_encadeada(){
        // criando uma lista encadeada
        LinkedList<String> carros = new LinkedList<>();

        // adicionando itens na lista
        carros.add("Corsa");
        carros.add("Gol");
        carros.add("HB20");
        carros.add("Onix");
        System.out.println("Listar carros");
        System.out.println(carros.toString());

        // adicionando itens no inicio da lista
        carros.addFirst("Kwid");
        System.out.println("Listar carros");
        System.out.println(carros.toString());

        // adicionando no fim da lista
        carros.addLast("Argo");
        System.out.println("Listar carros");
        System.out.println(carros.toString());

        // removendo elementos
        carros.remove(1);
        System.out.println("Listar carros removidos: ");
        System.out.println(carros.toString());

        // removendo no inicio da lista
        carros.removeFirst();
        System.out.println("Listar carros removidos no inicio");
        System.out.println(carros.toString());

        // removendo no fim da lista
        carros.removeLast();
        System.out.println("Listar carros removidos no fim");
        System.out.println(carros.toString());
        
        // consultar um elemento em específico
        System.out.println("Acesso direto: "+carros.get(0));
        System.out.println("Acessando o primeiro item da lista: "+carros.getFirst());
        System.out.println("Acessando o último elemento da lista: "+carros.getLast());

        // percorrendo uma lista
        System.out.println("Percorrendo uma lista do inicio ao fim");
        System.out.println("Percorrendo uma lista do fim ao inicio");

        // percorrendo uma lista
        System.out.println("Percorrendo uma lista do inicio ao fim");
        ListIterator<String> it = carros.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Percorrendo uma lista do fim ao inicio");
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }







    public static void lista_simples(){
        ArrayList<String> frutas = new ArrayList<>();
        ArrayList<String> feira = new ArrayList<>();

        // adicionando elementos na lista: ADD
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Melancia");
        frutas.add("Uva");
        System.out.println(frutas);

        // Remover elementos: REMOVE(index)
        frutas.remove(1);

        // consultando elementos de acesso direto: GET(index)
        System.out.println(frutas.get(0));

        // Consultar o tamanho da lista: SIZE()
        System.out.println("O tamanho da lista de frutas tem: " +frutas.size());
        System.out.println("O tamanho da lista da feira tem: " +feira.size());

        // Verificar se a lista está vazia: ISEMPTY
        System.out.println("A lista de frutas está vazia: "+frutas.isEmpty());
        System.out.println("A lista da Feira está vazia: "+feira.isEmpty());

        // Percorrendo uma lista com o FOREACH
        System.out.println("Lista de Frutas: ");
        for(String item: frutas){
            System.out.println(item);
        }
    }
}
