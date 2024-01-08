public class Ejercicio {
    public static void main(String[] args) {
        int edad = 20;

        // Si la edad es negativa, que se muestre en la consola este mensaje: "Error,
        // edad inválida. Por favor ingrese un número válido."
        if (edad < 0) {
            System.out.println("Error, edad inválida. Por favor ingrese un número válido.");
        }
        if (edad < 18) {
            System.out.println("No puede pasar al bar.");
        } else if (edad < 21) {
            System.out.println("Puede pasar al bar, pero no puede tomar alcohol.");
        } else {
            // Si tiene 21 años, además de darle la bienvenida, felicitarlo por haber
            // llegado a
            // la mayoría de edad.
            System.out.println("Puede pasar al bar y tomar alcohol.");
            System.out.println("Felicidades por ser mayor de edad.");
        }

        // Si su edad es impar, decirle en cualquiera de los mensajes: "¿Sabías que tu
        // edad es impar?".
    }
}
