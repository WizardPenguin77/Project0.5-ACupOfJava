// OverridingDemo.java
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the method from Animal
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound(); // calls Dog’s version
    }
}