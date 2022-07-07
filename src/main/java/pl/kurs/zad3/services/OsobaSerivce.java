package pl.kurs.zad3.services;

import pl.kurs.zad3.model.Osoba;
import java.util.Arrays;

public class OsobaSerivce {

    private Osoba[] osoby;

    public OsobaSerivce(int n) {
        this.osoby = new Osoba[n];
    }

    public Osoba [] getSexFromPesel(Osoba[] inputArray, String sex) {
        int cnt = 0;
        Osoba[] tmpf = new Osoba[inputArray.length];
        Osoba[] tmpm = new Osoba[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            int j = Character.getNumericValue(inputArray[i].getPesel().toCharArray()[10]);
            if (j % 2 == 0) {
                tmpf[cnt++] = inputArray[i];
            } else tmpm[cnt++] = inputArray[i];
        }
        if (sex.equals("FEMALE"))
            return tmpf;
        else return tmpm;
    }
}

