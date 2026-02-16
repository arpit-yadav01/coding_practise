package src.arpit.medium.array;

public class mostrepeatedinterger {
    public static void main(String[] args){
        int[] arr = { 1,2,4,3,3,3,4,4,4,4,2,3};

        int maxcount= 0;
        int freq=arr[0];

        for(int i=0; i <arr.length; i++){
            int count =0;
            for (int j =0; j<arr.length; j++){
                if(arr[i]== arr[j]){
                    count ++;
                }

                if(count>maxcount){
                    maxcount= count;
                    freq= arr[i];
                }
            }
            
        }
        System.out.println("the nummber is  "+ freq +" is comes " +maxcount +" times");
            // System.out.println(" "+maxcount);
    }

    
}
