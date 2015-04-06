package thinkjava;

public class TJ0315_Casting {
    public static void main() {
        int i = 200;
        long lng = (long)i;
        lng = i; // "Расширение", явное преобразование не обязательно
        long lng2 = (long)200;
        lng2 = 200;
        // "Сужающее" преобразование:
        i = (int)lng2; // Преобразование необходимо
    }
}
