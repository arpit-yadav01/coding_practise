package src.arpit.medium.array;

public class leftrotate {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int k = 2;
        int n = arr.length;

        int[] result = new int[n];

      
        for(int i = 0; i < n - k; i++){
            result[i] = arr[i + k];
        }

        // copy first k elements to end
        for(int i = 0; i < k; i++){
            result[n - k + i] = arr[i];
        }

        // print result
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
