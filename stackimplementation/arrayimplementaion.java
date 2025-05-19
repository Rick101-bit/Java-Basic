import java.util.Scanner;

public  class arrayimplementaion{
    public static class Stack{
        private int[] arr;
        private int idx =0;
        Stack(int n){
            arr =new int[n];
        }
        void push(int ele){
            arr[idx] =ele;
            idx++;
        }void display(){
            System.out.println("the stack is ");
            for(int i =0;i<idx;i++){
                System.out.println(arr[i]);
            }
        }

        


    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ente the size of the stack :");
        int n =input.nextInt();
        Stack st = new Stack(n);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        
      st.display();
      st.arr[2] =10;
      System.out.println();
      st.display();
       
       
    }
    
}