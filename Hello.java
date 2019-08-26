package ru.lanit.first;

public class Hello {
    public static void main (String[] args) {
        int a = 20;
        double b = 20.0;
        String c = new String("Hello, World!");
        int d = 1;
        boolean e = true;
        System.out.println("Hello, World!");
        System.out.println(a==b);
        for (int i = 1; i < 9; i++) {
            if (e == true) {
                System.out.println(c+String.valueOf(d));
                System.out.println();
                d = (a == b) ? d+1 : d+2;

            } else {
                break;
            }
        }
    }
}
