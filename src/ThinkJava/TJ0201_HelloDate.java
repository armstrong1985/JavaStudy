package thinkjava;
import java.util.Date;

/** Первая программа-пример книги.
 * Выводит строку и текущее число.
 * @author Брюс Эккель
 * @author www.MindView.net
 * @version 4.0
 */
public class TJ0201_HelloDate {
    /** Точка входа в класс и приложение
     * @param Массив строковых аргументов
     * @throws exceptions Исключения не выдаются
     */
    public static void main() {
        System.out.println("Привет, сегодня: ");
        System.out.println(new Date());
    }
}
