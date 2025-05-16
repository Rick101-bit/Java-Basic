import java.util.Stack;

public class removeindex {
    static void removeatbottom(Stack<Integer> st){
        Stack<Integer> rt =new Stack<>();
        while(st.size()>1){
            rt.push(st.pop());
        }
        st.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println("the stack after the reomoving of bottom element is"+st);

    }
    public static void main(String[] args) {
      createstack rr =new createstack();
      Stack<Integer> st =rr.createStack();
      System.out.println(st);
      removeatbottom(st);

    }
    
}
