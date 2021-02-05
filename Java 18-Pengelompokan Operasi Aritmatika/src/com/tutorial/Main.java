package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // kesimpulannya adalah
        //perkalian atau pembagian akan dilakukan terlebih dahulu

        //jika dilakukan perkalian dan pembagian, maka
        // akan dilakukan operasinya dari kiri ke kanan

        int hasil = 5 * 10 /2;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        // menggunakan pengelompokan operasi dengan ( )
        hasil = 60 / ( 2 + 10 );
        System.out.println(hasil);

        Scanner scan = new Scanner(System.in);
        // perhitungan persamaan kuadrat

        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
        int y,m,x,c;
        System.out.print("Nilai x = ");
        x = scan.nextInt();
        System.out.print("Gradien m = ");
        m = scan.nextInt();
        System.out.print(" Bias C = ");
        c = scan.nextInt();

        y = (m * x * x) + c;
        System.out.println("Nilai y = "+y);
    }
}
