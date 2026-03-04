package src.arpit.medium.array;

public class counttheinteger {
    public static void main(String[] args){
        int num=12673;

        int count =0;

        while(num>0){
            num = num/10;
            count++;
            

        }
        System.out.println (count);
    }
    
}
