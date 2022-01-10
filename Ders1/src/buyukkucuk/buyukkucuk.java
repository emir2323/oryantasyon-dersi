package buyukkucuk;
import java.util.Scanner;
public class buyukkucuk {
    public static void main(String[] args){

        Scanner klavye=new Scanner(System.in);
        System.out.println("lütfen A sayısını giriniz:");
        double A=klavye.nextDouble();
        System.out.println("lütfen B sayısını giriniz:");
        double B =klavye.nextDouble();
        if (A > B){
            System.out.println("A sayısı büyüktür");
        }
        else {
            System.out.println("B sayısı büyüktür");
        }

        }

    }

