package src.arpit.medium;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] main){
        int [] arr ={1,4,3,2,7,6 };

        //  Arrays.sort(arr);
        //  System.out.println(Arrays.toString(arr));

        for(int i=0; i<arr.length -1; i++){
            for(int j=0; j<arr.length -1 -i; j++){
                if(arr[j]> arr[j+1]){
                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
    
}
