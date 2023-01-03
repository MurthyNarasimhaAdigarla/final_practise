package java_practise.com;

public class My_Calculation extends Calculation {
    public void mul(int a, int b) {
        z = a * b;
        System.out.println("The mul of the given numbers:"+z);
    }

    public void sub(int a, int b) {
        z = a - b;
        System.out.println("The sub child of the given numbers:"+z);
        super.sub(3,6);
    }

    public static void main(String[] args) {
        My_Calculation a1 = new My_Calculation();
        a1.add(10,11);
        a1.sub(21,34);
        a1.mul(2,7);


    }


}
