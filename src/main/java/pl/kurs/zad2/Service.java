package pl.kurs.zad2;

public class Service {
    public int max(int[] array) {
        int maximum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        return maximum;
    }

    public int min(int[] array) {
        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int n : array) {
            sum = sum + n;
        }
        return sum;
    }


    public String result(int[] array, String operator) {
        return switch (operator) {
            case "MAX" -> "Maksimum: "+ max(array);
            case "MIN" -> "Minimum: " + min(array);
            case "SUM" -> "Suma: " + sum(array);
            default -> "Błędny operator.";
        };
    }
}
