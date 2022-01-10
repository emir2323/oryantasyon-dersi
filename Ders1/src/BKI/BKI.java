package BKI;
import java.util.Scanner;
public class BKI {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("lütfen cinsiyet giriniz:");
        String cinsiyet = klavye.nextLine();
String kadın=klavye.nextLine();
String erkek=klavye.nextLine();
        System.out.println("lütfen adım sayısı giriniz:");
        double adimsayisi = klavye.nextInt();
        double kalori = klavye.nextDouble();
        if (cinsiyet.equals(kadın)) {
            kalori = (adimsayisi * 30) / 500;

        } else if (cinsiyet.equals(erkek)) kalori = (adimsayisi * 45) / 500;

            System.out.println("kaloriniz:" + kalori);


    }
}



