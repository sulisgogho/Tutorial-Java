package com.tutorial;

public class Main {
    public static void main(String[] args) {

        String cinta = "tidak";
        String kesempatan = "tidak";
        String baik = "iya";

        System.out.println("Apakah kamu cinta dia?????");
        if (cinta == "iya"){
            System.out.println("Iya, saya sangat mencintainya");
        } else {
            System.out.println("Tidak");
            System.out.println("Apakah kamu memberinya kesempatan?");
            if (kesempatan == "iya"){
                System.out.println("Saya memberinya kesempatan");
            }else{
                System.out.println("Tidak");
                System.out.println("Mengapa?");
                if (baik == "iya"){
                    System.out.println("karena dia terlalu baik untukku");
                }else {
                    System.out.println("karena dia nakal");
                }
            }
        }

    }
}
