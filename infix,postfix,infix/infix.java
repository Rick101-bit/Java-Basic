import java.util.Scanner;
import java.util.Stack;
public class infix {
    //8-5*4+1
    static int evaluation(String str){
        Stack<Integer> val =new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i =0;i<str.length();i++){
            char ch =str.charAt(i);
            int ascii =(int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }
            else if (op.size() ==0) {
                op.push(ch);
                
            }
            else{
                if(ch=='+' ||ch=='-'){
                    int val2=val.pop();
                    int val1 =val.pop();
                    if(op.peek() =='+'){
                        val.push(val1+val2);
                    }
                    if(op.peek() =='-'){
                        val.push(val1-val2);
                    }
                    if(op.peek() =='*'){
                        val.push(val1*val2);
                    }
                    if(op.peek() =='/'){
                        val.push(val1/val2);
                    }
                    op.pop();
                    op.push(ch);
                }
                if(ch=='*'||ch=='/'){
                    if(op.peek()=='*'||op.peek() =='/'){
                        int val2 =val.pop();
                        int val1 =val.pop();
                        if(op.peek() =='*'){
                            val.push(val1*val2);
                        }
                        if(op.peek() =='/'){
                            val.push(val1/val2);
                        }
                        op.pop();
                    }
                    else{
                        op.push(ch);
                    }

                }
            }


        }
        while(val.size()>1){
            int val2 =val.pop();
            int val1 =val.pop();
            if(op.peek() =='+'){
            val.push(val1+val2);
            }
            if(op.peek() =='-'){
              val.push(val1-val2);
            }
            if(op.peek() =='*'){
                val.push(val1*val2);
            }
            if(op.peek() =='/'){
                val.push(val1/val2);
            }
            op.pop();
            

        }
        int res =val.peek();
        return res;


    }

@SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the expression ");
        String str =input.nextLine();
        for(int i =0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
        int result =evaluation(str);
        System.out.println("the dinal result is"+result);
        
    }
}