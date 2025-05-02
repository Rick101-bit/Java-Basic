public class ll {
    public static void display(node head){
        node temp =head;
        while(temp!=null){
            System.out.println(temp.data);
            temp =temp.next;
        }
    }
    public static class node{
        int data;
        node next;
        node(int data){
            this.data =data;
        }
    }
    public static void main(String[] args) {
        node a =new node(5);
        node b =new node(9);
        node c =new node(10);
        System.out.println(a.data);
        a.next =b;
        b.next =c;
        System.out.println(a.next.data);
        //displaying the linked list 
        node temp =a;
         while(temp !=null){
         System.out.println(temp.data);
         temp =temp.next;
         }
        display(a);
    }
    
}
