import java.util.Scanner;
import java.util.Stack;

public class insert {
     Stack<Integer> insertatbottom(int ele,Stack<Integer> st){
        Stack <Integer> rt =new Stack<>();
        while (st.size()>0) {
            rt.push(st.pop());
            
        }
        st.push(ele);
        while (rt.size()>0) {
            st.push(rt.pop());
            
        }

   
    return st;
    }
     @SuppressWarnings("resource")
   
    public static void main(String[] args) {
        Stack <Integer> st =new Stack<>();
             
        Scanner input =new Scanner(System.in);
        System.out.println("enter the size of the stack");
        int size =input.nextInt();
        System.out.println("now enter the each element ");
        for(int i =0;i<size;i++){
            int ele =input.nextInt();
            st.push(ele);


        }
        System.out.println("the stack is "+st);
        insert ll =new insert();
        st = ll.insertatbottom(4,st);
        System.out.println("after insertion at the bottom the stack is");
        System.out.println(st);

        
        
    }
    
}
