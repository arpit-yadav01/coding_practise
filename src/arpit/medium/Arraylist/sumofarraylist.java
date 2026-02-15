package src.arpit.medium.Arraylist;

import java.util.ArrayList;

public class sumofarraylist {
    public static void main(String[ ] args){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        int sum=0;
        for ( int i =0 ; i <arr.size(); i ++){
            sum +=arr.get(i);
        }
        System.out.println ("the sum of arraylist is " + sum);
    }
    
}
