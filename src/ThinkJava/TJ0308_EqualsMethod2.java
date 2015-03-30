package ThinkJava;

class Value {
    int i;
}

public class TJ0308_EqualsMethod2 {
    public static void main() {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
    }
}
