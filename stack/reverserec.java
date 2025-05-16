import java.util.Stack;

public class reverserec {
    static void pushAtBottom(Stack<Integer> st,int x){
        if(st.size() == 0){
            st.push(x);
            return;

        }
        int top =st.pop();
        pushAtBottom(st, top);
        st.push(top);

    }
    static void reverserecursuin(Stack<Integer> st){
        if(st.size()>1){
            return;

        }
        int top  =st.pop();
        pushAtBottom(st,top);
       

    }
    public static void main(String[] args) {
        createstack stack =new createstack();
        Stack<Integer> st = stack.createStack();
        System.out.println(st);
        reverserecursuin(st);
        System.out.println("after reverse"+st);
        
    }
    
}
