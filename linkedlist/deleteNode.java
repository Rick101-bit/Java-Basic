public class deleteNode {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data =data;
        }

    }
    public static class linkedlist{
        node head =null;
        node tail =null;
        void insertAtEnd(int data){
            node temp =new node(data);
            if(head == null){
                head =temp;
            }
            else{
                tail.next =temp;
            }
            tail =temp;
        }
        void deleteAtIndex(int idx){
            node temp = head;
            for(int i =1;i<=idx-1;i++){
                temp =temp.next;
            }
           temp.next =temp.next.next;
        }
        void display(){
            node temp =head;
            while(temp !=null){
                System.out.println(temp.data);
                temp =temp.next;
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        linkedlist ll =new linkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
        ll.insertAtEnd(9);
        ll.display();
       // ll.deleteAtIndex(3);
        ll.deleteAtIndex(4);
        ll.display();
    }
    
}
