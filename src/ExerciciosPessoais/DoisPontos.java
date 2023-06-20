package ExerciciosPessoais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoisPontos {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(List.of("Caio", "Vinicius", "Cesar", "da", "Silva"));
        System.out.println(lista);

        for (String elemento :
                lista) {
            System.out.println(elemento);
        }
        lista.forEach(nome -> System.out.print(nome + " "));

        Integer[] numeros = {1,2,3,4,5,6,7,8,9,10};
        for (int numero : numeros){
            System.out.println(numero);
        }

        Arrays.stream(numeros).toList().forEach(numero -> System.out.print(numero + " "));
        Arrays.stream(numeros).toList().forEach(System.out::print);
    }
}
