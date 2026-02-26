package src.arpit.medium.oops;

public class inheritance {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.sleep();
        d.bark();
    }
}

class Animal {

    public void eat() {
        System.out.println("The animal eats food");
    }

    public void sleep() {
        System.out.println("The animal is sleeping");
    }
}

class Dog extends Animal {

    public void bark() {
        System.out.println("The dog is barking");
    }
}