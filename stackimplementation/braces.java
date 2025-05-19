import java.util.*;

public class braces {
    public static boolean isBalanced(String str){
         Stack<Character> charStack = new Stack<>();
         int size =str.length();
         for(int i =0;i<size;i++){
            char ch =str.charAt(i);
            if(ch =='('){
                charStack.push(ch);
            }else{
                if(charStack.size() == 0){
                    return false;
                }
                if(charStack.peek() == '('){
                    charStack.pop();
                }
            }
         }
          if(charStack.size() == 0){
                return true;
            }
            else{
                return false;
            }
         

         
      
         
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the astring of the braces");
        String str =input.nextLine();
        System.out.println(isBalanced(str));

        
    }
    
}
