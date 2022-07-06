package pl.kurs.zad1;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj kolejną liczbę: ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Tablica ma postać: " + Arrays.toString(array));
    }
}
