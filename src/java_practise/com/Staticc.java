package java_practise.com;

public class Staticc {

    int rollno;
    String name;
    static String college = "TECA";

    static void change() {
        Staticc.college = "JNTU";
    }

    public Staticc() {
    }


    public Staticc(int rno, String names) {
        rollno = rno;
        name = names;

    }

    public void test() {
        //System.out.println("Murthy Test");
        System.out.println(rollno + " -->" + name + "-->" + college);

    }

    public static void main(String[] args) {

        Staticc st1 = new Staticc();
        Staticc st2 = new Staticc(401, "Murthy");
        Staticc st3 = new Staticc(405, "Rachana");
        Staticc.change();

        st1.test();
        st2.test();
        st3.test();


    }
}
