//removing the nth element from the last using single traversal using sloiw and fast
public class program3 {
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
        void display(){
            node temp =head;
            while(temp !=null){
                System.out.println(temp.data);
                temp =temp.next;
            }
        }
        void removeElement(int n){
            node temp =head;
            node slow =head;
            node fast =head;
            for(int i =1;i<=n;i++){
                fast =fast.next;
            }
            if(fast ==null){
                head =head.next;
                return;
            }
            while(fast.next !=null){
                slow =slow.next;
                fast =fast.next;
            }
            slow.next =slow.next.next;

        }
        
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
        ll.insertAtEnd(9);
        ll.display();
        ll.removeElement(5);
        System.out.println("after removing nth element");
        ll.display();
        

    }
    
}
