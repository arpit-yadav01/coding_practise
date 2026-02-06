package src.arpit.medium.array;

import java.util.Arrays;

public class moveallzero {
    public static void main(String [] args){
        int [] arr= {1,3,4,0 ,5,0,3};
        int index=0;
        int [] arr2 = new int[arr.length];
        for(int i =0 ; i< arr.length ; i++){
            if (arr[i]!=0){
                arr2[index]=arr[i];
                index++;
            }
        }
        while(index<arr2.length){
            arr2[index]=0;
                index++;
            
        }
        
            System.out.println(Arrays.toString(arr2));
        

        }
    }
    

