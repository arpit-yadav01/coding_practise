package src.arpit.medium;

public class secondlargest {
    public static void main(String[] args){
        int [] arr={ 1,5,3,7,8};
int max = Integer.MIN_VALUE;
int max2 = Integer.MIN_VALUE;
        for(int i =0 ;i<arr.length;i++)
        {
           
            
            if(arr[i]>max)
            {
                max2 = max;
                max = arr[i];
            
                
            }

        }
        System.out.println("max : "+max+" second max : "+max2);
    }
    
}
