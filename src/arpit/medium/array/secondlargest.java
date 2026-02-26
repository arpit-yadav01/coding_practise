package src.arpit.medium.array;

public class secondlargest {
    public static void main(String[] args) {

        int[] arr = {3, 5, 4, 7, 6};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        System.out.println("Second largest: " + second);
    }
    
}
