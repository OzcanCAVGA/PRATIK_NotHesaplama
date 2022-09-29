/*
Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik, ort;

        Scanner yazici = new Scanner(System.in);

        System.out.println("Lutfen Matematik notunuzu girin:");
        mat = yazici.nextInt();

        System.out.println("Lutfen Fizik notunuzu girin:");
        fizik = yazici.nextInt();

        System.out.println("Lutfen Kimya notunuzu girin:");
        kimya = yazici.nextInt();

        System.out.println("Lutfen Turkce notunuzu girin:");
        turkce = yazici.nextInt();

        System.out.println("Lutfen Tarih notunuzu girin:");
        tarih = yazici.nextInt();

        System.out.println("Lutfen Muzik notunuzu girin:");
        muzik = yazici.nextInt();


        ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        String durum = ort >= 60 ? "Sinifi Gecti" : "Sinifta Kaldi";

        System.out.println(durum);
    }
}
