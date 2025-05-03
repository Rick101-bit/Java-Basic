//given that a linkedlit where node is given as a parameter not index , and the deleted node wil;l not be present as last node or not be a tail  node
public class deletenode2 {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data= data;
        }
    }
    public static class linkedlist{
        node head =null;
        node tail =null;
        node insertAtEnd(int data){
            node temp =new node(data);
            if(head == null){
                head =temp;
            }
            else{
                tail.next =temp;
            }
            tail =temp;
            return temp;

        }
        void display(){
            node temp =head;
            while (temp!= null) {
                System.out.println(temp.data);
                temp =temp.next;
               
                
            }
            System.out.println();
        }
        void deletenode(node temp){
            temp.data =temp.next.data;
            temp.next = temp.next.next;

        }
    }
    public static void main(String[] args) {
        linkedlist ll =new linkedlist();
        node a = ll.insertAtEnd(2);
       node b = ll.insertAtEnd(4);
        node c =ll.insertAtEnd(5);
        node d =ll.insertAtEnd(6);
        ll.display();
        ll.deletenode(c);
        ll.display();
    }
    
}
