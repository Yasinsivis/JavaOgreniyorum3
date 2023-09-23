package TaksiMetre;

import java.util.Scanner;

public class Hesapla {
    public static void main(String[] args) {
        double KMbası=2.20,km,Tutar;
        int Ac=10, min=20;
        Scanner inp=new Scanner(System.in);
        System.out.println("Gidilen Kilometreyi Giriniz:");

        km=inp.nextDouble();
        Tutar=(km*KMbası)+Ac;

        if(Tutar<20)
            Tutar=min;
        System.out.println("Toplam Tutar:"+Tutar);


    }
}
