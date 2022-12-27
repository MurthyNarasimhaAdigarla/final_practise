package java_practise.com;

public class Constructorss {

    int id;
    String name;

    public Constructorss(int eid, String ename) {
        id = eid;
        name = ename;
    }

    public Constructorss(int eid) {
        id = eid;
    }

    public static void main(String[] args) {

        Constructorss c = new Constructorss(15, "m");
        System.out.println(c.id + "   " + c.name);
        Constructorss c1 = new Constructorss(12);
        System.out.println(c1.id);

    }
}
