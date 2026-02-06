package src.arpit.medium.array;

public class frequencyiofnumber {
    public static void main(String [] args){
        int [] arr ={1,1,2,3,4,2,3,4,2};


        for(int i =0; i<arr.length ; i++){

        
        int count =0;
        for(int j =0; j<arr.length ; j++){
            if(arr[j]==arr[i]){
                count++;
            }
            
        }
        System.out.println("the number of frequecy of this " + arr[i] + " is " +  count );
        
    }
}
}
