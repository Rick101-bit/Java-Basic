public class practiceiii {
    public static class node {
        int data;
        node next;
        node(int data){
            this.data =data;
        }
    
        
    }
    public static class linkedlist{
        node head =null;
        node tail =null;
        int count =0;
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
        void display(){
            node temp =head;
            while(temp != null){
                System.out.println(temp.data);
                temp =temp.next;
            }
        }

    }
    public static void main(String[] args) {
        linkedlist ll =new linkedlist();
        ll.insertAtEnd(3);
        ll.insertAtEnd(3);
        ll.insertAtEnd(3);
        ll.display();
    }
    
}
