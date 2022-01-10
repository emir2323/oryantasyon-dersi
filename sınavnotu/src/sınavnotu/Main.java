package sınavnotu;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz:");
        int not=klavye.nextInt();
        if (not>=90 && not<=100){
            System.out.println("Mükemmel A ile geçtiniz");
        }
        else if (not>=80 && not<90){
            System.out.println("Gayet iyi B ile geçtiniz");
        }
        else if (not>=70 && not<80 ){
            System.out.println("İyi C ile geçtiniz");
        }
        else if (not>=50 && not<70){
            System.out.println("Fena Değil D ile geçtiniz");

        }
        else if (not>=0 && not<50 ){
            System.out.println("Maalesef F ile kaldınız");
        }
        else{
            System.out.println("Lütfen geçerli bir not giriniz");
        }

    }
}
