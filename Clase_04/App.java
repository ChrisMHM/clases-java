public class App {
    public static void main(String[] args) {
        // Reasignación de variables
        int entero = 10; // Inicialización
        // float flotante = 20.5f; // Inicialización

        // System.out.println(entero);
        // System.out.println(flotante);

        entero = 8;
        // flotante = 10.5f;

        // System.out.println("Resignacion");
        // System.out.println(entero);
        // System.out.println(flotante);

        int entero2 = 5;
        entero = entero2;
        entero2 = entero;

        System.out.println("Resignacion de los numeros enteros");
        System.out.println(entero); // 5 DAN;
        System.out.println(entero2); // 8 DAN;
        // Pruebas de escritorio
        // Lápiz y papel. Escribir paso por paso cómo van cambiando las variables a
        // través del tiempo

        // Condicionales
        // Operadores de comparación, arrojan respuestas lógicas -> verdadero o falso;
        // true o false
        // >, <, =, !
        // ¿9 > 8? -> ¿9 es mayor que 8? true
        // ¿9 < 8? -> ¿9 es menor que 8? false
        // ¿9 == 8? -> ¿9 es igual que 8? false
        // =, == -> excepto en JavaScript ===
        // ¿9 != 8? ¿9 es distinto de 8? true
        // ¿9 >= 8? -> ¿9 es mayor o igual que 8? true
        // ¿9 <= 8? -> ¿9 es menor o igual que 8? false

        // Lógica positiva, procurar trabajar con lógica positiva
        // Sencilla
        if (9 > 8) {
            System.out.println("Es mayor");
        }

        System.out.println("Es menor");
        // If - Else
        if (8 != 8) {
            System.out.println("Es diferente");
        } else {
            System.out.println("Son iguales"); // Aquí entra
        }

        System.out.println("Continua la ejecución");

        // If - Else If - Else
        // Si la persona es menor de edad, dale una paleta
        // Si es mayor de 18 años pero menor de 60, dale un bonk
        // Si es mayor de 60, dale un abrazo
        int edad = 60;
        if (edad < 18) {
            System.out.println("Te ganaste una paleta");
        } else if (edad < 60) {
            System.out.println("Te ganaste un bonk");
        } else {
            System.out.println("Te ganaste un abrazo"); // Aquí entra
        }

        // Operadores lógicos
        // Tipo boolean
        // Verdadero - 1 - 5 volts
        // False - 0 - 0 volts
        // Operaciones booleanas
        // AND (y) -> && (ampersand)
        // OR (o) -> || (pleca)
        // NOT (no) -> ! (admiración cierre)
        // NOR -> NOT OR (no o)
        // NAND -> NOT AND (no y)

    }
}
