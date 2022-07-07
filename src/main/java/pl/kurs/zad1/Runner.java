package pl.kurs.zad1;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Service service = new Service();
        System.out.println(Arrays.toString(service.arrayOfNumbers(scanner)));
    }
}
