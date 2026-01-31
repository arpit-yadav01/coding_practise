package src.arpit.medium;

import java.util.Arrays;

public class anagramstring {
    public static void main (String[] args){
        String first ="listen";
        String second = "silent";
        
        first= first.toLowerCase();
        second= second.toLowerCase();

        if(first.length() != second.length()){
            System.out.println ("this is not anagram");

        }

        char[] arr1= first.toCharArray();
        char [] arr2 = second.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    
        if(Arrays.equals(arr1, arr2)){
            System.out.println("this is anagram words");

        }
        else{
            System.out.println("this is not anagram");
        }



    }
    
}
