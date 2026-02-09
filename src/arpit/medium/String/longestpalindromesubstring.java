package src.arpit.medium.String;

public class longestpalindromesubstring {
    public static void main(String [] args){
        String s = "racecar";

        String longest= "";

        for(int i=0 ; i <s.length(); i++){
            for (int j =i+1; j<=s.length(); j++){
                String part = s.substring(i, j);

                if(ispalindrome(part) && part.length() > longest.length()){
                    longest= part;
                }
            }
        }
        System.out.println("the longest number is " + longest);
    }

    static boolean ispalindrome(String str){
        int left =0 ; int right = str.length() -1;
        while(left<right){
            if (str.charAt(left) != str.charAt(right)){
                return  false;

            }
            left++;
            right--;

        }
       
        return true;

    }
    
}
