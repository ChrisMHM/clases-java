public class Condicional {
    public static void main(String[] args) {
        // Ejemplo 1
        // Si la persona es menor de edad, dale una paleta
        // Si es mayor de 18 años pero menor de 60, dale un bonk
        // Si es mayor de 60, dale un abrazo
        int edad = 60;
        // if (edad < 18) {
        // System.out.println("Te ganaste una paleta");
        // } else if (edad < 60) {
        // System.out.println("Te ganaste un bonk");
        // } else {
        // System.out.println("Te ganaste un abrazo");
        // }

        // Ejemplo 2
        // Si la persona es menor de edad y mide menos 1.30m, se puede subir a un juego
        // mecánico con un adulto
        // Si la persona es menor de edad y mide más de 1.30m, se puede subir al juego
        // solo
        // Si la persona es mayor de edad, solo puede ver
        edad = 17;
        double estatura = 1.31;

        if ((edad < 18) && (estatura < 1.30)) {
            System.out.println("Necesitas a un adulto para subir.");
        } else if ((edad < 18) && (estatura > 1.30)) {
            System.out.println("Te puedes subir al juego solx.");
        } else {
            System.out.println("Solo puedes ver");
        }
    }
}
