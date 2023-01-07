package star_pattern.com;

public class Person {


        public String name;
        public int age;
        public static String address;

        public static void main(String[] args){
            Person john = new Person();


            john.name = "John";
            john.age = 35;
            john.address = "101 Main St";

            System.out.println(john.name);
            System.out.println(john.age);
            System.out.println(john.address);


            Person smith = new Person();
            System.out.println(smith.name);
            System.out.println(smith.age);
            System.out.println(smith.address);
        }
    }
