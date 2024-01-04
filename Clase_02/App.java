import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Creando un objeto scanner de tipo Scanner
        Scanner scanner = new Scanner(System.in);
        // Usando el objeto scanner
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Introduce tu edad: ");
        String edad = scanner.nextLine();
        // Imprimiendo el mensaje en pantalla
        // System.out.println(entrada);
        // +, operador de concatenacion
        System.out.println("Hola " + nombre + " tienes " + edad);
    }
}