package src.arpit.medium.Arraylist;

import java.util.ArrayList;

public class printaarraylsit {
    public static void main(String[] args){

        ArrayList<Integer> arr = new ArrayList<>(); 

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);


        for (int i=0 ; i <arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
    
}
