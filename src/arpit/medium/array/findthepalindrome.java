package src.arpit.medium.array;

public class findthepalindrome {
    public static void main(String [] args){
        int num = 112134;
        String s = String.valueOf(num);

        for(int i=0 ; i<s.length(); i++){
            for( int j =i+1 ; j<=s.length(); j++){
                String part = s.substring(i , j );
                if (part.length() > 1 && ispalindrome(part)){
                    System.out.println ("this is the palindrome " + part);
                }
            }


        }
    }

    static boolean ispalindrome(String str){
        int left =0 ; int right = str.length()-1;

       
        while (left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
                
            }
            left++;
                right--;
            
        }
        return true;

    }
    
}
