package pl.kurs.zad2;

public class Runner {
    public static void main(String[] args) {
        Service obl = new Service();
        System.out.println(obl.result(new int[]{1,12,8,5,6},"MAX"));
        System.out.println(obl.result(new int[]{1,4,0,5,6},"MIN"));
        System.out.println(obl.result(new int[]{1,4,8,5,6},"SUM"));
        System.out.println(obl.result(new int[]{1,4,8,5,6},"ALA"));


    }
}
