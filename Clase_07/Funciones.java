package Clase_07;

public class Funciones {
    public static void main(String[] args) {
        System.out.println(mensaje("Denisse", 15));
    }

    /*
     * tipoDeDatoQueRegresa nombre(tipoDeDatoQueRecibe nombreParametro){
     * 
     * return debeSerElMismoTipoDeDato;
     * }
     */

    static String mensaje(String nombre, int edad) {
        edad = edad * 5;
        return "Hola, " + nombre + ", tienes " + edad + " años";
    }

    int funcionInt(double miDoble) {
        return -4;
    }

    float funcionFloat(String miString) {
        return 100000.222f;
    }

    double funcionDouble(int[] miArreglo) {
        return 0.0;
    }

    String funcionString() {
        return "Hola";
    }

    // void -> la función no regresa nada
    void funcionVoid(char miChar) {
    }

    // [] -> define un arreglo
    int[] funcionArreglosInt() {
        int[] arreglo = { 1, 2, 3, 4, 5 };
        return arreglo;
    }

    boolean funcionBoolean() {
        // return true;
        // return false;
        return 9 < 10; // true
    }
}
