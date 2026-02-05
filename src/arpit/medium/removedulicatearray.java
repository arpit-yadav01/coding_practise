package src.arpit.medium;

import java.util.Scanner;

public class removedulicatearray {
    public static void main(String [] args){
     int [] arr= {1,2,3,4,5,5,6};
      System.out.println("Array after removing duplicates:");
        
     for(int i=0;  i< arr.length; i++){
            boolean  isduplicates= false;

            for(int j =0 ; j<i ; j++){
                if (arr[i] == arr[j]){
                      isduplicates = true;
                      break;

                }
            } 
            if(!isduplicates){
                System.out.println (arr[i] + " "); 
            }
     }
    }
    
}
