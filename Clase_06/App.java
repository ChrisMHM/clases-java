import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // const arreglo = ['nombre', 1, true, 'a'];
        // float[] arregloFloat = {};
        // String[] arrgloString = { "Christian", "Denisse", "Carlos", "Pao" };
        // char[] arregloChar = { 'a', 'e', 'i', 'o', 'u' };
        // double[] arregloDouble = { 1, 20.6f, 10.5 }; // 3 datos, length = 3
        Scanner scanner = new Scanner(System.in);

        // ArrayList<> lista = new ArrayList<>();
        // lista.add(1);
        // lista.add("Hola");
        // lista.add(20.6f);
        // lista.add(1);
        // lista.add(1);

        // for(punto de inicio; condicional para paro; pasos)
        // for(1, 2, 4) {
        // 3
        // }

        // int[] arregloInt = { 1, 2, 3, 4, 5, 10 }; // 6 datos, length = 6

        // for (int chuchita = 0; chuchita < 6; chuchita++) {
        // // Contenido
        // System.out.println(arregloInt[chuchita]);
        // }

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("no")) {
                break;
            }

            // if(input === "no") {

            // }

            System.out.println("Hola");
        }

        // int i = 10;

        // i++; // Operador de incremento ++
        // // i = i + 1; // 10 + 1 = 11
        // // Cuál es la diferencia entre i++ e i = i + 1???
        // // ++i ??????
        // // ++i++ ?????
        // System.out.println("i = i + 1 " + i);
        // i--; // Operador de decremento --
        // // i = i - 1; // 11 - 1 = 10
        // // --i
        // // --i--
        // System.out.println("i = i - 1 " + i);
        // i += 2; // i = i + 2;
        // i *= 4; // i = i * 4;
    }
}
