// Example of Polymorphism

class Student {
    String name;
    int age;

    public void informations(String name) {
        System.out.println("Student's name is:" + name);
    }

    public void informations(int age) {
        System.out.println("Student's age is:" + age);
    }

    public void informations(String name, int age) {
        System.out.println("Student's name is:" + name + "  " + "and his age is:" + age);
    }

}

public class Oops2 {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Vishwas";
        s1.age = 16;

        s1.informations(s1.age);
        s1.informations(s1.name);
        s1.informations(s1.name, s1.age);

    }
}
