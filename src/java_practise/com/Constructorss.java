package java_practise.com;

public class Constructorss {

    int a;
    int b;


    Constructorss() {

    }

    Constructorss(int x, int y) {
        a = x;
        b = y;


    }

    public void test() {
        int z = a + b;
        System.out.println(z);

    }

    public static void main(String[] args) {
        Constructorss c1 = new Constructorss();
        Constructorss c2 = new Constructorss(10, 20);
        Constructorss c3 = new Constructorss(30, 40);
        c1.test();
        c2.test();
        c3.test();

    }


}