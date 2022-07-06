package pl.kurs.zad4;

public class Hourglass {

    public void narysujKlepsydre(int wys) {
        for (int i = 0; i <= wys / 2; i++) {
            for (int j = wys - i; j < wys; j++)
                System.out.print(" ");
            for (int j = 0; j < wys - 2 * i; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i < (wys + 1) / 2; i++) {
            for (int j = (wys / 2) + 2 + i; j <= wys; j++)
                System.out.print(" ");
            for (int j = 0; j <= i * 2; j++)
                System.out.print("*");
            System.out.println();
        }


    }
}

