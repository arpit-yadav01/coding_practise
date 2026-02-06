package src.arpit.medium.oops;

public class compilepoly {
    public static void main(String[] args){
        calculator calc= new calculator();

        System.out.println ("the sum of 2 number is " + calc.add(4,10));
        System.out.println ("the sum of 3 number is : " + calc.add(5,10 , 15));
    }
    
}

class calculator{
    public int add( int a , int b){
        return a+b;
    }

    public int add(int a , int b, int c){
        return a+b+c;
    }
}
