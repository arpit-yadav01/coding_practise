package src.arpit.medium.array;

public class countdigit {
    public static void main(String[] args){

        int [] arr ={1,2,4,5,5,6,6,5,4,2};
        int target=5;
        int count=0;
        for (int i =0; i<arr.length; i++){
            if(arr[i]== target)
                count++;
        }
        System.out.println("the number of count is : " +count);
    }
    
}
