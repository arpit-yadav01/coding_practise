package src.arpit.medium.String;

public class nonreapeted {
    public static void main(String[] args){
        String str ="arpait";
        char result = ' ';

        for(int i =0; i <str.length() ; i++){
            char ch = str.charAt(i);
            int count =0;
            for(int j =0 ; j<str.length() ; j++){
                if(str.charAt(j) == ch){
                    count++;
                }
            }
            if(count ==1){
                result = ch;
                break;
            }

            
       
            
        }
         if (result != ' ')
            System.out.println("First non-repeating character: " + result);
        else
            System.out.println("No non-repeating character found");
    }  
    
}
