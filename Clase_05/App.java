import java.util.Scanner;

public class App {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        int result = number * 2;
        System.out.println(result);
    }
}