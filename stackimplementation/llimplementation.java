class node{
    int data;
    node next;
    node(int data){
        this.data =data;
    }
}
class stack{
    private node head =null;
    private int  size =0;
    void push(int val){
        node temp =new node(val);
        temp.next =head;
        head =temp;
        size++;
    }
    void display(){
        node temp =head;
        while (temp !=null) {
            System.out.println(temp.data);
            temp =temp.next;
            
        }
    }
    int pop(){
        if(size ==0){
            System.out.println("the stack is empty");
            return -1;
        }
        int val =head.data;
        head =head.next;
        return val;

    }
    int peek(){
        if(is_empty()){
            System.out.println("the stack is empty");
            return -1;
        }
        return head.data;
    }
    boolean is_empty(){
        if(size ==0){
            return true;
        }
        return false;
    }


}
public class llimplementation {
    
    public static void main(String[] args) {
        stack st =new stack();
        st.push(2);
         st.push(3);

          st.push(4);
          st.push(5);
          st.display();
          System.out.println("the top element is "+st.peek());
          st.pop();
          System.out.println("after the popping thee stack is ");
          st.display();
          System.out.println(st.peek());
          System.out.println(st.is_empty());
       


        
    }
    
}
