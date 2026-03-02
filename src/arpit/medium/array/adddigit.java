package src.arpit.medium.array;

public class adddigit {
    // public static void main(String [] args){
    //     int num = 38;

    //     while(num>=10){
    //         int sum = 0;
    //         while(num>0){
    //             sum = sum +num%10;
    //             num = num /10;

    //         }
    //         num = sum +num;
    //     }
    //     System.out.println(num);

    // }




















    public static void main(String[] args){
        int num =89;

        
        while(num >=10){
            int sum =0;
            while(num>0){

            sum = sum +num %10;
            num= num/10;
            }
            num = sum +num ;
        }
        System.out.println(num);
    }
    
    
}
