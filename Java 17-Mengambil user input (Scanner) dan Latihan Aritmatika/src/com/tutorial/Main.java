package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;

        System.out.println("===MENGHITUNG LUAS===");
        System.out.print("Panjang = ");
        panjang = scan.nextInt();
        System.out.print("Lebar = ");
        lebar = scan.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = "+luas);

        System.out.println("===MENGHITUNG VOLUME===");
        System.out.print("Tinggi = ");
        tinggi = scan.nextInt();

        volume=luas*tinggi;
        System.out.println("volume = "+volume);
    }
}
