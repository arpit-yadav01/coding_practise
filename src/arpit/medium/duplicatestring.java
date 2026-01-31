package src.arpit.medium;
import java.util.Scanner;
public class duplicatestring {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the worsds");
        String str =  sc.nextLine();

        String result ="";

        for(int i = 0 ; i< str.length(); i++)
        {
            char ch= str.charAt(i);

            if(result.indexOf(ch)== -1){
                result = result +ch;
            }
        }
            System.out.println ("string after remove the duplicates " + result  );

    }
    
}
