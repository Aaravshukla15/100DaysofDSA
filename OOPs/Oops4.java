// Abstraction 
// abstract class and abstract methods

// abstract class Animals {
//     abstract void walk();
// }

interface Animals {
    public void walk();
}

class Horse implements Animals {
    public void walk() {
        System.out.println("Horse can walk on 4 legs...");
    }
}

class Kangaroo implements Animals {
    public void walk() {
        System.out.println("Kangaroo can walk on 2 legs...");
    }
}

public class Oops4 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        Kangaroo Kangii = new Kangaroo();
        Kangii.walk();
    }
}
