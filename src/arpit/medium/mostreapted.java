package src.arpit.medium;

public class mostreapted {
    public static void main(String[] args){
    int [] arr= {1,3,4,4,5,6,4};
    int target= 4;
    int count=0;

    for (int i =0; i<arr.length; i++){
        if(arr[i] == target){
            count++;
        }
    }
    System.out.println(count);
}

}
