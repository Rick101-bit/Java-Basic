import java.util.Stack;

public class stl1 {
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        System.out.println(st.isEmpty());
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        System.out.println(st.peek());
        System.out.println( st.size());
        st.pop();
        System.out.println(st.peek());


    }

     
}