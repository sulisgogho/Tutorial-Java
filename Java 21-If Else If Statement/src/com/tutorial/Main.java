package com.tutorial;

public class Main {
    public static void main(String[] args) {

        int a = 10;

        System.out.println("ini adalah awal program");

        if (a < 5) {
            System.out.println("ini adalah aksi 1");
        } else if ( a  > 5 && a < 20) {
            System.out.println("ini adalah aksi 2");
        } else {
            System.out.println("ini adalah aksi 3");
        }

        System.out.println("ini adalah akhir program");
    }
}
