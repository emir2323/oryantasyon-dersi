package ucunkatı;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int sayı = klavye.nextInt();

        if (sayı % 3 == 0) {
            System.out.println(sayı + " " + "sayısı üçün katıdır.");

        } else {
            System.out.println(sayı + " " + "sayısı üçün katı değildir.");


        }
    }
}
