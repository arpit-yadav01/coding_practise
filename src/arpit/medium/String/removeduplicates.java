package src.arpit.medium.String;

public class removeduplicates {
    public static void main(String [] args){
        String str = "programming";

        String s = " ";
        for(int i =0; i < str.length() ; i++){
            char ch = str.charAt(i);

            if(s.indexOf(ch) == -1){
                s= s+ch;

            }

        }

        System.out.println("after the removing the duplicates " + s );
    }
    
}
