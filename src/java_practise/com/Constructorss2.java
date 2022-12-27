package java_practise.com;

import java.util.Calendar;
import java.util.Date;

public class Constructorss2 {

    int a;
    String name;

    public static void main(String[] args) {

        Constructorss2 c = new Constructorss2(12);
        System.out.println(c.a);
        Constructorss2 c1 = new Constructorss2("Murthy");
        System.out.println(c1.name);
        //  c.m();

        Date d = new Date();

        System.out.println("mmmm" + Calendar.getInstance());


    }


    public Constructorss2(int aa) {
        a = aa;


    }

    public Constructorss2(String f) {
        name = f;

    }

//    public void m(){
//        System.out.println("Murthy");
//        this.m();
//
//    }


}
