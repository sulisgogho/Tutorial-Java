package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // membuat sebuah objek untuk membuat input dari user
        Scanner scan = new Scanner(System.in);

        // sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 7;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukkan Nilai Tebakan Anda : ");
        nilaiTebakan = scan.nextInt();
        System.out.println("Nilai tebakan Anda adalah : "+nilaiTebakan);

        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan Anda : "+statusTebakan);

        System.out.println("Masukkan nilai diantara 4 dan 9 :");
        nilaiTebakan = scan.nextInt();

        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan<9);
        System.out.println(" tebakan anda : "+statusTebakan);
    }
}
