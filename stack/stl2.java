import java.util.Scanner;
import java.util.Stack;

public class stl2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Stack <Integer> st =new Stack<>();
        Scanner input =new Scanner(System.in);
        System.out.println("ente the number of the element that yiu eant ti inser in the stack");
        int n =input.nextInt();
        System.out.println("now enter the each element ");
        for(int i =0;i<n;i++){
            int ele =input.nextInt();
            st.push(ele);
        }
        System.out.println(st);
    }
    
}
