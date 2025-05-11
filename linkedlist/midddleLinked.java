public class midddleLinked {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data =data;

        }
    }
    public static class linkedlist {
        node head =null;
        node tail = null;
        void insertAtEnd(int data){
            node temp =new node(data);
            if(head ==null){
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
        int length(){
            node temp =head;
            int count =0;
            while(temp != null){
                count++;
                temp =temp.next;

            }
            return count;
        }
        node middleNode(){
            System.out.println("hi");
            int len =length();
            System.out.println(len);
           int n =len /2;
           node temp =head;
            
            System.out.println(n);
            for(int i=1;i<=n;i++){
                temp =temp.next;

            }
            return temp;
        }

    
        
    }
    public static void main(String[] args) {
        linkedlist ll =new linkedlist();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display();
        node middle = ll.middleNode();
        System.out.println("now the moddle nosde is");
        System.out.println(middle.data);
    }
    
}
