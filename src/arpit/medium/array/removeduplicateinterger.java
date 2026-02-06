package src.arpit.medium.array;
import java.util.Scanner;
public class removeduplicateinterger {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();

        String number = String.valueOf(num);
        String result =" ";

        for(int i =0 ; i <number.length(); i++){
            char digit = number.charAt(i);

            if(result.indexOf(digit) == -1){
                    result = result + digit;
            }
        }
        System.out.println("Number after the remove duplicates " + result );
    }
    
}
