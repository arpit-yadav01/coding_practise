package src.arpit.medium.String;

public class longestsubstingwithnonreapeted {
    public static void main(String [] args){
            String str = "arpiitt";
                int max=0;
            for(int i =0; i <str.length(); i++){
                String  temp ="";
                for (int j=i ; j<str.length() ; j++ ){
                    char ch = str.charAt(j);
                    
                    if(temp.contains(ch + "")){
                        break;
                    }
                    temp = temp+ch;
                }

                if (temp.length()> max){
                    max= temp.length();

                }
            }
            System.out.println("the max is " + max);
            
    }
    
}
