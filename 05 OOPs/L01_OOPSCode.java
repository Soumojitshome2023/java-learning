// File Name: L01_OOPSCode.java
// Topic: OOPS in Java (Object-Oriented Programming)

public class L01_OOPSCode {

    // ===================== MAIN METHOD =====================
    public static void main(String[] args) {

        // -------- Object Creation --------
        Student s1 = new Student("Soumojit", 21);
        Student s2 = new Student("Raj", 20);

        // Calling object methods
        s1.display();
        s2.display();

        // -------- Encapsulation --------
        s1.setAge(22); // updating age using setter
        System.out.println("Updated Age: " + s1.getAge());

        // -------- Inheritance --------
        Dog dog = new Dog();
        dog.eat();   // inherited method
        dog.bark();  // own method

        // -------- Polymorphism --------
        Calculator calc = new Calculator();
        System.out.println("Add int: " + calc.add(5, 3));
        System.out.println("Add double: " + calc.add(5.5, 3.2));

        // -------- Abstraction --------
        Shape shape = new Circle();
        shape.draw();
    }
}

/*
===================== OOPS PILLARS =====================
1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction
======================================================
 */
// ===================== 1. CLASS & OBJECT =====================
class Student {

    // Data members (variables)
    private String name;
    private int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter (Encapsulation)
    public int getAge() {
        return age;
    }

    // Setter (Encapsulation)
    public void setAge(int age) {
        this.age = age;
    }

    // Method
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// ===================== 2. INHERITANCE =====================
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

// ===================== 3. POLYMORPHISM =====================
class Calculator {

    // Method Overloading (Compile-time Polymorphism)
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// ===================== 4. ABSTRACTION =====================
abstract class Shape {

    // Abstract method
    abstract void draw();
}

class Circle extends Shape {

    // Implementing abstract method
    void draw() {
        System.out.println("Drawing a Circle");
    }
}
