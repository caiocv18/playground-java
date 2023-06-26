package ExerciciosPessoais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaAleatoria {
    public static void main(String[] args) {
        int tamanho = 2;
        ArrayList<String> lista = new ArrayList<>(List.of("Caio", "Vinicius", "Cesar", "da", "Silva"));
        System.out.println(lista);
        Collections.shuffle(lista);
        List<String> listaAleatoria = lista.subList(0, tamanho);
        System.out.println(listaAleatoria);
    }
}
