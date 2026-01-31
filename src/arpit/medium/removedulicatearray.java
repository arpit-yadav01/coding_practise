package src.arpit.medium;

import java.util.Scanner;

public class removedulicatearray {
    public static void main(String [] args){
     Scanner sc = new Scanner (System.in);
     System.out.println("enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int [n];

        System.out.println("enter the number");
     for(int i =0; i<n ; i++){
        arr[i]= sc.nextInt();
     }

     System.out.println("array after remove duplicates");

     for(int i =0; i<n; i++){
        Boolean isduplicates= false;

        for(int j= 0; j< i ;j++){
            if (arr[i] == arr[j]){
                isduplicates = true ;
                break;
            }

        }
        if(!isduplicates){
            System.out.println(arr[i] + " ");
        }



     }
    }
    
}
