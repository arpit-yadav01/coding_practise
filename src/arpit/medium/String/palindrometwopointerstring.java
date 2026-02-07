package src.arpit.medium.String;

public class palindrometwopointerstring {
    public static void main(String [] args){
        String str = "madm";
        boolean ispalindrome= true;
        int left = 0;
        int right  = str.length() -1 ;

        for(int i =0; i< str.length (); i++){
            if(str.charAt(left) != str.charAt(right)){
                ispalindrome= false;
                break;
            }

            left++;
            right--;
        }

        if (ispalindrome){
            System.out.println("this is palindrome");
        }
        else{
            System.out.println("this is not palindrome");
        }
    }
    
}
