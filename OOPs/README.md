# Object-Oriented Programming (OOP) in Java

## Introduction

Object-Oriented Programming (OOP) is a programming paradigm that uses objects, which are instances of classes,
to design and organize code. Java is a popular object-oriented programming language that follows the principles of OOP.

## OOP Properties

### 1. **Encapsulation**

Encapsulation is the concept of bundling data and methods that operate on that data within a single unit, known as a class.
It restricts direct access to some of an object's components and can prevent the accidental modification of data.

Example in Java:

```java
public class EncapsulationExample {
    private int data;

    public int getData() {
        return data;
    }

    public void setData(int newData) {
        this.data = newData;
    }
}
```

### 2. **Inheritance**

Inheritance is a mechanism that allows a class to inherit properties and behaviors from another class. 
It promotes code reusability and establishes a relationship between a superclass (base class) and a subclass (derived class).

Example in Java:

```java
public class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

public class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
```

### 3. **Polymorphism**

Polymorphism allows objects of different types to be treated as objects of a common type. 
It provides a way to perform a single action in different ways. In Java, polymorphism can be 
achieved through method overloading and method overriding.

Example in Java:

```java
public class PolymorphismExample {
    void display(String message) {
        System.out.println("Displaying: " + message);
    }

    void display(int number) {
        System.out.println("Displaying: " + number);
    }
}
```

### 4. **Abstraction**

Abstraction involves hiding the complex reality while exposing only the essential parts. 
In Java, abstraction is achieved through abstract classes and interfaces.
Abstract classes may have abstract methods that are implemented by concrete subclasses.

Example in Java:

```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}
```

