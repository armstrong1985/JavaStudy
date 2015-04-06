package thinkjava;

public class TJ0312_URShift {
    public static void main() {
        int i = -1;
        System.out.println("int i = -1 to BIN =   " + Integer.toBinaryString(i) + "   = " + i);
        i >>>= 10;
        System.out.println("i >>>=10 to BIN =     " + Integer.toBinaryString(i) + "   = " + i);

        long l = -1;
        System.out.println("long l = -1 to BIN =  " + Long.toBinaryString(l) + "   = " + l);
        l >>>= 10;
        System.out.println("l >>>= 10 to BIN =    " + Long.toBinaryString(l) + "   = " + l);

        short s = -1;
        System.out.println("short s = -1 to BIN = " + Integer.toBinaryString(s) + "   = " + s);
        s = (short)(s>>>10);
        System.out.println("s >>>= 17 to BIN =    " + Integer.toBinaryString(s) + "   = " + s);

        byte b = -1;
        System.out.println("byte b = -1 to BIN =  " + Integer.toBinaryString(b) + "   = " + b);
        b >>>= 10;
        System.out.println("b >>>= 10 to BIN =    " + Integer.toBinaryString(b) + "   = " + b);
        b = -1;
        System.out.println("b = -1 to BIN =       " + Integer.toBinaryString(b) + "   = " + b);
        System.out.println("b >>> 10 to BIN =     " + Integer.toBinaryString(b >>> 10) + "   = " + (b >>> 10));
    }
}
