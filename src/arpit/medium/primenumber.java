package src.arpit.medium;
import java.util.Scanner;
public class primenumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num =sc.nextInt();

        if(num<=1){
            System.out.println("prime number");
            return;
        }
            for (int i = 2 ; i <=num/2; i++){
                if (num %i ==0){
                    System.out.println("is a not prime number");
                    return;
                }
            }
            System.out.println(" prime number");


            
    }
}

