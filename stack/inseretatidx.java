import java.util.Scanner;
import java.util.Stack;

public class inseretatidx {
    public static Stack<Integer> iinsertatidx(int idx,Stack<Integer> st,int ele){
        Stack<Integer> rt =new Stack<>();
        while(st.size()>idx){
            rt.push(st.pop());
        }
        return st;

    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack <Integer> st =new Stack<>();
        System.out.println("enter the number of the element that you want to insert");
        int size = input.nextInt();
        System.out.println("now enter the each element ");
        for(int i =0;i<size;i++){
            int ele=input.nextInt();
            st.push(ele);
        }
        System.out.println(st);
        System.out.println("enter the index");
        int idx =input.nextInt();
        System.out.println("enter the element ");
        int ele =input.nextInt();
        st =iinsertatidx( idx,st, ele);
        System.out.println("now the stack is the after inseretion  "+st);
    }
    
}
