package src.arpit.medium.oops;

public class inheritance {
    public static void main(String[] args){
        dog d = new dog();

        d.eat();
        d.sleep();
        d.bark();
    }
    
}

    class Animal{
        public void eat(){
            System.out.println ("the animal is eat food");
        }
        public void sleep(){
            System.out.println("the animal is sleeping");
        }
    }
        class dog extends Animal {
            public void bark(){
                System.out.println("the animal is barking");
            }
        }
    