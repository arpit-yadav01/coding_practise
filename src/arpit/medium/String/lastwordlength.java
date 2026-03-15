package src.arpit.medium.String;

public class lastwordlength {
    public static void main(String [] args){

        String s = "hello world";

        int count=0;
        int i = s.length()-1;

        while(i>= 0 && s.charAt(i)==' ' ){
            i--;
        }


        while(i>=0 && s.charAt(i) != ' '){
            count++;
            i--;
        }
        System.out.println(count);
        
    }
    
}

    
