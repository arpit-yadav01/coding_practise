package src.arpit.medium;

public class countdigit {
    public static void main(String[] args){

        int [] arr= { 1, 1, 2,3,4,4,5,4,4};
        int target=4;
        int count=0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == target ){
                count ++;
            }
        }
        System.out.println( "target element count is " + count );
    }
    
}
