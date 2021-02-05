package com.tutorial;

public class Main {
    public static void main(String[] args) {
        System.out.println("=======TIPE DATA FUNDAMENTAL ATAU PRIMITIF=======");
        System.out.println(" ");
        System.out.println(" ");

        // tipe data di java :
        // integer, byte, short, long, double, float, char, boolean

        //integer (satuan)
        int i = 10;
        System.out.println("=====INTEGER=====");
        System.out.println("Nilai Integer   = " + i );
        System.out.println("Nilai Max       = " +Integer.MAX_VALUE);
        System.out.println("Nilai Min       = " + Integer.MIN_VALUE);
        System.out.println("Besar Integer   = " + Integer.BYTES + " bytes");
        System.out.println("Besar Integer   = " + Integer.SIZE + " bit");

        //byte (satuan)
        byte b = 10;
        System.out.println("=====BYTE=====");
        System.out.println("Nilai Byte      = " + b );
        System.out.println("Nilai Max       = " + Byte.MAX_VALUE);
        System.out.println("Nilai Min       = " + Byte.MIN_VALUE);
        System.out.println("Besar Byte      = " + Byte.BYTES + " bytes");
        System.out.println("Besar Byte      = " + Byte.SIZE + " bit");

        //short (satuan)
        short s = 10;
        System.out.println("=====SHORT=====");
        System.out.println("Nilai Short     = " + s );
        System.out.println("Nilai Max       = " + Short.MAX_VALUE);
        System.out.println("Nilai Min       = " + Short.MIN_VALUE);
        System.out.println("Besar Short     = " + Short.BYTES + " bytes");
        System.out.println("Besar Short     = " + Short.SIZE + " bit");

        //long(satuan)
        long l = 10L;
        System.out.println("=====LONG=====");
        System.out.println("Nilai Long      = " + l );
        System.out.println("Nilai Max       = " + Long.MAX_VALUE);
        System.out.println("Nilai Min       = " + Long.MIN_VALUE);
        System.out.println("Besar Long      = " + Long.BYTES + " bytes");
        System.out.println("Besar Long      = " + Long.SIZE + " bit");

        //double(koma)
        double d = 10.5D;
        System.out.println("=====DOUBLE=====");
        System.out.println("Nilai Double    = " + d );
        System.out.println("Nilai Max       = " + Double.MAX_VALUE);
        System.out.println("Nilai Min       = " + Double.MIN_VALUE);
        System.out.println("Besar Double    = " + Double.BYTES + " bytes");
        System.out.println("Besar Double    = " + Double.SIZE + " bit");

        //float (koma)
        float f = -8.5f;
        System.out.println("=====FLOAT=====");
        System.out.println("Nilai Float     = " + f );
        System.out.println("Nilai Max       = " + Float.MAX_VALUE);
        System.out.println("Nilai Min       = " + Float.MIN_VALUE);
        System.out.println("Besar Float     = " + Float.BYTES + " bytes");
        System.out.println("Besar Float     = " + Float.SIZE + " bit");

        //char (character berdasarkan ASCII)
        char c = 'c';
        System.out.println("=====CHAR=====");
        System.out.println("Nilai Character c = " + c );
        System.out.println("Nilai Character = " + Character.MAX_VALUE);
        System.out.println("Nilai Character = " + Character.MIN_VALUE);
        System.out.println("Besar Character = " + Character.BYTES + " bytes");
        System.out.println("Besar Character = " + Character.SIZE + " bit");

        //Boolean (Nilai Benar atau Salah)
        boolean val = false;
        System.out.println("=====BOOLEAN=====");
        System.out.println("Nilai Boolean Val = " + val );
        System.out.println("Nilai Max         = " + Boolean.TRUE);
        System.out.println("Nilai Min         = " + Boolean.FALSE);

    }
}
