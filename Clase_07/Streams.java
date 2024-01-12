package Clase_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Streams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
    }

}