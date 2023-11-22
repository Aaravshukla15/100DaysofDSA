// import java.util.Arrays;

class Student {
    String gender;
    String color;

    public void play() {
        System.out.println("Student is Playing");
    }

    public void bOg() {
        System.out.println(this.color + " " + "Student is:" + "  " + this.gender);
    }

    // Student() {
    // System.out.println("NP Constructor Called:");
    // } NP Constructor

    // Student(String gender, String color) {
    // this.gender = gender;
    // this.color = color;
    // } Paramaterized Constructor

    Student() {

    }

    // It's copy constructor, where properties of s1 is getting copied on s2.
    Student(Student s2) {
        this.gender = s2.gender;
        this.color = s2.color;
    }
}

public class Ooops1 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.gender = "male";
        s1.color = "brown";
        // here new is a keyword which allocates a memory to a object. It's a special
        // type of fucntion termed as constructor.
        // Constructors name is as same as class name. Constructor does not have any
        // return type.
        // For each object we can call a constructor only once
        // In java constructor is of three type, 1) Non-Paramaterised Constructor
        // 2) Paramaterized Constructor, 3) Copy Constructor

        Student s2 = new Student(s1);

        s1.bOg();
        s1.play();
        s2.bOg();
        s2.play();
    }
}