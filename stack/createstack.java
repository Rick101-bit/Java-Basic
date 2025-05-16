import java.util.Scanner;
import java.util.Stack;
@SuppressWarnings("resource")
public class createstack {
    public Stack<Integer> createStack(){
        Scanner input =new Scanner(System.in);
         Stack <Integer> st =new Stack<>();
        System.out.println("enter the size of the stack ");
        int size =input.nextInt();
        System.out.println("now ente the each element of the stack");
        for(int i =0;i<size;i++){
            int ele =input.nextInt();
            st.push(ele);
        }
     
        return st;
    }
  
    public static void main(String[] args) {
        createstack rr =new createstack();
        rr.createStack();
        
       
    }
    
}
