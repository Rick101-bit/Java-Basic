import java.util.Stack;

public class removeindexrec {
    static void removebottomrec(Stack <Integer> st){
        if(st.size()==0){
            return;
        }
        removebottomrec(st);
        int top =st.pop();
          removebottomrec(st);
        st.push(top);
        System.out.println(st);
    }
    public static void main(String[] args) {
        createstack stack = new createstack();
        Stack<Integer> st =stack.createStack();
        System.out.println(st);
        removebottomrec(st);
        System.out.println(st);

    }
    
}
