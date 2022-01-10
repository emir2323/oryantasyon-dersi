package enkucuksayı;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz:");
        int sayi1=klavye.nextInt();
        System.out.println("Lütfen 2. sayıyı giriniz:");
        int sayi2=klavye.nextInt();
        System.out.println("Lütfen 3. sayıyı giriniz:");
        int sayi3=klavye.nextInt();
        int enkucuk=sayi1;
        if (sayi2<enkucuk){
            enkucuk=sayi2;
        }
        if (sayi3<enkucuk){
            enkucuk=sayi3;
        }
        System.out.println("Girilen sayılardan en küçüğü:"+" "+enkucuk);




    }
}
