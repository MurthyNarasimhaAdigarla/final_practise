package java_practise.com;

public class Variables {

    //static variables
    static int m = 100;

    //Instance Variables
    String mm = "Murthy-class";


    public static void main(String[] args) {
        Variables v = new Variables();
        //Local Variables
        int m = 10;
        String mm = "Murthy";


        System.out.println(m + mm);
        System.out.println(Variables.m + v.mm);

    }
}
