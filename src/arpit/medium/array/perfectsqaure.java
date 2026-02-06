package src.arpit.medium.array;

public class perfectsqaure {
    public static void main(String[] args ){
        int num = 9;
        boolean isperfect = false;
        for(int i =1; i *i<=num ; i++ ){
            if(num ==i*i  ){
                isperfect = true ; 
                break;
            }

        }
        if(isperfect){
            System.out.println("It is a perfect square");
        } else {
            System.out.println("It is not a perfect square");
        }

    }
    
}
