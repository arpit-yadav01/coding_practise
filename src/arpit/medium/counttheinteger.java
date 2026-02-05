package src.arpit.medium;

public class counttheinteger {
    public static void main(String[] args){
        int num=123;

        int count =0;

        while(num>0){
            num = num/10;
            count++;
            

        }
        System.out.println (count);
    }
    
}
