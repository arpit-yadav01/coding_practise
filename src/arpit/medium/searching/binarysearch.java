package src.arpit.medium.searching;

public class binarysearch {
    public static void main(String[] args){
        int [] arr ={1,2,3,4,5,6};

        int target= 5;

        for(int i =0 ; i<arr.length; i++){
            if(arr[i] == target){
                target = arr[i];
                System.out.println("the "+ target +" is present on this index is " + arr[i]);
            }
        }

    }
    
}
