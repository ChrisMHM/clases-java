import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenidx a la calculadora bomnita");
        System.out.println("Introduce tu primer número: ");
        int numero1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Introduce el segundo número: ");
        int numero2 = Integer.valueOf(scanner.nextLine());
        int suma = numero1 + numero2;

        System.out.println("La suma del número " + numero1 + " y el número " + numero2 + " es " + suma);

        int resta = numero1 - numero2;

        System.out.println("La resta del número " + numero1 + " y el número " + numero2 + " es " + resta);

        // División
        // Prueba 1 -> Error
        // numero1 = 1000
        // numero2 = 0
        // Prueba 2 -> Funciona
        // numero1 = 0
        // numero2 = 1000
        // Prueba 3 -> Error
        // numero1 = 0
        // numero2 = 0
        // Condicionales
    }
}
