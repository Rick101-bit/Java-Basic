import java.util.Scanner;
 class stack{
        private int[] st;
        private int top;
        private int size;
        stack(int n){
            st = new int[n];
            size =n;
            top =-1;
        }
        void push(int ele){
            if(top == size-1){
                System.out.println("the dtack is overflow ");
                return;

            }
            st[++top] =ele;
        }
        int pop(){
            if(top ==-1){
                System.out.println("the stack is in underflow");
                return -1;
            }
            return st[top--];
           
        }
        int peak(){
            if(top == -1){
                System.out.println("the stack is in underflow ");
                return -1;
            }
             return st[top];
        }
        boolean is_empty(){
            return top== -1;
        }
        boolean is_full(){
            return top ==size-1;
        }
        void display(){
            if(top == -1){
                System.out.println("the stack is underflow ");
                return;
            }
            for(int i =0;i<=top;i++){
                System.out.println(st[i]);

            }
        }
}
public class simple {
     
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the  stack ");
        int n =input.nextInt();
        stack st =new stack(n);
         st.push(6);
         st.push(7);
         st.push(8);
         st.push(9);
        st.display();
        System.out.println("this is the poped element");
       System.out.println( st.pop());
       System.out.println("after poping the element the stack is ");
       st.display();
       System.out.println("the peak element is");
       System.out.println(st.peak());
       System.out.println(st.is_empty());
       System.out.println("the stack is ");
       st.display();
       

    }
    
}
