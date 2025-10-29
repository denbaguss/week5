package week_5;

import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        double alas, tinggi, luas, keliling, sisi;

        Scanner Scan= new Scanner(System.in);

        System.out.println("masukkan panjang alas segitiga");
        alas=Scan.nextDouble();

        System.out.println("massukan panjang keliling segitiga");
        tinggi=Scan.nextDouble();

        System.out.println("masukkan pangjang sisi segitiga sama sisi");
        sisi=Scan.nextDouble();


        luas = 0.5*alas*tinggi;
        keliling = sisi+sisi+sisi;

        System.out.println("nilai luas :" +luas);
        System.out.println("nilai keliling :" +keliling);
        
    }
    

}
