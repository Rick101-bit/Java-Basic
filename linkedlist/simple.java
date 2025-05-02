public class simple {
    public static class node{
        int data ;
        node next;
        node(int data){
            this.data =data;
        }

    }
    public static void display(node head){
        node temp =head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp =temp.next;
        }
    }
    //we can display the linked list using recursive function
    public static void diaplayr(node head){
        if(head == null){
            return;
        }
        System.out.print(head.data+" ");
        diaplayr(head.next);
    }

    public static void main(String[] args) {
        node a =new node(5);
        node b =new node(7);
        node c =new node(8);
        node d =new node(10);
        a.next = b;
        b.next =c;
        c.next =d;
        d.next = null;
        display(a);
        System.out.println();
        display(a);
        System.out.println();
        diaplayr(b);
        
        
        
    }
}