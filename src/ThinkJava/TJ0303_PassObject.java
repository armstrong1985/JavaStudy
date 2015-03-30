package ThinkJava;

class Letter {
    char c;
}

public class TJ0303_PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }
    public static void main() {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);
    }
}
