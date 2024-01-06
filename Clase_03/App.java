import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Tipos de dato primitivos, son más sencillos
        int numeroEnteroPositivo = 1000;
        int numeroEnteroNegativo = -1000;
        long numeroEnteroDeDoblePrecision = 1000000000000000000l;
        float numeroFloat = 10.26666666666663f; // Se identifica con la letra f al final
        double numeroDouble = 100.23; // Tiene doble precisión de un float. Tipo de dato por defecto para manejar
                                      // numeros con decimal
        char letraCharA = 'a';
        char letraChar1 = '1';
        char comillaDoble = '"';
        boolean verdadero = true;
        boolean falso = false;

        // Tipo de dato objeto, son más complejos
        String palabraString = "Texto";
        Scanner scanner = new Scanner(System.in);
        int numero1 = Integer.valueOf(scanner.nextLine()); // 3
        int numero2 = Integer.valueOf(scanner.nextLine()); // 4
        int suma = numero1 + numero2; // 34
        // Casting
        // Convertir un tipo de dato primitivo (incluyendo a String) a otro
        // int -> long
        // long -> int
        // float -> double
        // Número String -> int (1000)
        // Número String -> double (1000.2)
        System.out.println(suma); // 3434
    }
}
