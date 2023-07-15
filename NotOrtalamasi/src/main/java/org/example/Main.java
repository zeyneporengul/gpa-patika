package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mat, fiz, kim, tr, tarih, muzik;
        double ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fiz = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kim = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        tr = input.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        ortalama = (double) (mat + fiz + kim + tr + tarih + muzik) /6;
        System.out.println("Ortalamanız: "+ortalama);

        String sonuc = (ortalama >= 60) ? "Geçtiniz!" : "Kaldınız!";
        System.out.println(sonuc);
    }
}