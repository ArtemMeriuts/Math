public class DZ5 {
    int a;
    int b;

    public static void sum (int a, int b) {
        int c = a+b;
        System.out.println (c);

    }

    public static void sum (int b) {
        int d = 4 + b;
        System.out.println(d);
    }

    public static void minus (int a, int b) {
        int c = a-b;
        System.out.println(c);
    }

    public static void minus (int a){
        int d = 4-a;
        System.out.println(d);
    }

    public static void multiply  (int a, int b){
        int c = a*b;
        System.out.println(c);
    }

    public static void division (int a, int b) {
        int c = a/b;
        System.out.println(c);

    }

    public static void division () {
        double d = 22.5 / 4.5;
        System.out.println(d);

    }

    public static void division2 () {
        double k = 10 / 4;
        System.out.println(k);

    }

    public static void division3 () {
        double k = 10.0 / 4;
        System.out.println(k);

    }

    public static void rest (int a, int b) {
        int c = a%b;
        System.out.println(c);
        int d = 22 % 4;
        System.out.println(d);


    }

    public static void prefixIncrement () {
        int a = 8;
        int b = ++a;
        System.out.println(b);
        System.out.println(a);


    }

    public static void postfixIncrement () {
        int a = 8;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
    }

    public static void postfixIncrement2() {
        int a = 8;
        int b = --a;
        System.out.println(a);
        System.out.println(b);
    }

    public static void postfixIncrement3 () {
        int a = 8;
        int b = a--;
        System.out.println(a);
        System.out.println(b);

    }

    public static void priority () {
        int a = 8;
        int b = 7;
        int c = (a + 5) * ++b;
        System.out.println(c);

    }

    public static void associativity () {
        int x = 10 / 5 * 2;
        System.out.println(x);

    }

    public static void floatingPoint () {
        double d = 2.0 - 1.1;
        System.out.println(d);

    }


    
    public static void main(String[] args) {

        DZ5.sum(10, 7);
        DZ5.sum(7);
        DZ5.minus(10, 7 );
        DZ5.minus(10);
        DZ5.multiply(10, 7);
        DZ5.division(20,5);
        DZ5.division();
        DZ5.division2();
        DZ5.division3();
        DZ5.rest(33, 5);
        DZ5.prefixIncrement();
        DZ5.postfixIncrement();
        DZ5.postfixIncrement2();
        DZ5.postfixIncrement3();
        DZ5.priority();
        DZ5.associativity();
        DZ5.floatingPoint();



    }













}

