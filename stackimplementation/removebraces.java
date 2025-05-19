import java.util.Scanner;
import java.util.Stack;

public class removebraces {
    public static int removebrace(String str){
        Stack<Character> st =new Stack<>();
        int num=0;
        for(int i =0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch =='('){
                st.push(ch);
            }
            else{
               if(! (st.size() ==0)&& st.peek()=='('){
                st.pop();
               }
               else{
                num++;
               }
            }
        }
        return num+=st.size();
    
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the braces sequence:");
        String str =input.nextLine();
        int num = removebrace(str);
        System.out.println("the number of braces removing for balancing  "+num);
        
    }
    
}
