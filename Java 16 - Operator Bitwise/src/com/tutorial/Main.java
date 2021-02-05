package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // Operator Bitwise --> operator untuk melakukan operasi pada nilai bit

        byte a = 3;
        byte b,c;
        String a_bits, b_bits, c_bits;



        // operator SHIFT LEFT
        System.out.println("====SHIFT LEFT (<<)");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = (byte)(a << 1);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n", b_bits,b);

        System.out.println(" ");

        // operator SHIFT RIGHT
        System.out.println("====SHIFT RIGHT (>>)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = (byte)(a >> 1);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n", b_bits,b);

        System.out.println(" ");

        // operator BITWISE OR
        System.out.println("====BITWISE OR ( | )");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n", b_bits,b);
        System.out.println("-------------OR");
        c = (byte)(a | b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n", c_bits,c);

        System.out.println(" ");

        // operator BITWISE AND
        System.out.println("====BITWISE AND ( & )");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n", b_bits,b);
        System.out.println("-------------AND");
        c = (byte)(a & b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n", c_bits,c);

        // operator BITWISE EX-OR
        System.out.println("====BITWISE EX-OR ( ^ )");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n", b_bits,b);
        System.out.println("-------------EX-OR");
        c = (byte)(a ^ b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n", c_bits,c);

        // Operator Negasi / Not
        System.out.println("====BITWISE NOT ( ~ )");
        a = 24;
        b = (byte)(~a);
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits,a);
        b_bits = String.format("%8s",Integer.toBinaryString(b).substring(24));
        System.out.printf("%s = %d \n", b_bits,b);
    }
}
