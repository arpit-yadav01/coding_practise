package src.arpit.medium;

public class secondlargest {
    public static void main(String[] args){
        int [] arr ={1,3,5,6,8,7};

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i =0; i <arr.length; i++){
            if (arr[i]> max)
{
    max2 = max;
    max= arr[i];
}  
else if (arr[i] > max2  && arr[i] != max) {
                max2 = arr[i];
            }
      }
System.out.println("the maximum is " +max + ",  the second maximum " + max2) ;
    }
    
}
