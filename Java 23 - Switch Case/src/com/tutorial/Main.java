package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // switch case

        // ekspresi berupa satuan (int, long,byte,short), string, atau enum

        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Panggil nama :");
        input = inputUser.next();
        System.out.println(input);

        switch(input){
            case "otong":
                System.out.println(" saya otong dan hadir bos");
        }
    }
}
