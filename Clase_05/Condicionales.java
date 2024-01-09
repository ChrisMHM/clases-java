public class Condicionales {
    public static void main(String[] args) {
        int edad = 45;

        // Con if, va a validar en cada condicional aunque ya se haya cumplido una
        if (edad < 18) {
            System.out.println("Menor");
        }

        if (edad >= 18 && edad < 30) {
            System.out.println("Adulto joven");
        }

        if (edad >= 30 && edad < 50) {
            System.out.println("Adulto");
        }

        if (edad >= 50) {
            System.out.println("Adulto mayor");
        }

        // Con if-else, va a validar en cada condicional hasta que una sea verdadera
        // Si es verdadera, ya no continua validando
        if (edad < 18) {
            System.out.println("Menor");
        } else if (edad >= 18 && edad < 30) {
            System.out.println("Adulto joven");
        } else if (edad >= 30 && edad < 50) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }
    }
}
