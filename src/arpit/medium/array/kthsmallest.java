package src.arpit.medium.array;

import java.util.Arrays;

public class kthsmallest {
    public static void main(String[] args){
        int[] arr= {1,3,4,62,2,7,3,9,10};
        int k =3;
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        int smallest = arr[k-1];
        System.out.println(Arrays.toString(arr));
        System.out.println(smallest);


    }
    
}
