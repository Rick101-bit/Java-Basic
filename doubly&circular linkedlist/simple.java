public class simple{
    public static class node {
        int data;
        node next;
        node prev;
        node(int data){
            this.data =data;
        }
       
    }
     public static class linkedlist{
        void display(node head){
            node temp =head;
            while(temp != null){
                System.out.println(temp.data);
                temp =temp.next;
            }
        }
        void displyr(node head){
            node temp =head;
            while(temp != null){
                System.out.println(temp.data);
                temp =temp.prev;
            }
        }
        
            
    }
    public static void main(String[] args) {
        node a =new node(2);
         node b =new node(3);
          node c =new node(4);
           node d =new node(5);
            node e =new node(6);
            a.next =b;
            b.prev =a;
            b.next =c;
            c.prev =b;
            c.next =d;
            d.prev =c;
            e.prev =d;
            d.next =e;
        linkedlist ll = new linkedlist();
        ll.display(a);
        System.out.println("this the reversely printed linkedlist");
        ll.displyr(e);
    }
    
        
}