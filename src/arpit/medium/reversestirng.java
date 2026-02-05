package src.arpit.medium;

public class reversestirng {
    public static void main(String[] args){
        String str = "arpit yadav";

        String reverse = " ";

    

        for(int i=str.length()-1; i >=0;  i--){
            reverse = reverse +str.charAt(i);
        }
        System.out.println("ater reverese " + reverse);
    }
    
    
}
