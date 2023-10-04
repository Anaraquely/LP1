public class Exercicio2 {
    public Exercicio2() {
    }

    public static void main(String[] args) {
        System.out.println("_________________________________");
        a();
        System.out.println("_________________________________");
        b();
        System.out.println("_________________________________");
        c();
        System.out.println("_________________________________");
        d();
        System.out.println("_________________________________");
        e();
        System.out.println("_________________________________");
        f();
        System.out.println("_________________________________");
    }

    public static void a() {
        System.out.println("A) ");
        int a = 10;
        int b = 20;
        System.out.println(b);
        b = 5;
        System.out.println("" + a + ", " + b);
    }

    public static void b() {
        System.out.println("B) ");
        int a = 30;
        int b = 20;
        int c = a + b;
        System.out.println(c);
        b = 10;
        System.out.println(b + c);
        c = a + b;
        System.out.println(a + b + c);
    }

    public static void c() {
        System.out.println("C) ");
        int a = 10;
        int b = 20;
        int c = 0;
        a = c;
        c = b;
        b = a;
        System.out.println("" + a + ", " + b + ", " + c);
    }

    public static void d() {
        System.out.println("D) ");
        int a = 10;
        int b = a + 1;
        a = b + 1;
        b = a + 1;
        System.out.println(a);
        a = b + 1;
        System.out.println("" + a + ", " + b);
    }

    public static void e() {
        System.out.println("E) ");
        int a = 10;
        int b = 5;
        int c = a + b;
        b = 20;
        a = 10;
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
    }

    public static void f() {
        System.out.println("F) ");
        int x = 1;
        int y = 2;
        int z = y - x;
        System.out.println(z);
        x = 5;
        y = x + z;
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);
    }
}

