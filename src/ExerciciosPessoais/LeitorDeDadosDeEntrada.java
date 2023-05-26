package ExerciciosPessoais;

import java.util.Scanner;

public class LeitorDeDadosDeEntrada {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma informação: ");
        String dadosDeEntrada = scanner.nextLine();

        System.out.println("Você digitou: " + dadosDeEntrada);
    }
}
