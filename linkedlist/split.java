public class split {
    public static  class node{
        int data;
        node next;
        node(int data){
            this.data =data;
        }

    }
    public static class linkedlist{
        node head = null;
        node tail =null;
         node oddhead = new node(100);
         node evenHead = new node(30);
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
        void display(node heads){
            node temp =heads;
            while(temp != null){
                System.out.println(temp.data);
                temp =temp.next;
            }

        }
        node split(){
            node temp =head;
           
            node tempo =oddhead;
            
            node tempe =evenHead;
            while(temp !=null){
                if(temp.data %2 !=0){
                    node temp1 =new node(temp.data);
                     tempo.next =temp1;
                     tempo =tempo.next;
                     temp =temp.next;

                     
                     
                }
                else{
                    node temp2 =new node(temp.data);
                    tempe.next =temp2;
                    tempe =tempe.next;
                    temp =temp.next;
                }

            }
            return oddhead.next;
        }

    }
    public static void main(String[] args) {
        linkedlist ll =new linkedlist();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);

        
        node oddhead =ll.split();
        ll.display(oddhead);
        System.out.println();
        node evenhead =ll.evenHead.next;
        ll.display(evenhead);

       
    }
    
}
