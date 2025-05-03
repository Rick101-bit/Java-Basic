
//write a program where return the nth nod efrom the end but using only one teraversal using slow first 

public class program2{
    public static class node{
        int data ;
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
                head = temp;

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
        node fetchNode(int n){
           node temp =head;
           node slow =temp;
           node fast =temp;
           for(int i =1;i<=n;i++){
            fast =fast.next;
            
           }
           while(fast!=null){
            slow =slow.next;
            fast =fast.next;
           }
           return slow;

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
         node a =ll.fetchNode(2);
        System.out.println("the node is "+a.data);
    }

    

    
}
