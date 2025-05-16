import java.util.Scanner;
import java.util.Stack;

public class copystl {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("enter the size of the stack");
        int size = input.nextInt();
        System.out.println("now enter the each element of the stack");
        for(int i = 0;i<size;i++){
            int ele =input.nextInt();
            st.push(ele);
        }
        System.out.println(st);
        Stack <Integer> rt =new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println("thei sis the reverse of the stack ");
        System.out.println(rt);
        Stack<Integer> gt =new Stack<>();
        while (rt.size()>0) {
            gt.push(rt.pop());
            
        }
        System.out.println("now the stack is "+gt);

    }
    
}
