package src.arpit.medium.Arraylist;
import java.util.ArrayList;
public class countevenodd {
   public static void main(String[] args) {

    
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

    
        int even = 0;
        int odd = 0;

        for (int num : list) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(even);
        result.add(odd);

        
        System.out.println("Result ArrayList = " + result);
        System.out.println("Even = " + result.get(0));
        System.out.println("Odd = " + result.get(1));
    }
    
}
