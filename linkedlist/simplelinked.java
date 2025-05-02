public class simplelinked {

    public static class node{
        int data;
        node next;
        node(int data){
            this .data =data;
        }
    }
    public static void display(node head){
        node temp =head;
        while(temp != null){
            System.out.print(temp.data+" ");
            System.out.println(temp);
            temp= temp.next;
        }

    }
    public static void main(String[] args) {
        node a =new node(3);
        node b =new node(4);
        node c =new node(5);
        node d =new node(6);
        a.next=b;
        b.next =c;
        c.next =d;
        display(a);


    }
}