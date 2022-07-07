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


    public int result(int[] array, String operator) {
        return switch (operator) {
            case "MAX" -> max(array);
            case "MIN" -> min(array);
            case "SUM" -> sum(array);
            default -> 0;
        };
    }
}
