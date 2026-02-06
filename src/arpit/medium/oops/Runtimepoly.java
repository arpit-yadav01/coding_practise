package src.arpit.medium.oops;

public class Runtimepoly {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();

        a.sounds(); // Animal method
        d.sounds(); // Dog overridden method
    }
}

class Animal {
    public void sounds() {
        System.out.println("Animal makes sounds");
    }
}

class Dog extends Animal {
    @Override
    public void sounds() {
        System.out.println("The animal is barking");
    }
}
