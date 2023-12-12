package AdvanceJava;

abstract class Animal {
    abstract void makeSound();

    public void eat() {
        System.out.println("I can eat.");
    }
}

class Dog extends Animal {

    //implementation of abstract method
    public void makeSound() {
        System.out.println("I can Bark");
    }
}

class JavaAbstraction {
    public static void main(String[] args) {

        // create an object of Dog class
        Dog d1 = new Dog();

        d1.makeSound();
        d1.eat();
    }
}