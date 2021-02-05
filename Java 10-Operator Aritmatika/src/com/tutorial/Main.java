package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // operasi aritmatika

        int variable1= 18;
        int variabel2= 5;

        int hasil;

        // 1. penjumlahan
        hasil  = variable1 + variabel2;
        System.out.println(variable1 + " + "+ variabel2 + " = " + hasil);

        // 2. pengurangan
        hasil  = variable1 - variabel2;
        System.out.printf("%d - %d = %d \n", variable1, variabel2, hasil);

        // 3. perkalian
        hasil  = variable1 * variabel2;
        System.out.printf("%d x %d = %d \n", variable1, variabel2, hasil);

        // 4. pembagian
        hasil  = variable1 / variabel2;
        System.out.printf("%d / %d = %d \n", variable1, variabel2, hasil);

        float a = 12;
        float b = 5;
        float hasilFloat =a/b;

        System.out.println(a + " / "+ b + " = " + hasilFloat);

        // 5. modulus(sisa bagi)
        hasil = variable1 % variabel2;
        System.out.printf("%d %% %d = %d", variable1,variabel2, hasil);

    }
}

