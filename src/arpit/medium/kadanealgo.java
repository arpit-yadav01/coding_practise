package src.arpit.medium;

public class kadanealgo {
    public static void main(String [] args){
        int[] arr = {-1, 4, -3, -4, 2, 5, 1, -1};

        int currentsum = 0;
        int maxsum = arr[0];
            int start = 0, end = 0, tempStart = 0;
        for(int i = 0; i < arr.length; i++){
            currentsum = currentsum + arr[i];

            if(currentsum > maxsum){
                maxsum = currentsum;
                start = tempStart;
                end = i;
            }

            if(currentsum < 0){
                currentsum = 0;
                tempStart = i + 1;
            }
        }

        System.out.println(maxsum);
       System.out.print("Subarray Elements: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
