public class middlelinked2 {
    public static class  node{
        int data;
        node next;
        node(int data){
            this.data =data;
        }

    } 
    public static class linkedlist {
        node head = null;
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
            count++;

        }
        void display(){
            node temp =head;
            while(temp !=null){
                System.out.println(temp.data);
                temp =temp.next;
            }

        }
       
        //for odd length of th elinkedlist the condition will be(first.next !=null)
        //for right middle in even length the condition will bed (first !=null)
        //for left middle in even length the condition will be (first.next.next !=null)
        node midddleLinked(){
            node slow = head;
            node first =head;
            while(first.next.next != null){
                slow =slow.next;
                first =first.next.next;

            }
            return slow ;
        }

    
        
    }
    public static void main(String[] args) {
        linkedlist ll =new linkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(7);
        ll.display();
        node middle =ll.midddleLinked();
        System.out.println("the middle node is"+middle.data);
    }
    
}
