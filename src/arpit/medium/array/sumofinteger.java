package src.arpit.medium.array;

public class sumofinteger {
    public static void main(String[] args){
        int num =983;
        int digit =0;
        int sum=0;

        while(num> 0){
            digit = num%10;
            sum = sum + digit;
            num =num/10;

        }
        System.out.println(sum);

        
    }
    
}
