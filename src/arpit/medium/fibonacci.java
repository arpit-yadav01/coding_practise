package src.arpit.medium;

public class fibonacci {
    public static void main( String [] args){

        int number =10;
        int a =0 ;
        int b=1;

        for(int i =0 ; i<number ; i++){
            System.out.print(a + " ");
            int c = a+b;
            
            a=b  ;
            b=c;
        }
       
    }
    
}
