package src.arpit.medium.array;
import java.util.Arrays;
public class kthlargest {
    public static void main(String[] args){
        int[] arr={2,3,5,4,5,7,8};

        int k =3;

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int largest = arr[arr.length- k];

        System.out.println(largest);
    }
    
}
