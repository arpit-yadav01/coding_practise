package src.arpit.medium.Arraylist;

import java.util.ArrayList;

public class maxmin {
    public static void main(String [] args){

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);

        int min = arr.get(0);
        int max = arr.get(0);
        int sum = 0;
        int average;

        for(int i = 0; i < arr.size(); i++)
        {
            if(arr.get(i) > max){
                max = arr.get(i);
            }

            if(arr.get(i) < min){
                min = arr.get(i);
            }

            sum = sum + arr.get(i);
        }

        average = sum / arr.size();

        System.out.println("the max of arraylist " + max);
        System.out.println("the min of arraylist " + min);
        System.out.println("the average is " + average);
    }
}
