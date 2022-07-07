package pl.kurs.zad1;

import java.util.Scanner;

public class Service {

    public int [] arrayOfNumbers(Scanner scanner){
        System.out.println("Podaj n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj kolejną liczbę: ");
            array[i] = scanner.nextInt();}
        return array;
    }}



