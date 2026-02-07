package src.arpit.medium.stack;

public class stackusingarray {
   int [] stack = new int[5];

   static int top=-1;

    static void push(int value) {
        if (top == 4) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed");
        }
    }
    
}
