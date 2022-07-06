package pl.kurs.zad3.app;

import pl.kurs.zad3.model.Osoba;
import pl.kurs.zad3.services.OsobaSerivce;
import java.util.Arrays;
import java.util.Scanner;

public class OsobaServiceRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę osób: ");
        int n = scanner.nextInt();
        Osoba[] osoby = new Osoba[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Tworzenie osoby nr " + (i + 1) + "/" + n + ". Podaj imię: ");
            scanner.skip("\\R?");
            String imie =scanner.nextLine();
            System.out.println("Tworzenie osoby nr " + (i + 1) + "/" + n + ". Podaj nazwisko: ");
            String nazwisko = scanner.nextLine();
            System.out.println("Tworzenie osoby nr " + (i + 1) + "/" + n + ".Podaj pesel: ");
            String pesel = scanner.nextLine();
            osoby[i] = new Osoba(imie, nazwisko, pesel);
        }
        System.out.println(Arrays.toString(osoby));

        OsobaSerivce osobaSerivce = new OsobaSerivce();
        osobaSerivce.getSexFromPesel(osoby,"FEMALE");





    }
}
