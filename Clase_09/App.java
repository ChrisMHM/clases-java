package Clase_09;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Funcionamiento de los números aleatorios en Java
        Random r = new Random();
        int numeroAleatorio = r.nextInt(3); // Lo que está en paréntesis indica que el límite: 0, 1, 2. El 3 no se
                                            // contempla.

        Scanner sc = new Scanner(System.in);

        // Le asignamos un valor a cada opción usando los índices del arreglo
        // 0 - Piedra
        // 1 - Papel
        // 2 - Tijeras
        String piedra = "    _______\n" +
                "---'   ____\n" +
                "      (_____)\n" +
                "      (_____)\n" +
                "      (____)\n" +
                "---.__(___)\n" +
                "Piedra";

        String papel = "    _______\n" +
                "---'   ____)____\n" +
                "          ______)\n" +
                "          _______)\n" +
                "         _______)\n" +
                "---.__________)";

        String tijeras = "    _______\n" +
                "---'   ____)____\n" +
                "          ______)\n" +
                "       __________)\n" +
                "      (____)\n" +
                "---.__(___)";

        String[] opciones = { piedra, papel, tijeras };

        // El usuario elige su opción
        System.out.println("Elige una opción: ");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijeras");
        int seleccionUsuario = Integer.valueOf(sc.nextLine());

        // Tenemos que restar 1 en la opción que eligió el usuario para que coincida con
        // el índice
        System.out.println(opciones[seleccionUsuario - 1]);
        // No es necesario restar 1 porque el rango de los aleatorios es hasta 2
        System.out.println(opciones[numeroAleatorio]);

        // Falta determinar quién gana, pierde o si es empate
    }
}
