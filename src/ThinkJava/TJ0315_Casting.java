package thinkjava;

public class TJ0315_Casting {
    public static void main() {
        int i = 200;
        long lng = (long)i;
        lng = i; // "����������", ����� �������������� �� �����������
        long lng2 = (long)200;
        lng2 = 200;
        // "��������" ��������������:
        i = (int)lng2; // �������������� ����������
    }
}
